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
import org.telegram.messenger.bz;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.oh0;
public final class i {
    public static int A;
    public static xa B;
    public static boolean v;
    public static volatile boolean f3258x;
    public static ThreadPoolExecutor f3260z;
    public final BitmapDrawable f3261a;
    public final int f3262b;
    public final int f3263c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f3264e;
    public final boolean f3265f;
    public byte[] f3266g;
    public final Object h;
    public int f3267i;
    public boolean f3268j;
    public volatile boolean f3269k;
    public final int f3270l;
    public final File f3271m;
    public int f3272n;
    public final AtomicBoolean f3273o;
    public final sa f3274p;
    public volatile boolean f3275q;
    public volatile boolean f3276r;
    public RandomAccessFile f3277s;
    public BitmapFactory.Options f3278t;
    public Bitmap f3279u;
    public static final ConcurrentHashMap f3257w = new ConcurrentHashMap();
    public static final int f3259y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public i(File file, g gVar, f fVar, int i7, int i10, boolean z10, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f3264e = arrayList;
        this.h = new Object();
        this.f3273o = new AtomicBoolean(false);
        this.f3274p = new sa(this, 13);
        this.f3261a = (BitmapDrawable) gVar;
        this.f3262b = i7;
        this.f3263c = i10;
        this.f3270l = fVar.f3238a;
        String name = file.getName();
        if (f3260z == null) {
            int i12 = f3259y;
            f3260z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f3271m = file3;
        this.f3265f = (i7 >= org.telegram.messenger.g0.L(60.0f) || i10 >= org.telegram.messenger.g0.L(60.0f)) ? false : z11;
        if (bz.o() >= 2) {
            this.f3269k = file3.exists();
            try {
                if (this.f3269k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f3275q = randomAccessFile.readBoolean();
                            if (this.f3275q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f3275q = false;
                                    this.f3269k = false;
                                    file3.delete();
                                } else {
                                    if (this.f3277s != randomAccessFile) {
                                        a();
                                    }
                                    this.f3277s = randomAccessFile;
                                }
                            }
                            if (this.f3277s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f3271m.delete();
                                this.f3269k = false;
                                if (this.f3277s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f3277s != randomAccessFile && randomAccessFile != null) {
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
            this.f3269k = false;
            this.f3275q = false;
        }
    }

    public static void c() {
        int i7 = A - 1;
        A = i7;
        if (i7 <= 0) {
            A = 0;
            oh0.U0.postRunnable(new ai.n(3));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f3277s;
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
                hVar.f3251c = wrap.getInt();
                hVar.f3250b = wrap.getInt();
                this.f3264e.add(hVar);
            }
        }
    }

    public final byte[] e(h hVar) {
        boolean z10;
        byte[] bArr;
        if (this.f3265f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f3257w.get(Thread.currentThread());
        } else {
            bArr = this.f3266g;
        }
        if (bArr != null && bArr.length >= hVar.f3250b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (hVar.f3250b * 1.3f)];
        if (z10) {
            f3257w.put(Thread.currentThread(), bArr2);
            if (!f3258x) {
                f3258x = true;
                org.telegram.messenger.g0.h3(this.f3274p, 5000L);
            }
            return bArr2;
        }
        this.f3266g = bArr2;
        return bArr2;
    }

    public final int f(int r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.f(int, android.graphics.Bitmap):int");
    }

    public final boolean g() {
        if (this.f3275q && this.f3269k) {
            return false;
        }
        return true;
    }
}
