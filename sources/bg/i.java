package bg;

import a8.sa;
import a8.xa;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.ch0;
public final class i {
    public static int A;
    public static xa B;
    public static boolean v;
    public static volatile boolean f3255x;
    public static ThreadPoolExecutor f3257z;
    public final BitmapDrawable f3258a;
    public final int f3259b;
    public final int f3260c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f3261e;
    public final boolean f3262f;
    public byte[] f3263g;
    public final Object h;
    public int f3264i;
    public boolean f3265j;
    public volatile boolean f3266k;
    public final int f3267l;
    public final File f3268m;
    public int f3269n;
    public final AtomicBoolean f3270o;
    public final sa f3271p;
    public volatile boolean f3272q;
    public volatile boolean f3273r;
    public RandomAccessFile f3274s;
    public BitmapFactory.Options f3275t;
    public Bitmap f3276u;
    public static final ConcurrentHashMap f3254w = new ConcurrentHashMap();
    public static final int f3256y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public i(File file, g gVar, f fVar, int i7, int i10, boolean z10, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f3261e = arrayList;
        this.h = new Object();
        this.f3270o = new AtomicBoolean(false);
        this.f3271p = new sa(this, 13);
        this.f3258a = (BitmapDrawable) gVar;
        this.f3259b = i7;
        this.f3260c = i10;
        this.f3267l = fVar.f3233a;
        String name = file.getName();
        if (f3257z == null) {
            int i12 = f3256y;
            f3257z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(w7.j(4), "acache");
        boolean z11 = true;
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i7);
        sb2.append("_");
        sb2.append(i10);
        if (z10) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i11 != 0) {
            str2 = i5.c.i(i11, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a8.p0.s(sb2, str2, ".pcache2"));
        this.f3268m = file3;
        this.f3262f = (i7 >= org.telegram.messenger.g0.L(60.0f) || i10 >= org.telegram.messenger.g0.L(60.0f)) ? false : z11;
        if (gz.o() >= 2) {
            this.f3266k = file3.exists();
            try {
                if (this.f3266k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f3272q = randomAccessFile.readBoolean();
                            if (this.f3272q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f3272q = false;
                                    this.f3266k = false;
                                    file3.delete();
                                } else {
                                    if (this.f3274s != randomAccessFile) {
                                        a();
                                    }
                                    this.f3274s = randomAccessFile;
                                }
                            }
                            if (this.f3274s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f3268m.delete();
                                this.f3266k = false;
                                if (this.f3274s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f3274s != randomAccessFile && randomAccessFile != null) {
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
            this.f3266k = false;
            this.f3272q = false;
        }
    }

    public static void c() {
        int i7 = A - 1;
        A = i7;
        if (i7 <= 0) {
            A = 0;
            ch0.U0.postRunnable(new ai.o(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f3274s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i7) {
        if (i7 != 0) {
            byte[] bArr = new byte[i7 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i10 = 0; i10 < i7; i10++) {
                h hVar = new h(i10);
                hVar.f3247c = wrap.getInt();
                hVar.f3246b = wrap.getInt();
                this.f3261e.add(hVar);
            }
        }
    }

    public final byte[] e(h hVar) {
        boolean z10;
        byte[] bArr;
        if (this.f3262f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f3254w.get(Thread.currentThread());
        } else {
            bArr = this.f3263g;
        }
        if (bArr != null && bArr.length >= hVar.f3246b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (hVar.f3246b * 1.3f)];
        if (z10) {
            f3254w.put(Thread.currentThread(), bArr2);
            if (!f3255x) {
                f3255x = true;
                org.telegram.messenger.g0.i3(this.f3271p, 5000L);
            }
            return bArr2;
        }
        this.f3263g = bArr2;
        return bArr2;
    }

    public final int f(int r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.f(int, android.graphics.Bitmap):int");
    }

    public final boolean g() {
        if (this.f3272q && this.f3266k) {
            return false;
        }
        return true;
    }
}
