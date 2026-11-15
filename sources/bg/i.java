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
    public static volatile boolean f3252x;
    public static ThreadPoolExecutor f3254z;
    public final BitmapDrawable f3255a;
    public final int f3256b;
    public final int f3257c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f3258e;
    public final boolean f3259f;
    public byte[] f3260g;
    public final Object h;
    public int f3261i;
    public boolean f3262j;
    public volatile boolean f3263k;
    public final int f3264l;
    public final File f3265m;
    public int f3266n;
    public final AtomicBoolean f3267o;
    public final sa f3268p;
    public volatile boolean f3269q;
    public volatile boolean f3270r;
    public RandomAccessFile f3271s;
    public BitmapFactory.Options f3272t;
    public Bitmap f3273u;
    public static final ConcurrentHashMap f3251w = new ConcurrentHashMap();
    public static final int f3253y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public i(File file, g gVar, f fVar, int i7, int i10, boolean z10, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f3258e = arrayList;
        this.h = new Object();
        this.f3267o = new AtomicBoolean(false);
        this.f3268p = new sa(this, 13);
        this.f3255a = (BitmapDrawable) gVar;
        this.f3256b = i7;
        this.f3257c = i10;
        this.f3264l = fVar.f3230a;
        String name = file.getName();
        if (f3254z == null) {
            int i12 = f3253y;
            f3254z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f3265m = file3;
        this.f3259f = (i7 >= org.telegram.messenger.g0.L(60.0f) || i10 >= org.telegram.messenger.g0.L(60.0f)) ? false : z11;
        if (gz.o() >= 2) {
            this.f3263k = file3.exists();
            try {
                if (this.f3263k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f3269q = randomAccessFile.readBoolean();
                            if (this.f3269q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f3269q = false;
                                    this.f3263k = false;
                                    file3.delete();
                                } else {
                                    if (this.f3271s != randomAccessFile) {
                                        a();
                                    }
                                    this.f3271s = randomAccessFile;
                                }
                            }
                            if (this.f3271s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f3265m.delete();
                                this.f3263k = false;
                                if (this.f3271s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f3271s != randomAccessFile && randomAccessFile != null) {
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
            this.f3263k = false;
            this.f3269q = false;
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
        RandomAccessFile randomAccessFile = this.f3271s;
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
                hVar.f3244c = wrap.getInt();
                hVar.f3243b = wrap.getInt();
                this.f3258e.add(hVar);
            }
        }
    }

    public final byte[] e(h hVar) {
        boolean z10;
        byte[] bArr;
        if (this.f3259f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f3251w.get(Thread.currentThread());
        } else {
            bArr = this.f3260g;
        }
        if (bArr != null && bArr.length >= hVar.f3243b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (hVar.f3243b * 1.3f)];
        if (z10) {
            f3251w.put(Thread.currentThread(), bArr2);
            if (!f3252x) {
                f3252x = true;
                org.telegram.messenger.g0.i3(this.f3268p, 5000L);
            }
            return bArr2;
        }
        this.f3260g = bArr2;
        return bArr2;
    }

    public final int f(int r11, android.graphics.Bitmap r12) {
        throw new UnsupportedOperationException("Method not decompiled: bg.i.f(int, android.graphics.Bitmap):int");
    }

    public final boolean g() {
        if (this.f3269q && this.f3263k) {
            return false;
        }
        return true;
    }
}
