package jf;

import ag.j2;
import ag.q1;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import j$.util.concurrent.ConcurrentHashMap;
import j7.l1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi0;
public final class g {
    public static int A;
    public static j2 B;
    public static boolean v;
    public static volatile boolean f11591x;
    public static ThreadPoolExecutor f11593z;
    public final BitmapDrawable f11594a;
    public final int f11595b;
    public final int f11596c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f11597e;
    public final boolean f11598f;
    public byte[] f11599g;
    public final Object h;
    public int f11600i;
    public boolean f11601j;
    public volatile boolean f11602k;
    public final int f11603l;
    public final File f11604m;
    public int f11605n;
    public final AtomicBoolean f11606o;
    public final q1 f11607p;
    public volatile boolean f11608q;
    public volatile boolean f11609r;
    public RandomAccessFile f11610s;
    public BitmapFactory.Options f11611t;
    public Bitmap f11612u;
    public static final ConcurrentHashMap f11590w = new ConcurrentHashMap();
    public static final int f11592y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public g(File file, e eVar, ie.i iVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f11597e = arrayList;
        this.h = new Object();
        this.f11606o = new AtomicBoolean(false);
        this.f11607p = new q1(this, 26);
        this.f11594a = (BitmapDrawable) eVar;
        this.f11595b = i10;
        this.f11596c = i11;
        this.f11603l = iVar.f8922a;
        String name = file.getName();
        if (f11593z == null) {
            int i13 = f11592y;
            f11593z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        boolean z11 = true;
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
        if (z10) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i12 != 0) {
            str2 = l1.k(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a4.w.q(sb2, str2, ".pcache2"));
        this.f11604m = file3;
        this.f11598f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f11602k = file3.exists();
            try {
                if (this.f11602k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f11608q = randomAccessFile.readBoolean();
                            if (this.f11608q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f11608q = false;
                                    this.f11602k = false;
                                    file3.delete();
                                } else {
                                    if (this.f11610s != randomAccessFile) {
                                        a();
                                    }
                                    this.f11610s = randomAccessFile;
                                }
                            }
                            if (this.f11610s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f11604m.delete();
                                this.f11602k = false;
                                if (this.f11610s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f11610s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else {
            this.f11602k = false;
            this.f11608q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            xi0.P0.postRunnable(new ag.o0(8));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f11610s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: jf.g.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                f fVar = new f(i11);
                fVar.f11584c = wrap.getInt();
                fVar.f11583b = wrap.getInt();
                this.f11597e.add(fVar);
            }
        }
    }

    public final byte[] e(f fVar) {
        boolean z10;
        byte[] bArr;
        if (this.f11598f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f11590w.get(Thread.currentThread());
        } else {
            bArr = this.f11599g;
        }
        if (bArr != null && bArr.length >= fVar.f11583b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (fVar.f11583b * 1.3f)];
        if (z10) {
            f11590w.put(Thread.currentThread(), bArr2);
            if (!f11591x) {
                f11591x = true;
                AndroidUtilities.runOnUIThread(this.f11607p, 5000L);
            }
            return bArr2;
        }
        this.f11599g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: jf.g.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f11608q && this.f11602k) {
            return false;
        }
        return true;
    }
}
