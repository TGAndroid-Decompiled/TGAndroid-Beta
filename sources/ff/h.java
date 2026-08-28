package ff;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import bg.d2;
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
import org.telegram.ui.Components.mi0;
public final class h {
    public static int A;
    public static a6.a B;
    public static boolean v;
    public static volatile boolean f6177x;
    public static ThreadPoolExecutor f6179z;
    public final BitmapDrawable f6180a;
    public final int f6181b;
    public final int f6182c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f6183e;
    public final boolean f6184f;
    public byte[] f6185g;
    public final Object h;
    public int f6186i;
    public boolean f6187j;
    public volatile boolean f6188k;
    public final int f6189l;
    public final File f6190m;
    public int f6191n;
    public final AtomicBoolean f6192o;
    public final androidx.activity.i f6193p;
    public volatile boolean f6194q;
    public volatile boolean f6195r;
    public RandomAccessFile f6196s;
    public BitmapFactory.Options f6197t;
    public Bitmap f6198u;
    public static final ConcurrentHashMap f6176w = new ConcurrentHashMap();
    public static final int f6178y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public h(File file, f fVar, fe.i iVar, int i9, int i10, boolean z10, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f6183e = arrayList;
        this.h = new Object();
        this.f6192o = new AtomicBoolean(false);
        this.f6193p = new androidx.activity.i(this, 20);
        this.f6180a = (BitmapDrawable) fVar;
        this.f6181b = i9;
        this.f6182c = i10;
        this.f6189l = iVar.f6085a;
        String name = file.getName();
        if (f6179z == null) {
            int i12 = f6178y;
            f6179z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        sb2.append(i9);
        sb2.append("_");
        sb2.append(i10);
        if (z10) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i11 != 0) {
            str2 = j3.r0.l(i11, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, aa.d.r(sb2, str2, ".pcache2"));
        this.f6190m = file3;
        this.f6184f = (i9 >= AndroidUtilities.dp(60.0f) || i10 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f6188k = file3.exists();
            try {
                if (this.f6188k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f6194q = randomAccessFile.readBoolean();
                            if (this.f6194q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f6194q = false;
                                    this.f6188k = false;
                                    file3.delete();
                                } else {
                                    if (this.f6196s != randomAccessFile) {
                                        a();
                                    }
                                    this.f6196s = randomAccessFile;
                                }
                            }
                            if (this.f6196s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                th.printStackTrace();
                                this.f6190m.delete();
                                this.f6188k = false;
                                if (this.f6196s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    if (this.f6196s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else {
            this.f6188k = false;
            this.f6194q = false;
        }
    }

    public static void c() {
        int i9 = A - 1;
        A = i9;
        if (i9 <= 0) {
            A = 0;
            mi0.P0.postRunnable(new d2(2));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f6196s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ff.h.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i9) {
        if (i9 != 0) {
            byte[] bArr = new byte[i9 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i10 = 0; i10 < i9; i10++) {
                g gVar = new g(i10);
                gVar.f6170c = wrap.getInt();
                gVar.f6169b = wrap.getInt();
                this.f6183e.add(gVar);
            }
        }
    }

    public final byte[] e(g gVar) {
        boolean z10;
        byte[] bArr;
        if (this.f6184f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f6176w.get(Thread.currentThread());
        } else {
            bArr = this.f6185g;
        }
        if (bArr != null && bArr.length >= gVar.f6169b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (gVar.f6169b * 1.3f)];
        if (z10) {
            f6176w.put(Thread.currentThread(), bArr2);
            if (!f6177x) {
                f6177x = true;
                AndroidUtilities.runOnUIThread(this.f6193p, 5000L);
            }
            return bArr2;
        }
        this.f6185g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ff.h.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f6194q && this.f6188k) {
            return false;
        }
        return true;
    }
}
