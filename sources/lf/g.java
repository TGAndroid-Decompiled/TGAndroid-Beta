package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import j$.util.concurrent.ConcurrentHashMap;
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
import kh.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gj0;
public final class g {
    public static int A;
    public static b4.e0 B;
    public static boolean v;
    public static volatile boolean f11984x;
    public static ThreadPoolExecutor f11986z;
    public final BitmapDrawable f11987a;
    public final int f11988b;
    public final int f11989c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f11990f;
    public byte[] f11991g;
    public final Object h;
    public int f11992i;
    public boolean f11993j;
    public volatile boolean f11994k;
    public final int f11995l;
    public final File f11996m;
    public int f11997n;
    public final AtomicBoolean f11998o;
    public final androidx.activity.i f11999p;
    public volatile boolean f12000q;
    public volatile boolean f12001r;
    public RandomAccessFile f12002s;
    public BitmapFactory.Options f12003t;
    public Bitmap f12004u;
    public static final ConcurrentHashMap f11983w = new ConcurrentHashMap();
    public static final int f11985y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public g(File file, e eVar, ke.i iVar, int i10, int i11, boolean z4, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f11998o = new AtomicBoolean(false);
        this.f11999p = new androidx.activity.i(this, 26);
        this.f11987a = (BitmapDrawable) eVar;
        this.f11988b = i10;
        this.f11989c = i11;
        this.f11995l = iVar.f10368a;
        String name = file.getName();
        if (f11986z == null) {
            int i13 = f11985y;
            f11986z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        boolean z10 = true;
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i10);
        sb.append("_");
        sb.append(i11);
        if (z4) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb.append(str);
        if (i12 != 0) {
            str2 = a2.j(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, android.support.v4.media.a.r(sb, str2, ".pcache2"));
        this.f11996m = file3;
        this.f11990f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f11994k = file3.exists();
            try {
                if (this.f11994k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f12000q = randomAccessFile.readBoolean();
                            if (this.f12000q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f12000q = false;
                                    this.f11994k = false;
                                    file3.delete();
                                } else {
                                    if (this.f12002s != randomAccessFile) {
                                        a();
                                    }
                                    this.f12002s = randomAccessFile;
                                }
                            }
                            if (this.f12002s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f11996m.delete();
                                this.f11994k = false;
                                if (this.f12002s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f12002s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        } else {
            this.f11994k = false;
            this.f12000q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            gj0.Q0.postRunnable(new cg.n0(8));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f12002s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: lf.g.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                f fVar = new f(i11);
                fVar.f11978c = wrap.getInt();
                fVar.f11977b = wrap.getInt();
                this.e.add(fVar);
            }
        }
    }

    public final byte[] e(f fVar) {
        boolean z4;
        byte[] bArr;
        if (this.f11990f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            bArr = (byte[]) f11983w.get(Thread.currentThread());
        } else {
            bArr = this.f11991g;
        }
        if (bArr != null && bArr.length >= fVar.f11977b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (fVar.f11977b * 1.3f)];
        if (z4) {
            f11983w.put(Thread.currentThread(), bArr2);
            if (!f11984x) {
                f11984x = true;
                AndroidUtilities.runOnUIThread(this.f11999p, 5000L);
            }
            return bArr2;
        }
        this.f11991g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: lf.g.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f12000q && this.f11994k) {
            return false;
        }
        return true;
    }
}
