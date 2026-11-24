package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
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
public final class dk0 {
    public static int A;
    public static kp B;
    public static boolean v;
    public static volatile boolean x;
    public static ThreadPoolExecutor z;
    public final bk0 a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final byte l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final o1 p;
    public volatile boolean q;
    public volatile boolean r;
    public RandomAccessFile s;
    public BitmapFactory.Options t;
    public Bitmap u;
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public static final int y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public dk0(File file, bk0 bk0Var, ak0 ak0Var, int i, int i2, boolean z2, int i3) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new o1(this, (byte) 8);
        this.a = bk0Var;
        this.b = i;
        this.c = i2;
        this.l = ak0Var.a;
        String name = file.getName();
        if (z == null) {
            int i4 = y;
            z = new ThreadPoolExecutor(i4, i4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(ba4.j(4), "acache");
        boolean z3 = true;
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        if (z2) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb.append(str);
        if (i3 != 0) {
            str2 = de9.k(i3, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, b00.j(sb, str2, ".pcache2"));
        this.m = file3;
        this.f = (i >= gl.L(60.0f) || i2 >= gl.L(60.0f)) ? false : z3;
        if (gba.o() >= 2) {
            this.k = file3.exists();
            if (this.k) {
                try {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.q = randomAccessFile.readBoolean();
                            if (this.q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.q = false;
                                    this.k = false;
                                    file3.delete();
                                } else {
                                    if (this.s != randomAccessFile) {
                                        a();
                                    }
                                    this.s = randomAccessFile;
                                }
                            }
                            if (this.s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                th.printStackTrace();
                                this.m.delete();
                                this.k = false;
                                if (this.s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    if (this.s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            this.k = false;
            this.q = false;
        }
    }

    public static void c() {
        int i = A - 1;
        A = i;
        if (i <= 0) {
            A = 0;
            oy8.U0.postRunnable(new jc((byte) 9));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk0.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i) {
        if (i != 0) {
            byte[] bArr = new byte[i << 3];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i2 = 0; i2 < i; i2++) {
                ck0 ck0Var = new ck0(i2);
                ck0Var.c = wrap.getInt();
                ck0Var.b = wrap.getInt();
                this.e.add(ck0Var);
            }
        }
    }

    public final byte[] e(ck0 ck0Var) {
        boolean z2;
        byte[] bArr;
        if (this.f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            bArr = (byte[]) w.get(Thread.currentThread());
        } else {
            bArr = this.g;
        }
        if (bArr != null && bArr.length >= ck0Var.b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (ck0Var.b * 1.3f)];
        if (z2) {
            w.put(Thread.currentThread(), bArr2);
            if (!x) {
                x = true;
                gl.e3(this.p, 5000L);
            }
            return bArr2;
        }
        this.g = bArr2;
        return bArr2;
    }

    public final int f(int i, Bitmap bitmap) {
        RandomAccessFile randomAccessFile;
        boolean z2;
        BitmapFactory.Options options;
        if (!this.j) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (this.q || this.k) {
                    if (!this.q || (randomAccessFile = this.s) == null) {
                        randomAccessFile = new RandomAccessFile(this.m, "r");
                        try {
                            this.q = randomAccessFile.readBoolean();
                            if (this.q && this.e.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                d(randomAccessFile, randomAccessFile.readInt());
                            }
                            if (this.e.size() == 0) {
                                this.q = false;
                            }
                            if (!this.q) {
                                randomAccessFile.close();
                                return -1;
                            }
                        } catch (FileNotFoundException unused) {
                            randomAccessFile2 = randomAccessFile;
                            if (this.j && randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            return -1;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = randomAccessFile;
                            fa4.g(th, false);
                            int i2 = this.n + 1;
                            this.n = i2;
                            if (i2 > 10) {
                                this.j = true;
                            }
                            if (this.j) {
                                randomAccessFile2.close();
                            }
                            return -1;
                        }
                    }
                    if (this.e.size() != 0) {
                        ck0 ck0Var = (ck0) this.e.get(Utilities.j(i, this.e.size() - 1, 0));
                        randomAccessFile.seek(ck0Var.c);
                        byte[] e2 = e(ck0Var);
                        randomAccessFile.readFully(e2, 0, ck0Var.b);
                        if (!this.r) {
                            if (this.s != randomAccessFile) {
                                a();
                            }
                            this.s = randomAccessFile;
                        } else {
                            this.s = null;
                            randomAccessFile.close();
                        }
                        if (this.t == null) {
                            this.t = new BitmapFactory.Options();
                        }
                        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Bitmap bitmap2 = this.u;
                            if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.u.getHeight() != bitmap.getHeight()) {
                                this.u = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            }
                            options = this.t;
                            options.inBitmap = this.u;
                        } else {
                            options = this.t;
                            options.inBitmap = bitmap;
                        }
                        BitmapFactory.decodeByteArray(e2, 0, ck0Var.b, options);
                        if (z2) {
                            Utilities.extractAlpha(this.u, bitmap);
                        }
                        this.t.inBitmap = null;
                        return 0;
                    }
                }
            } catch (FileNotFoundException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    public final boolean g() {
        if (this.q && this.k) {
            return false;
        }
        return true;
    }
}
