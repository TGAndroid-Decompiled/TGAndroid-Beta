package kf;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gj0;
public final class g {
    public static int A;
    public static b4.e0 B;
    public static boolean v;
    public static volatile boolean f10426x;
    public static ThreadPoolExecutor f10428z;
    public final BitmapDrawable f10429a;
    public final int f10430b;
    public final int f10431c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f10432f;
    public byte[] f10433g;
    public final Object h;
    public int f10434i;
    public boolean f10435j;
    public volatile boolean f10436k;
    public final int f10437l;
    public final File f10438m;
    public int f10439n;
    public final AtomicBoolean f10440o;
    public final androidx.activity.i f10441p;
    public volatile boolean f10442q;
    public volatile boolean f10443r;
    public RandomAccessFile f10444s;
    public BitmapFactory.Options f10445t;
    public Bitmap f10446u;
    public static final ConcurrentHashMap f10425w = new ConcurrentHashMap();
    public static final int f10427y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public g(File file, e eVar, ke.i iVar, int i10, int i11, boolean z4, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f10440o = new AtomicBoolean(false);
        this.f10441p = new androidx.activity.i(this, 25);
        this.f10429a = (BitmapDrawable) eVar;
        this.f10430b = i10;
        this.f10431c = i11;
        this.f10437l = iVar.f10347a;
        String name = file.getName();
        if (f10428z == null) {
            int i13 = f10427y;
            f10428z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = k0.j(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, android.support.v4.media.a.r(sb, str2, ".pcache2"));
        this.f10438m = file3;
        this.f10432f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f10436k = file3.exists();
            try {
                if (this.f10436k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f10442q = randomAccessFile.readBoolean();
                            if (this.f10442q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f10442q = false;
                                    this.f10436k = false;
                                    file3.delete();
                                } else {
                                    if (this.f10444s != randomAccessFile) {
                                        a();
                                    }
                                    this.f10444s = randomAccessFile;
                                }
                            }
                            if (this.f10444s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f10438m.delete();
                                this.f10436k = false;
                                if (this.f10444s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f10444s != randomAccessFile && randomAccessFile != null) {
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
            this.f10436k = false;
            this.f10442q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            gj0.Q0.postRunnable(new cg.n0(7));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f10444s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: kf.g.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                f fVar = new f(i11);
                fVar.f10420c = wrap.getInt();
                fVar.f10419b = wrap.getInt();
                this.e.add(fVar);
            }
        }
    }

    public final byte[] e(f fVar) {
        boolean z4;
        byte[] bArr;
        if (this.f10432f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            bArr = (byte[]) f10425w.get(Thread.currentThread());
        } else {
            bArr = this.f10433g;
        }
        if (bArr != null && bArr.length >= fVar.f10419b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (fVar.f10419b * 1.3f)];
        if (z4) {
            f10425w.put(Thread.currentThread(), bArr2);
            if (!f10426x) {
                f10426x = true;
                AndroidUtilities.runOnUIThread(this.f10441p, 5000L);
            }
            return bArr2;
        }
        this.f10433g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: kf.g.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f10442q && this.f10436k) {
            return false;
        }
        return true;
    }
}
