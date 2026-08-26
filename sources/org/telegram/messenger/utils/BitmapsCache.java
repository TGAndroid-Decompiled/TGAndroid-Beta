package org.telegram.messenger.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.common.base.Splitter;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda166;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class BitmapsCache {
    public static ThreadPoolExecutor bitmapCompressExecutor;
    public static volatile boolean cleanupScheduled;
    public static boolean mkdir;
    public static Splitter sharedTools;
    public static int taskCounter;
    public byte[] bufferTmp;
    public volatile boolean cacheCreated;
    public RandomAccessFile cachedFile;
    public final AtomicBoolean cancelled;
    public final LiveData.AnonymousClass1 cleanupSharedBuffers;
    public final int compressQuality;
    public boolean error;
    public final File file;
    public volatile boolean fileExist;
    public int frameIndex;
    public final ArrayList frameOffsets;
    public final AtomicInteger framesProcessed = new AtomicInteger(0);
    public final int h;
    public final Object mutex;
    public BitmapFactory.Options options;
    public volatile boolean recycled;
    public final BitmapDrawable source;
    public Bitmap tmpRgbaBitmap;
    public int tryCount;
    public final boolean useSharedBuffers;
    public final int w;
    public static final ConcurrentHashMap sharedBuffers = new ConcurrentHashMap();
    public static final int N = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public final class CacheOptions {
        public int compressQuality = 100;
        public boolean fallback = false;
        public boolean firstFrame;
    }

    public interface Cacheable {
        int getNextFrame(Bitmap bitmap);

        void prepareForGenerateCache();

        void releaseForGenerateCache();
    }

    public final class FrameOffset {
        public int frameOffset;
        public int frameSize;
        public final int index;

        public FrameOffset(int i) {
            this.index = i;
        }
    }

    public final class Metadata {
        public int frame;
    }

    public BitmapsCache(File file, Cacheable cacheable, CacheOptions cacheOptions, int i, int i2, boolean z, int i3) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.frameOffsets = arrayList;
        this.mutex = new Object();
        this.cancelled = new AtomicBoolean(false);
        this.cleanupSharedBuffers = new LiveData.AnonymousClass1(this, 25);
        this.source = (BitmapDrawable) cacheable;
        this.w = i;
        this.h = i2;
        this.compressQuality = cacheOptions.compressQuality;
        String name = file.getName();
        if (bitmapCompressExecutor == null) {
            int i4 = N;
            bitmapCompressExecutor = new ThreadPoolExecutor(i4, i4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        if (!mkdir) {
            file2.mkdir();
            mkdir = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append(z ? "_nolimit" : " ");
        File file3 = new File(file2, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, i3 != 0 ? DiffUtil.m(i3, "_fitz") : "", ".pcache2"));
        this.file = file3;
        this.useSharedBuffers = i < AndroidUtilities.dp(60.0f) && i2 < AndroidUtilities.dp(60.0f);
        if (SharedConfig.getDevicePerformanceClass() < 2) {
            this.fileExist = false;
            this.cacheCreated = false;
            return;
        }
        this.fileExist = file3.exists();
        if (!this.fileExist) {
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file3, "r");
            try {
                this.cacheCreated = randomAccessFile.readBoolean();
                if (this.cacheCreated && arrayList.isEmpty()) {
                    randomAccessFile.seek(randomAccessFile.readInt());
                    int i5 = randomAccessFile.readInt();
                    fillFrames(randomAccessFile, i5 > 10000 ? 0 : i5);
                    if (arrayList.size() == 0) {
                        this.cacheCreated = false;
                        this.fileExist = false;
                        file3.delete();
                    } else {
                        RandomAccessFile randomAccessFile2 = this.cachedFile;
                        if (randomAccessFile2 != randomAccessFile && randomAccessFile2 != null) {
                            try {
                                randomAccessFile2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        this.cachedFile = randomAccessFile;
                    }
                }
                try {
                    if (this.cachedFile != randomAccessFile) {
                        randomAccessFile.close();
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    this.file.delete();
                    this.fileExist = false;
                } finally {
                    try {
                        if (this.cachedFile != randomAccessFile && randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void decrementTaskCounter() {
        int i = taskCounter - 1;
        taskCounter = i;
        if (i <= 0) {
            taskCounter = 0;
            RLottieDrawable.lottieCacheGenerateQueue.postRunnable(new GiftSheet$$ExternalSyntheticLambda2(2));
        }
    }

    public final void createCache() {
        RandomAccessFile randomAccessFile;
        Bitmap[] bitmapArr;
        ImmutableByteArrayOutputStream[] immutableByteArrayOutputStreamArr;
        CountDownLatch[] countDownLatchArr;
        ArrayList arrayList;
        AtomicBoolean atomicBoolean;
        int i;
        int i2;
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        Bitmap bitmap;
        int i3;
        int i4;
        RandomAccessFile randomAccessFile2;
        CountDownLatch countDownLatch3;
        RandomAccessFile randomAccessFile3;
        try {
            try {
                try {
                    if (this.file.exists()) {
                        try {
                            randomAccessFile3 = new RandomAccessFile(this.file, "r");
                            try {
                                this.cacheCreated = randomAccessFile3.readBoolean();
                                if (this.cacheCreated) {
                                    this.frameOffsets.clear();
                                    randomAccessFile3.seek(randomAccessFile3.readInt());
                                    int i5 = randomAccessFile3.readInt();
                                    if (i5 > 10000) {
                                        i5 = 0;
                                    }
                                    if (i5 > 0) {
                                        fillFrames(randomAccessFile3, i5);
                                        randomAccessFile3.seek(0L);
                                        RandomAccessFile randomAccessFile4 = this.cachedFile;
                                        if (randomAccessFile4 != randomAccessFile3 && randomAccessFile4 != null) {
                                            try {
                                                randomAccessFile4.close();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        this.cachedFile = randomAccessFile3;
                                        this.fileExist = true;
                                        if (this.cachedFile != randomAccessFile3) {
                                            try {
                                                randomAccessFile3.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        this.source.releaseForGenerateCache();
                                        return;
                                    }
                                    this.fileExist = false;
                                    this.cacheCreated = false;
                                }
                                if (!this.cacheCreated) {
                                    this.file.delete();
                                }
                                if (this.cachedFile != randomAccessFile3) {
                                    randomAccessFile3.close();
                                }
                            } catch (Throwable unused2) {
                                try {
                                    this.file.delete();
                                    while (true) {
                                        countDownLatch = countDownLatchArr[i];
                                        if (countDownLatch != null) {
                                            try {
                                                countDownLatch.await();
                                            } catch (InterruptedException e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                        if (!this.cancelled.get()) {
                                            break;
                                        }
                                        if (this.source.getNextFrame(bitmapArr[i]) != 1) {
                                            for (i3 = 0; i3 < N; i3++) {
                                                countDownLatch3 = countDownLatchArr[i3];
                                                if (countDownLatch3 != null) {
                                                    try {
                                                        countDownLatch3.await();
                                                    } catch (InterruptedException e3) {
                                                        e3.printStackTrace();
                                                    }
                                                }
                                            }
                                            int length = (int) randomAccessFile.length();
                                            Collections.sort(arrayList, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(1)));
                                            immutableByteArrayOutputStreamArr[0].reset();
                                            int size = arrayList.size();
                                            immutableByteArrayOutputStreamArr[0].writeInt(size);
                                            for (i4 = 0; i4 < arrayList.size(); i4++) {
                                                immutableByteArrayOutputStreamArr[0].writeInt(((FrameOffset) arrayList.get(i4)).frameOffset);
                                                immutableByteArrayOutputStreamArr[0].writeInt(((FrameOffset) arrayList.get(i4)).frameSize);
                                            }
                                            randomAccessFile.write(immutableByteArrayOutputStreamArr[0].buf, 0, (size * 8) + 4);
                                            immutableByteArrayOutputStreamArr[0].reset();
                                            randomAccessFile.seek(0L);
                                            randomAccessFile.writeBoolean(true);
                                            randomAccessFile.writeInt(length);
                                            atomicBoolean.set(true);
                                            randomAccessFile.close();
                                            this.frameOffsets.clear();
                                            this.frameOffsets.addAll(arrayList);
                                            randomAccessFile2 = this.cachedFile;
                                            if (randomAccessFile2 != null) {
                                                try {
                                                    randomAccessFile2.close();
                                                } catch (IOException e4) {
                                                    e4.printStackTrace();
                                                }
                                            }
                                            this.cachedFile = new RandomAccessFile(this.file, "r");
                                            this.cacheCreated = true;
                                            this.fileExist = true;
                                            this.source.releaseForGenerateCache();
                                            return;
                                        }
                                        countDownLatchArr[i] = new CountDownLatch(1);
                                        bitmapCompressExecutor.execute(new MessagesStorage$$ExternalSyntheticLambda166(this, atomicBoolean, bitmapArr, i, immutableByteArrayOutputStreamArr, i2, randomAccessFile, arrayList, countDownLatchArr));
                                        i++;
                                        i2++;
                                        if (i >= N) {
                                            i = 0;
                                        }
                                        this.framesProcessed.set(i2);
                                    }
                                } catch (Throwable unused3) {
                                }
                                if (this.cachedFile != randomAccessFile3 && randomAccessFile3 != null) {
                                    randomAccessFile3.close();
                                }
                                randomAccessFile = new RandomAccessFile(this.file, "rw");
                                if (sharedTools == null) {
                                    sharedTools = new Splitter(18, (byte) 0);
                                }
                                sharedTools.allocate(this.h, this.w);
                                Splitter splitter = sharedTools;
                                bitmapArr = (Bitmap[]) splitter.strategy;
                                immutableByteArrayOutputStreamArr = (ImmutableByteArrayOutputStream[]) splitter.trimmer;
                                countDownLatchArr = new CountDownLatch[N];
                                arrayList = new ArrayList();
                                randomAccessFile.writeBoolean(false);
                                randomAccessFile.writeInt(0);
                                atomicBoolean = new AtomicBoolean(false);
                                this.source.prepareForGenerateCache();
                                i = 0;
                                i2 = 0;
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("cancelled cache generation");
                                }
                                atomicBoolean.set(true);
                                for (int i6 = 0; i6 < N; i6++) {
                                    countDownLatch2 = countDownLatchArr[i6];
                                    if (countDownLatch2 != null) {
                                        try {
                                            countDownLatch2.await();
                                        } catch (InterruptedException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    bitmap = bitmapArr[i6];
                                    if (bitmap != null) {
                                        try {
                                            bitmap.recycle();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                }
                                randomAccessFile.close();
                                this.source.releaseForGenerateCache();
                                this.source.releaseForGenerateCache();
                            }
                        } catch (Throwable unused5) {
                            randomAccessFile3 = null;
                        }
                    }
                    while (true) {
                        countDownLatch = countDownLatchArr[i];
                        if (countDownLatch != null) {
                            countDownLatch.await();
                        }
                        if (!this.cancelled.get() || atomicBoolean.get()) {
                            break;
                            break;
                        }
                        if (this.source.getNextFrame(bitmapArr[i]) != 1) {
                            while (i3 < N) {
                                countDownLatch3 = countDownLatchArr[i3];
                                if (countDownLatch3 != null) {
                                    countDownLatch3.await();
                                }
                            }
                            int length2 = (int) randomAccessFile.length();
                            Collections.sort(arrayList, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(1)));
                            immutableByteArrayOutputStreamArr[0].reset();
                            int size2 = arrayList.size();
                            immutableByteArrayOutputStreamArr[0].writeInt(size2);
                            while (i4 < arrayList.size()) {
                                immutableByteArrayOutputStreamArr[0].writeInt(((FrameOffset) arrayList.get(i4)).frameOffset);
                                immutableByteArrayOutputStreamArr[0].writeInt(((FrameOffset) arrayList.get(i4)).frameSize);
                            }
                            randomAccessFile.write(immutableByteArrayOutputStreamArr[0].buf, 0, (size2 * 8) + 4);
                            immutableByteArrayOutputStreamArr[0].reset();
                            randomAccessFile.seek(0L);
                            randomAccessFile.writeBoolean(true);
                            randomAccessFile.writeInt(length2);
                            atomicBoolean.set(true);
                            randomAccessFile.close();
                            this.frameOffsets.clear();
                            this.frameOffsets.addAll(arrayList);
                            randomAccessFile2 = this.cachedFile;
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            this.cachedFile = new RandomAccessFile(this.file, "r");
                            this.cacheCreated = true;
                            this.fileExist = true;
                            this.source.releaseForGenerateCache();
                            return;
                        }
                        countDownLatchArr[i] = new CountDownLatch(1);
                        bitmapCompressExecutor.execute(new MessagesStorage$$ExternalSyntheticLambda166(this, atomicBoolean, bitmapArr, i, immutableByteArrayOutputStreamArr, i2, randomAccessFile, arrayList, countDownLatchArr));
                        i++;
                        i2++;
                        if (i >= N) {
                            i = 0;
                        }
                        this.framesProcessed.set(i2);
                    }
                } catch (Throwable unused6) {
                }
                randomAccessFile = new RandomAccessFile(this.file, "rw");
                if (sharedTools == null) {
                    sharedTools = new Splitter(18, (byte) 0);
                }
                sharedTools.allocate(this.h, this.w);
                Splitter splitter2 = sharedTools;
                bitmapArr = (Bitmap[]) splitter2.strategy;
                immutableByteArrayOutputStreamArr = (ImmutableByteArrayOutputStream[]) splitter2.trimmer;
                countDownLatchArr = new CountDownLatch[N];
                arrayList = new ArrayList();
                randomAccessFile.writeBoolean(false);
                randomAccessFile.writeInt(0);
                atomicBoolean = new AtomicBoolean(false);
                this.source.prepareForGenerateCache();
                i = 0;
                i2 = 0;
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("cancelled cache generation");
                }
                atomicBoolean.set(true);
                while (i6 < N) {
                    countDownLatch2 = countDownLatchArr[i6];
                    if (countDownLatch2 != null) {
                        countDownLatch2.await();
                    }
                    bitmap = bitmapArr[i6];
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
                randomAccessFile.close();
                this.source.releaseForGenerateCache();
                this.source.releaseForGenerateCache();
            } catch (FileNotFoundException e6) {
                e6.printStackTrace();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (Throwable th) {
            this.source.releaseForGenerateCache();
            throw th;
        }
    }

    public final void fillFrames(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i == 0) {
            return;
        }
        byte[] bArr = new byte[i * 8];
        randomAccessFile.read(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            FrameOffset frameOffset = new FrameOffset(i2);
            frameOffset.frameOffset = byteBufferWrap.getInt();
            frameOffset.frameSize = byteBufferWrap.getInt();
            this.frameOffsets.add(frameOffset);
        }
    }

    public final byte[] getBuffer(FrameOffset frameOffset) {
        boolean z = this.useSharedBuffers && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_");
        byte[] bArr = z ? (byte[]) sharedBuffers.get(Thread.currentThread()) : this.bufferTmp;
        if (bArr != null && bArr.length >= frameOffset.frameSize) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (frameOffset.frameSize * 1.3f)];
        if (!z) {
            this.bufferTmp = bArr2;
            return bArr2;
        }
        sharedBuffers.put(Thread.currentThread(), bArr2);
        if (!cleanupScheduled) {
            cleanupScheduled = true;
            AndroidUtilities.runOnUIThread(this.cleanupSharedBuffers, 5000L);
        }
        return bArr2;
    }

    public final int getFrame(int i, Bitmap bitmap) {
        RandomAccessFile randomAccessFile;
        int i2;
        if (!this.error) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.cacheCreated || this.fileExist) {
                    if (!this.cacheCreated || (randomAccessFile = this.cachedFile) == null) {
                        randomAccessFile = new RandomAccessFile(this.file, "r");
                        try {
                            this.cacheCreated = randomAccessFile.readBoolean();
                            if (this.cacheCreated && this.frameOffsets.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                fillFrames(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.frameOffsets.size() == 0) {
                                this.cacheCreated = false;
                            }
                            if (!this.cacheCreated) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            if (this.error) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th, false);
                            i2 = this.tryCount + 1;
                            this.tryCount = i2;
                            if (i2 > 10) {
                                this.error = true;
                            }
                            if (this.error) {
                                randomAccessFile.close();
                            }
                        }
                    }
                    try {
                        try {
                            if (this.frameOffsets.size() != 0) {
                                FrameOffset frameOffset = (FrameOffset) this.frameOffsets.get(Utilities.clamp(i, this.frameOffsets.size() - 1, 0));
                                randomAccessFile.seek(frameOffset.frameOffset);
                                byte[] buffer = getBuffer(frameOffset);
                                randomAccessFile.readFully(buffer, 0, frameOffset.frameSize);
                                if (this.recycled) {
                                    this.cachedFile = null;
                                    randomAccessFile.close();
                                } else {
                                    RandomAccessFile randomAccessFile3 = this.cachedFile;
                                    if (randomAccessFile3 != randomAccessFile && randomAccessFile3 != null) {
                                        try {
                                            randomAccessFile3.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    this.cachedFile = randomAccessFile;
                                }
                                if (this.options == null) {
                                    this.options = new BitmapFactory.Options();
                                }
                                boolean z = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
                                if (z) {
                                    Bitmap bitmap2 = this.tmpRgbaBitmap;
                                    if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.tmpRgbaBitmap.getHeight() != bitmap.getHeight()) {
                                        this.tmpRgbaBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                                    }
                                    this.options.inBitmap = this.tmpRgbaBitmap;
                                } else {
                                    this.options.inBitmap = bitmap;
                                }
                                BitmapFactory.decodeByteArray(buffer, 0, frameOffset.frameSize, this.options);
                                if (z) {
                                    Utilities.extractAlpha(this.tmpRgbaBitmap, bitmap);
                                }
                                this.options.inBitmap = null;
                                return 0;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            FileLog.e(th, false);
                            i2 = this.tryCount + 1;
                            this.tryCount = i2;
                            if (i2 > 10) {
                                this.error = true;
                            }
                            if (this.error && randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                        }
                    } catch (FileNotFoundException unused2) {
                        randomAccessFile2 = randomAccessFile;
                        randomAccessFile = randomAccessFile2;
                        if (this.error) {
                            randomAccessFile.close();
                        }
                    }
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return -1;
    }
}
