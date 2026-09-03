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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hj0;
public final class g {
    public static int A;
    public static b4.e0 B;
    public static boolean v;
    public static volatile boolean f12427x;
    public static ThreadPoolExecutor f12429z;
    public final BitmapDrawable f12430a;
    public final int f12431b;
    public final int f12432c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f12433e;
    public final boolean f12434f;
    public byte[] f12435g;
    public final Object h;
    public int f12436i;
    public boolean f12437j;
    public volatile boolean f12438k;
    public final int f12439l;
    public final File f12440m;
    public int f12441n;
    public final AtomicBoolean f12442o;
    public final androidx.activity.i f12443p;
    public volatile boolean f12444q;
    public volatile boolean f12445r;
    public RandomAccessFile f12446s;
    public BitmapFactory.Options f12447t;
    public Bitmap f12448u;
    public static final ConcurrentHashMap f12426w = new ConcurrentHashMap();
    public static final int f12428y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public g(File file, e eVar, ke.i iVar, int i10, int i11, boolean z4, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f12433e = arrayList;
        this.h = new Object();
        this.f12442o = new AtomicBoolean(false);
        this.f12443p = new androidx.activity.i(this, 26);
        this.f12430a = (BitmapDrawable) eVar;
        this.f12431b = i10;
        this.f12432c = i11;
        this.f12439l = iVar.f11142a;
        String name = file.getName();
        if (f12429z == null) {
            int i13 = f12428y;
            f12429z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = l.d.j(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, android.support.v4.media.a.r(sb, str2, ".pcache2"));
        this.f12440m = file3;
        this.f12434f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f12438k = file3.exists();
            try {
                if (this.f12438k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f12444q = randomAccessFile.readBoolean();
                            if (this.f12444q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f12444q = false;
                                    this.f12438k = false;
                                    file3.delete();
                                } else {
                                    if (this.f12446s != randomAccessFile) {
                                        a();
                                    }
                                    this.f12446s = randomAccessFile;
                                }
                            }
                            if (this.f12446s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f12440m.delete();
                                this.f12438k = false;
                                if (this.f12446s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f12446s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else {
            this.f12438k = false;
            this.f12444q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            hj0.Q0.postRunnable(new ag.f(9));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f12446s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e6) {
                e6.printStackTrace();
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
                fVar.f12420c = wrap.getInt();
                fVar.f12419b = wrap.getInt();
                this.f12433e.add(fVar);
            }
        }
    }

    public final byte[] e(f fVar) {
        boolean z4;
        byte[] bArr;
        if (this.f12434f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            bArr = (byte[]) f12426w.get(Thread.currentThread());
        } else {
            bArr = this.f12435g;
        }
        if (bArr != null && bArr.length >= fVar.f12419b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (fVar.f12419b * 1.3f)];
        if (z4) {
            f12426w.put(Thread.currentThread(), bArr2);
            if (!f12427x) {
                f12427x = true;
                AndroidUtilities.runOnUIThread(this.f12443p, 5000L);
            }
            return bArr2;
        }
        this.f12435g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: lf.g.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f12444q && this.f12438k) {
            return false;
        }
        return true;
    }
}
