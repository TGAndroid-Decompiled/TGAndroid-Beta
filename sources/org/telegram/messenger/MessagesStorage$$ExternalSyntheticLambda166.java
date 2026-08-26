package org.telegram.messenger;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.collection.LongSparseArray;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.ImmutableByteArrayOutputStream;

public final class MessagesStorage$$ExternalSyntheticLambda166 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final int f$1;
    public final ArrayList f$2;
    public final int f$3;
    public final Cloneable f$4;
    public final Object f$5;
    public final Serializable f$6;
    public final Object f$7;
    public final Object f$8;

    public MessagesStorage$$ExternalSyntheticLambda166(MessagesStorage messagesStorage, int i, ArrayList arrayList, int i2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$3 = i2;
        this.f$4 = longSparseArray;
        this.f$5 = longSparseArray2;
        this.f$6 = arrayList2;
        this.f$7 = arrayList3;
        this.f$8 = countDownLatch;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.f$8;
                ((MessagesStorage) this.f$0).lambda$getWidgetDialogs$169(this.f$1, this.f$2, this.f$3, (LongSparseArray) this.f$4, (LongSparseArray) this.f$5, (ArrayList) this.f$6, (ArrayList) this.f$7, countDownLatch);
                return;
            default:
                BitmapsCache bitmapsCache = (BitmapsCache) this.f$0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$6;
                Bitmap[] bitmapArr = (Bitmap[]) this.f$7;
                int i = this.f$1;
                ImmutableByteArrayOutputStream[] immutableByteArrayOutputStreamArr = (ImmutableByteArrayOutputStream[]) this.f$4;
                int i2 = this.f$3;
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f$5;
                ArrayList arrayList = this.f$2;
                CountDownLatch[] countDownLatchArr = (CountDownLatch[]) this.f$8;
                if (bitmapsCache.cancelled.get() || atomicBoolean.get()) {
                    return;
                }
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                if (Build.VERSION.SDK_INT <= 28) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                bitmapArr[i].compress(compressFormat, bitmapsCache.compressQuality, immutableByteArrayOutputStreamArr[i]);
                int i3 = immutableByteArrayOutputStreamArr[i].count;
                try {
                    synchronized (bitmapsCache.mutex) {
                        BitmapsCache.FrameOffset frameOffset = new BitmapsCache.FrameOffset(i2);
                        frameOffset.frameOffset = (int) randomAccessFile.length();
                        arrayList.add(frameOffset);
                        randomAccessFile.write(immutableByteArrayOutputStreamArr[i].buf, 0, i3);
                        frameOffset.frameSize = i3;
                        immutableByteArrayOutputStreamArr[i].reset();
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused) {
                    } finally {
                        atomicBoolean.set(true);
                    }
                }
                countDownLatchArr[i].countDown();
                return;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda166(BitmapsCache bitmapsCache, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i, ImmutableByteArrayOutputStream[] immutableByteArrayOutputStreamArr, int i2, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.f$0 = bitmapsCache;
        this.f$6 = atomicBoolean;
        this.f$7 = bitmapArr;
        this.f$1 = i;
        this.f$4 = immutableByteArrayOutputStreamArr;
        this.f$3 = i2;
        this.f$5 = randomAccessFile;
        this.f$2 = arrayList;
        this.f$8 = countDownLatchArr;
    }
}
