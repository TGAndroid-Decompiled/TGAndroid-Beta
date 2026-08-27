package gf;

import ag.l3;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oi0;

public final class h {
    public static int A;
    public static b6.a B;
    public static boolean v;

    public static volatile boolean f6977x;

    public static ThreadPoolExecutor f6979z;

    public final BitmapDrawable f6980a;

    public final int f6981b;

    public final int f6982c;
    public final AtomicInteger d = new AtomicInteger(0);

    public final ArrayList f6983e;

    public final boolean f6984f;

    public byte[] f6985g;
    public final Object h;

    public int f6986i;

    public boolean f6987j;

    public volatile boolean f6988k;

    public final int f6989l;

    public final File f6990m;

    public int f6991n;

    public final AtomicBoolean f6992o;

    public final a8.b f6993p;

    public volatile boolean f6994q;

    public volatile boolean f6995r;

    public RandomAccessFile f6996s;

    public BitmapFactory.Options f6997t;

    public Bitmap f6998u;

    public static final ConcurrentHashMap f6976w = new ConcurrentHashMap();

    public static final int f6978y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public h(File file, f fVar, ge.i iVar, int i10, int i11, boolean z10, int i12) {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f6983e = arrayList;
        this.h = new Object();
        this.f6992o = new AtomicBoolean(false);
        this.f6993p = new a8.b(this, 20);
        this.f6980a = (BitmapDrawable) fVar;
        this.f6981b = i10;
        this.f6982c = i11;
        this.f6989l = iVar.f6885a;
        String name = file.getName();
        if (f6979z == null) {
            int i13 = f6978y;
            f6979z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i11);
        sb2.append(z10 ? "_nolimit" : " ");
        File file3 = new File(file2, a9.p.p(sb2, i12 != 0 ? i0.a.k(i12, "_fitz") : "", ".pcache2"));
        this.f6990m = file3;
        this.f6984f = i10 < AndroidUtilities.dp(60.0f) && i11 < AndroidUtilities.dp(60.0f);
        if (SharedConfig.getDevicePerformanceClass() < 2) {
            this.f6988k = false;
            this.f6994q = false;
            return;
        }
        this.f6988k = file3.exists();
        if (!this.f6988k) {
            return;
        }
        try {
            try {
                randomAccessFile = new RandomAccessFile(file3, "r");
                try {
                    this.f6994q = randomAccessFile.readBoolean();
                    if (this.f6994q && arrayList.isEmpty()) {
                        randomAccessFile.seek(randomAccessFile.readInt());
                        int i14 = randomAccessFile.readInt();
                        d(randomAccessFile, i14 > 10000 ? 0 : i14);
                        if (arrayList.size() == 0) {
                            this.f6994q = false;
                            this.f6988k = false;
                            file3.delete();
                        } else {
                            if (this.f6996s != randomAccessFile) {
                                a();
                            }
                            this.f6996s = randomAccessFile;
                        }
                    }
                    if (this.f6996s != randomAccessFile) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        this.f6990m.delete();
                        this.f6988k = false;
                        if (this.f6996s == randomAccessFile || randomAccessFile == null) {
                            return;
                        }
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        try {
                            if (this.f6996s == randomAccessFile || randomAccessFile == null) {
                                throw th2;
                            }
                            randomAccessFile.close();
                            throw th2;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                            throw th2;
                        }
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            oi0.P0.postRunnable(new l3(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f6996s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
    }

    public final void b() {
        RandomAccessFile randomAccessFile;
        Bitmap[] bitmapArr;
        d0[] d0VarArr;
        CountDownLatch[] countDownLatchArr;
        ArrayList arrayList;
        AtomicBoolean atomicBoolean;
        int i10;
        int i11;
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        Bitmap bitmap;
        int i12;
        int i13;
        CountDownLatch countDownLatch3;
        try {
            try {
                if (this.f6990m.exists()) {
                    RandomAccessFile randomAccessFile2 = null;
                    try {
                        try {
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.f6990m, "r");
                            try {
                                this.f6994q = randomAccessFile3.readBoolean();
                                if (this.f6994q) {
                                    this.f6983e.clear();
                                    randomAccessFile3.seek(randomAccessFile3.readInt());
                                    int i14 = randomAccessFile3.readInt();
                                    if (i14 > 10000) {
                                        i14 = 0;
                                    }
                                    if (i14 > 0) {
                                        d(randomAccessFile3, i14);
                                        randomAccessFile3.seek(0L);
                                        if (this.f6996s != randomAccessFile3) {
                                            a();
                                        }
                                        this.f6996s = randomAccessFile3;
                                        this.f6988k = true;
                                        if (this.f6996s != randomAccessFile3) {
                                            try {
                                                randomAccessFile3.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } else {
                                        this.f6988k = false;
                                        this.f6994q = false;
                                    }
                                }
                                if (!this.f6994q) {
                                    this.f6990m.delete();
                                }
                                if (this.f6996s != randomAccessFile3) {
                                    randomAccessFile3.close();
                                }
                                while (true) {
                                    countDownLatch = countDownLatchArr[i10];
                                    if (countDownLatch != null) {
                                        try {
                                            countDownLatch.await();
                                        } catch (InterruptedException e9) {
                                            e9.printStackTrace();
                                        }
                                    }
                                    if (!this.f6992o.get() || atomicBoolean.get()) {
                                        break;
                                        break;
                                    }
                                    if (this.f6980a.a(bitmapArr[i10]) != 1) {
                                        for (i12 = 0; i12 < f6978y; i12++) {
                                            countDownLatch3 = countDownLatchArr[i12];
                                            if (countDownLatch3 != null) {
                                                try {
                                                    countDownLatch3.await();
                                                } catch (InterruptedException e10) {
                                                    e10.printStackTrace();
                                                }
                                            }
                                        }
                                        int length = (int) randomAccessFile.length();
                                        Collections.sort(arrayList, Comparator$CC.comparingInt(new d(0)));
                                        d0VarArr[0].b();
                                        int size = arrayList.size();
                                        d0VarArr[0].c(size);
                                        for (i13 = 0; i13 < arrayList.size(); i13++) {
                                            d0VarArr[0].c(((g) arrayList.get(i13)).f6970c);
                                            d0VarArr[0].c(((g) arrayList.get(i13)).f6969b);
                                        }
                                        randomAccessFile.write(d0VarArr[0].f6961a, 0, (size * 8) + 4);
                                        d0VarArr[0].b();
                                        randomAccessFile.seek(0L);
                                        randomAccessFile.writeBoolean(true);
                                        randomAccessFile.writeInt(length);
                                        atomicBoolean.set(true);
                                        randomAccessFile.close();
                                        this.f6983e.clear();
                                        this.f6983e.addAll(arrayList);
                                        a();
                                        this.f6996s = new RandomAccessFile(this.f6990m, "r");
                                        this.f6994q = true;
                                        this.f6988k = true;
                                        this.f6980a.c();
                                        return;
                                    }
                                    countDownLatchArr[i10] = new CountDownLatch(1);
                                    f6979z.execute(new c(this, atomicBoolean, bitmapArr, i10, d0VarArr, i11, randomAccessFile, arrayList, countDownLatchArr));
                                    i10++;
                                    i11++;
                                    if (i10 >= f6978y) {
                                        i10 = 0;
                                    }
                                    this.d.set(i11);
                                }
                            } catch (Throwable unused2) {
                                randomAccessFile2 = randomAccessFile3;
                                try {
                                    this.f6990m.delete();
                                    while (true) {
                                        countDownLatch = countDownLatchArr[i10];
                                        if (countDownLatch != null) {
                                            countDownLatch.await();
                                        }
                                        if (!this.f6992o.get()) {
                                            break;
                                        }
                                        if (this.f6980a.a(bitmapArr[i10]) != 1) {
                                            while (i12 < f6978y) {
                                                countDownLatch3 = countDownLatchArr[i12];
                                                if (countDownLatch3 != null) {
                                                    countDownLatch3.await();
                                                }
                                            }
                                            int length2 = (int) randomAccessFile.length();
                                            Collections.sort(arrayList, Comparator$CC.comparingInt(new d(0)));
                                            d0VarArr[0].b();
                                            int size2 = arrayList.size();
                                            d0VarArr[0].c(size2);
                                            while (i13 < arrayList.size()) {
                                                d0VarArr[0].c(((g) arrayList.get(i13)).f6970c);
                                                d0VarArr[0].c(((g) arrayList.get(i13)).f6969b);
                                            }
                                            randomAccessFile.write(d0VarArr[0].f6961a, 0, (size2 * 8) + 4);
                                            d0VarArr[0].b();
                                            randomAccessFile.seek(0L);
                                            randomAccessFile.writeBoolean(true);
                                            randomAccessFile.writeInt(length2);
                                            atomicBoolean.set(true);
                                            randomAccessFile.close();
                                            this.f6983e.clear();
                                            this.f6983e.addAll(arrayList);
                                            a();
                                            this.f6996s = new RandomAccessFile(this.f6990m, "r");
                                            this.f6994q = true;
                                            this.f6988k = true;
                                            this.f6980a.c();
                                            return;
                                        }
                                        countDownLatchArr[i10] = new CountDownLatch(1);
                                        f6979z.execute(new c(this, atomicBoolean, bitmapArr, i10, d0VarArr, i11, randomAccessFile, arrayList, countDownLatchArr));
                                        i10++;
                                        i11++;
                                        if (i10 >= f6978y) {
                                            i10 = 0;
                                        }
                                        this.d.set(i11);
                                    }
                                } catch (Throwable unused3) {
                                }
                                if (this.f6996s != randomAccessFile2 && randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                randomAccessFile = new RandomAccessFile(this.f6990m, "rw");
                                if (B == null) {
                                    B = new b6.a(8, (byte) 0);
                                }
                                B.a(this.f6982c, this.f6981b);
                                b6.a aVar = B;
                                bitmapArr = (Bitmap[]) aVar.d;
                                d0VarArr = (d0[]) aVar.f2033b;
                                countDownLatchArr = new CountDownLatch[f6978y];
                                arrayList = new ArrayList();
                                randomAccessFile.writeBoolean(false);
                                randomAccessFile.writeInt(0);
                                atomicBoolean = new AtomicBoolean(false);
                                this.f6980a.b();
                                i10 = 0;
                                i11 = 0;
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("cancelled cache generation");
                                }
                                atomicBoolean.set(true);
                                for (int i15 = 0; i15 < f6978y; i15++) {
                                    countDownLatch2 = countDownLatchArr[i15];
                                    if (countDownLatch2 != null) {
                                        try {
                                            countDownLatch2.await();
                                        } catch (InterruptedException e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    bitmap = bitmapArr[i15];
                                    if (bitmap != null) {
                                        try {
                                            bitmap.recycle();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                }
                                randomAccessFile.close();
                                this.f6980a.c();
                                this.f6980a.c();
                            }
                        } catch (Throwable unused5) {
                        }
                    } catch (Throwable unused6) {
                    }
                    randomAccessFile = new RandomAccessFile(this.f6990m, "rw");
                    if (B == null) {
                        B = new b6.a(8, (byte) 0);
                    }
                    B.a(this.f6982c, this.f6981b);
                    b6.a aVar2 = B;
                    bitmapArr = (Bitmap[]) aVar2.d;
                    d0VarArr = (d0[]) aVar2.f2033b;
                    countDownLatchArr = new CountDownLatch[f6978y];
                    arrayList = new ArrayList();
                    randomAccessFile.writeBoolean(false);
                    randomAccessFile.writeInt(0);
                    atomicBoolean = new AtomicBoolean(false);
                    this.f6980a.b();
                    i10 = 0;
                    i11 = 0;
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("cancelled cache generation");
                    }
                    atomicBoolean.set(true);
                    while (i15 < f6978y) {
                        countDownLatch2 = countDownLatchArr[i15];
                        if (countDownLatch2 != null) {
                            countDownLatch2.await();
                        }
                        bitmap = bitmapArr[i15];
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                    randomAccessFile.close();
                    this.f6980a.c();
                } else {
                    randomAccessFile = new RandomAccessFile(this.f6990m, "rw");
                    if (B == null) {
                        B = new b6.a(8, (byte) 0);
                    }
                    B.a(this.f6982c, this.f6981b);
                    b6.a aVar3 = B;
                    bitmapArr = (Bitmap[]) aVar3.d;
                    d0VarArr = (d0[]) aVar3.f2033b;
                    countDownLatchArr = new CountDownLatch[f6978y];
                    arrayList = new ArrayList();
                    randomAccessFile.writeBoolean(false);
                    randomAccessFile.writeInt(0);
                    atomicBoolean = new AtomicBoolean(false);
                    this.f6980a.b();
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        countDownLatch = countDownLatchArr[i10];
                        if (countDownLatch != null) {
                            countDownLatch.await();
                        }
                        if (!this.f6992o.get()) {
                            break;
                            break;
                        }
                        if (this.f6980a.a(bitmapArr[i10]) != 1) {
                            while (i12 < f6978y) {
                                countDownLatch3 = countDownLatchArr[i12];
                                if (countDownLatch3 != null) {
                                    countDownLatch3.await();
                                }
                            }
                            int length3 = (int) randomAccessFile.length();
                            Collections.sort(arrayList, Comparator$CC.comparingInt(new d(0)));
                            d0VarArr[0].b();
                            int size3 = arrayList.size();
                            d0VarArr[0].c(size3);
                            while (i13 < arrayList.size()) {
                                d0VarArr[0].c(((g) arrayList.get(i13)).f6970c);
                                d0VarArr[0].c(((g) arrayList.get(i13)).f6969b);
                            }
                            randomAccessFile.write(d0VarArr[0].f6961a, 0, (size3 * 8) + 4);
                            d0VarArr[0].b();
                            randomAccessFile.seek(0L);
                            randomAccessFile.writeBoolean(true);
                            randomAccessFile.writeInt(length3);
                            atomicBoolean.set(true);
                            randomAccessFile.close();
                            this.f6983e.clear();
                            this.f6983e.addAll(arrayList);
                            a();
                            this.f6996s = new RandomAccessFile(this.f6990m, "r");
                            this.f6994q = true;
                            this.f6988k = true;
                            this.f6980a.c();
                            return;
                        }
                        countDownLatchArr[i10] = new CountDownLatch(1);
                        f6979z.execute(new c(this, atomicBoolean, bitmapArr, i10, d0VarArr, i11, randomAccessFile, arrayList, countDownLatchArr));
                        i10++;
                        i11++;
                        if (i10 >= f6978y) {
                            i10 = 0;
                        }
                        this.d.set(i11);
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("cancelled cache generation");
                    }
                    atomicBoolean.set(true);
                    while (i15 < f6978y) {
                        countDownLatch2 = countDownLatchArr[i15];
                        if (countDownLatch2 != null) {
                            countDownLatch2.await();
                        }
                        bitmap = bitmapArr[i15];
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                    randomAccessFile.close();
                    this.f6980a.c();
                }
                this.f6980a.c();
            } catch (Throwable th) {
                this.f6980a.c();
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e12.printStackTrace();
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) throws IOException {
        if (i10 == 0) {
            return;
        }
        byte[] bArr = new byte[i10 * 8];
        randomAccessFile.read(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        for (int i11 = 0; i11 < i10; i11++) {
            g gVar = new g(i11);
            gVar.f6970c = byteBufferWrap.getInt();
            gVar.f6969b = byteBufferWrap.getInt();
            this.f6983e.add(gVar);
        }
    }

    public final byte[] e(g gVar) {
        boolean z10 = this.f6984f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_");
        byte[] bArr = z10 ? (byte[]) f6976w.get(Thread.currentThread()) : this.f6985g;
        if (bArr != null && bArr.length >= gVar.f6969b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (gVar.f6969b * 1.3f)];
        if (!z10) {
            this.f6985g = bArr2;
            return bArr2;
        }
        f6976w.put(Thread.currentThread(), bArr2);
        if (!f6977x) {
            f6977x = true;
            AndroidUtilities.runOnUIThread(this.f6993p, 5000L);
        }
        return bArr2;
    }

    public final int f(Bitmap bitmap, int i10) {
        RandomAccessFile randomAccessFile;
        if (!this.f6987j) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.f6994q || this.f6988k) {
                    if (!this.f6994q || (randomAccessFile = this.f6996s) == null) {
                        randomAccessFile = new RandomAccessFile(this.f6990m, "r");
                        try {
                            this.f6994q = randomAccessFile.readBoolean();
                            if (this.f6994q && this.f6983e.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                d(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.f6983e.size() == 0) {
                                this.f6994q = false;
                            }
                            if (!this.f6994q) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile;
                            if (this.f6987j && randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = randomAccessFile;
                            FileLog.e(th, false);
                            int i11 = this.f6991n + 1;
                            this.f6991n = i11;
                            if (i11 > 10) {
                                this.f6987j = true;
                            }
                            if (this.f6987j) {
                                randomAccessFile2.close();
                            }
                        }
                    }
                    if (this.f6983e.size() != 0) {
                        g gVar = (g) this.f6983e.get(Utilities.clamp(i10, this.f6983e.size() - 1, 0));
                        randomAccessFile.seek(gVar.f6970c);
                        byte[] bArrE = e(gVar);
                        randomAccessFile.readFully(bArrE, 0, gVar.f6969b);
                        if (this.f6995r) {
                            this.f6996s = null;
                            randomAccessFile.close();
                        } else {
                            if (this.f6996s != randomAccessFile) {
                                a();
                            }
                            this.f6996s = randomAccessFile;
                        }
                        if (this.f6997t == null) {
                            this.f6997t = new BitmapFactory.Options();
                        }
                        boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
                        if (z10) {
                            Bitmap bitmap2 = this.f6998u;
                            if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.f6998u.getHeight() != bitmap.getHeight()) {
                                this.f6998u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            }
                            this.f6997t.inBitmap = this.f6998u;
                        } else {
                            this.f6997t.inBitmap = bitmap;
                        }
                        BitmapFactory.decodeByteArray(bArrE, 0, gVar.f6969b, this.f6997t);
                        if (z10) {
                            Utilities.extractAlpha(this.f6998u, bitmap);
                        }
                        this.f6997t.inBitmap = null;
                        return 0;
                    }
                }
            } catch (FileNotFoundException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    public final boolean g() {
        return (this.f6994q && this.f6988k) ? false : true;
    }
}
