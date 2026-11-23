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
import org.telegram.messenger.cz;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.oh0;
public final class i {
    public static int A;
    public static xa B;
    public static boolean v;
    public static volatile boolean f3265x;
    public static ThreadPoolExecutor f3267z;
    public final BitmapDrawable f3268a;
    public final int f3269b;
    public final int f3270c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f3271e;
    public final boolean f3272f;
    public byte[] f3273g;
    public final Object h;
    public int f3274i;
    public boolean f3275j;
    public volatile boolean f3276k;
    public final int f3277l;
    public final File f3278m;
    public int f3279n;
    public final AtomicBoolean f3280o;
    public final sa f3281p;
    public volatile boolean f3282q;
    public volatile boolean f3283r;
    public RandomAccessFile f3284s;
    public BitmapFactory.Options f3285t;
    public Bitmap f3286u;
    public static final ConcurrentHashMap f3264w = new ConcurrentHashMap();
    public static final int f3266y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public i(File file, g gVar, f fVar, int i7, int i10, boolean z10, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f3271e = arrayList;
        this.h = new Object();
        this.f3280o = new AtomicBoolean(false);
        this.f3281p = new sa(this, 13);
        this.f3268a = (BitmapDrawable) gVar;
        this.f3269b = i7;
        this.f3270c = i10;
        this.f3277l = fVar.f3245a;
        String name = file.getName();
        if (f3267z == null) {
            int i12 = f3266y;
            f3267z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f3278m = file3;
        this.f3272f = (i7 >= org.telegram.messenger.g0.L(60.0f) || i10 >= org.telegram.messenger.g0.L(60.0f)) ? false : z11;
        if (cz.o() >= 2) {
            this.f3276k = file3.exists();
            try {
                if (this.f3276k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f3282q = randomAccessFile.readBoolean();
                            if (this.f3282q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f3282q = false;
                                    this.f3276k = false;
                                    file3.delete();
                                } else {
                                    if (this.f3284s != randomAccessFile) {
                                        a();
                                    }
                                    this.f3284s = randomAccessFile;
                                }
                            }
                            if (this.f3284s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f3278m.delete();
                                this.f3276k = false;
                                if (this.f3284s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f3284s != randomAccessFile && randomAccessFile != null) {
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
            this.f3276k = false;
            this.f3282q = false;
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
        RandomAccessFile randomAccessFile = this.f3284s;
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
                hVar.f3258c = wrap.getInt();
                hVar.f3257b = wrap.getInt();
                this.f3271e.add(hVar);
            }
        }
    }

    public final byte[] e(h hVar) {
        boolean z10;
        byte[] bArr;
        if (this.f3272f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f3264w.get(Thread.currentThread());
        } else {
            bArr = this.f3273g;
        }
        if (bArr != null && bArr.length >= hVar.f3257b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (hVar.f3257b * 1.3f)];
        if (z10) {
            f3264w.put(Thread.currentThread(), bArr2);
            if (!f3265x) {
                f3265x = true;
                org.telegram.messenger.g0.h3(this.f3281p, 5000L);
            }
            return bArr2;
        }
        this.f3273g = bArr2;
        return bArr2;
    }

    public final int f(int r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.f(int, android.graphics.Bitmap):int");
    }

    public final boolean g() {
        if (this.f3282q && this.f3276k) {
            return false;
        }
        return true;
    }
}
