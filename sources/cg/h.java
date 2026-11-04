package cg;

import ai.y1;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import b8.kg;
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
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.w7;
import org.telegram.ui.Components.ch0;
public final class h {
    public static int A;
    public static kg B;
    public static boolean v;
    public static volatile boolean f4662x;
    public static ThreadPoolExecutor f4664z;
    public final BitmapDrawable f4665a;
    public final int f4666b;
    public final int f4667c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f4668e;
    public final boolean f4669f;
    public byte[] f4670g;
    public final Object h;
    public int f4671i;
    public boolean f4672j;
    public volatile boolean f4673k;
    public final int f4674l;
    public final File f4675m;
    public int f4676n;
    public final AtomicBoolean f4677o;
    public final a3.o f4678p;
    public volatile boolean f4679q;
    public volatile boolean f4680r;
    public RandomAccessFile f4681s;
    public BitmapFactory.Options f4682t;
    public Bitmap f4683u;
    public static final ConcurrentHashMap f4661w = new ConcurrentHashMap();
    public static final int f4663y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public h(File file, f fVar, bd.i iVar, int i3, int i10, boolean z10, int i11) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f4668e = arrayList;
        this.h = new Object();
        this.f4677o = new AtomicBoolean(false);
        this.f4678p = new a3.o(this, 12);
        this.f4665a = (BitmapDrawable) fVar;
        this.f4666b = i3;
        this.f4667c = i10;
        this.f4674l = iVar.f3232a;
        String name = file.getName();
        if (f4664z == null) {
            int i12 = f4663y;
            f4664z = new ThreadPoolExecutor(i12, i12, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        sb2.append(i3);
        sb2.append("_");
        sb2.append(i10);
        if (z10) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i11 != 0) {
            str2 = p1.i(i11, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.s(sb2, str2, ".pcache2"));
        this.f4675m = file3;
        this.f4669f = (i3 >= org.telegram.messenger.g0.L(60.0f) || i10 >= org.telegram.messenger.g0.L(60.0f)) ? false : z11;
        if (az.o() >= 2) {
            this.f4673k = file3.exists();
            try {
                if (this.f4673k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f4679q = randomAccessFile.readBoolean();
                            if (this.f4679q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f4679q = false;
                                    this.f4673k = false;
                                    file3.delete();
                                } else {
                                    if (this.f4681s != randomAccessFile) {
                                        a();
                                    }
                                    this.f4681s = randomAccessFile;
                                }
                            }
                            if (this.f4681s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f4675m.delete();
                                this.f4673k = false;
                                if (this.f4681s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f4681s != randomAccessFile && randomAccessFile != null) {
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
            this.f4673k = false;
            this.f4679q = false;
        }
    }

    public static void c() {
        int i3 = A - 1;
        A = i3;
        if (i3 <= 0) {
            A = 0;
            ch0.U0.postRunnable(new y1(2));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f4681s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: cg.h.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i3) {
        if (i3 != 0) {
            byte[] bArr = new byte[i3 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i10 = 0; i10 < i3; i10++) {
                g gVar = new g(i10);
                gVar.f4654c = wrap.getInt();
                gVar.f4653b = wrap.getInt();
                this.f4668e.add(gVar);
            }
        }
    }

    public final byte[] e(g gVar) {
        boolean z10;
        byte[] bArr;
        if (this.f4669f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f4661w.get(Thread.currentThread());
        } else {
            bArr = this.f4670g;
        }
        if (bArr != null && bArr.length >= gVar.f4653b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (gVar.f4653b * 1.3f)];
        if (z10) {
            f4661w.put(Thread.currentThread(), bArr2);
            if (!f4662x) {
                f4662x = true;
                org.telegram.messenger.g0.i3(this.f4678p, 5000L);
            }
            return bArr2;
        }
        this.f4670g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: cg.h.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f4679q && this.f4673k) {
            return false;
        }
        return true;
    }
}
