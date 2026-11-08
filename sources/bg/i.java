package bg;

import a8.ra;
import a8.wa;
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
import org.telegram.messenger.iz;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.zg0;
public final class i {
    public static int A;
    public static wa B;
    public static boolean v;
    public static volatile boolean f3297x;
    public static ThreadPoolExecutor f3299z;
    public final BitmapDrawable f3300a;
    public final int f3301b;
    public final int f3302c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f3303e;
    public final boolean f3304f;
    public byte[] f3305g;
    public final Object h;
    public int f3306i;
    public boolean f3307j;
    public volatile boolean f3308k;
    public final int f3309l;
    public final File f3310m;
    public int f3311n;
    public final AtomicBoolean f3312o;
    public final ra f3313p;
    public volatile boolean f3314q;
    public volatile boolean f3315r;
    public RandomAccessFile f3316s;
    public BitmapFactory.Options f3317t;
    public Bitmap f3318u;
    public static final ConcurrentHashMap f3296w = new ConcurrentHashMap();
    public static final int f3298y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public i(File file, g gVar, f fVar, int i7, int i10, boolean z9, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f3303e = arrayList;
        this.h = new Object();
        this.f3312o = new AtomicBoolean(false);
        this.f3313p = new ra(this, 11);
        this.f3300a = (BitmapDrawable) gVar;
        this.f3301b = i7;
        this.f3302c = i10;
        this.f3309l = fVar.f3275a;
        String name = file.getName();
        if (f3299z == null) {
            int i12 = f3298y;
            f3299z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(w7.j(4), "acache");
        boolean z10 = true;
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
        if (z9) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i11 != 0) {
            str2 = jg.g.j(i11, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a8.p0.s(sb2, str2, ".pcache2"));
        this.f3310m = file3;
        this.f3304f = (i7 >= org.telegram.messenger.g0.L(60.0f) || i10 >= org.telegram.messenger.g0.L(60.0f)) ? false : z10;
        if (iz.o() >= 2) {
            this.f3308k = file3.exists();
            try {
                if (this.f3308k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f3314q = randomAccessFile.readBoolean();
                            if (this.f3314q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f3314q = false;
                                    this.f3308k = false;
                                    file3.delete();
                                } else {
                                    if (this.f3316s != randomAccessFile) {
                                        a();
                                    }
                                    this.f3316s = randomAccessFile;
                                }
                            }
                            if (this.f3316s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f3310m.delete();
                                this.f3308k = false;
                                if (this.f3316s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f3316s != randomAccessFile && randomAccessFile != null) {
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
            this.f3308k = false;
            this.f3314q = false;
        }
    }

    public static void c() {
        int i7 = A - 1;
        A = i7;
        if (i7 <= 0) {
            A = 0;
            zg0.T0.postRunnable(new ai.m0(1));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f3316s;
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
                hVar.f3289c = wrap.getInt();
                hVar.f3288b = wrap.getInt();
                this.f3303e.add(hVar);
            }
        }
    }

    public final byte[] e(h hVar) {
        boolean z9;
        byte[] bArr;
        if (this.f3304f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            bArr = (byte[]) f3296w.get(Thread.currentThread());
        } else {
            bArr = this.f3305g;
        }
        if (bArr != null && bArr.length >= hVar.f3288b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (hVar.f3288b * 1.3f)];
        if (z9) {
            f3296w.put(Thread.currentThread(), bArr2);
            if (!f3297x) {
                f3297x = true;
                org.telegram.messenger.g0.i3(this.f3313p, 5000L);
            }
            return bArr2;
        }
        this.f3305g = bArr2;
        return bArr2;
    }

    public final int f(int r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.f(int, android.graphics.Bitmap):int");
    }

    public final boolean g() {
        if (this.f3314q && this.f3308k) {
            return false;
        }
        return true;
    }
}
