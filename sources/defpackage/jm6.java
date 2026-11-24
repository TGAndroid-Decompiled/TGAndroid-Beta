package defpackage;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class jm6 extends bm6 {
    public static do3 Z;
    public final int B;
    public final int C;
    public final long D;
    public int E;
    public final int F;
    public final int G;
    public final long H;
    public final String I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public Boolean O;
    public long P;
    public int Q;
    public boolean R;
    public TLRPC.VideoSize S;
    public int T;
    public int U;
    public volatile boolean V;
    public boolean W;
    public boolean X;
    public ArrayList Y;

    public jm6(int i, String str, int i2, boolean z, int i3, int i4) {
        this.Q = -1;
        this.B = 0;
        this.C = i;
        this.D = 0L;
        this.I = str;
        this.F = i3;
        this.G = i4;
        this.H = 0L;
        if (z) {
            this.E = i2;
        } else {
            this.J = i2;
        }
        this.b = z;
    }

    @Override
    public final String a() {
        return this.I;
    }

    @Override
    public final boolean d() {
        if (this.V) {
            return this.W;
        }
        synchronized (this) {
            if (!this.V) {
                if (!this.b) {
                    l();
                }
                this.V = true;
            }
        }
        return this.W;
    }

    @Override
    public final void e() {
        if (this.b && this.i != null) {
            new File(this.i).delete();
            this.i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final jm6 clone() {
        jm6 jm6Var = new jm6(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        jm6Var.K = this.K;
        jm6Var.L = this.L;
        jm6Var.M = this.M;
        jm6Var.N = this.N;
        jm6Var.R = this.R;
        jm6Var.S = this.S;
        jm6Var.T = this.T;
        jm6Var.U = this.U;
        jm6Var.O = this.O;
        jm6Var.g(this);
        return jm6Var;
    }

    public final void g(jm6 jm6Var) {
        this.a = jm6Var.a;
        this.c = jm6Var.c;
        this.h = jm6Var.h;
        this.i = jm6Var.i;
        this.j = jm6Var.j;
        this.k = jm6Var.k;
        this.l = jm6Var.l;
        this.n = jm6Var.n;
        this.o = jm6Var.o;
        this.p = jm6Var.p;
        this.q = jm6Var.q;
        this.r = jm6Var.r;
        this.s = jm6Var.s;
        this.t = jm6Var.t;
        this.u = jm6Var.u;
        this.v = jm6Var.v;
        this.w = jm6Var.w;
        this.m = jm6Var.m;
        this.x = jm6Var.x;
        this.A = jm6Var.A;
        this.g = jm6Var.g;
        this.z = jm6Var.z;
        this.M = jm6Var.M;
        this.N = jm6Var.N;
        this.V = jm6Var.V;
        this.W = jm6Var.W;
        this.m = jm6Var.m;
        this.P = jm6Var.P;
    }

    public final void h() {
        String str = this.I;
        if (str != null) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
        if (this.l != null) {
            try {
                new File(this.l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.j != null) {
            try {
                new File(this.j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.i != null) {
            try {
                new File(this.i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.k != null) {
            try {
                new File(this.k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (!this.V) {
            if (!this.b || this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Boolean bool = this.O;
        if (bool == null) {
            return !gba.e1;
        }
        return bool.booleanValue();
    }

    public final boolean k(oq7 oq7Var) {
        if (i()) {
            return true;
        }
        if (oq7Var != null) {
            ArrayList arrayList = this.Y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.Y = arrayList;
            }
            if (!arrayList.contains(oq7Var)) {
                this.Y.add(oq7Var);
            }
        }
        if (!this.X) {
            this.X = true;
            do3 do3Var = Z;
            if (do3Var == null) {
                do3Var = new do3("livePhotoQueue", true);
                Z = do3Var;
            }
            do3Var.postRunnable(new hm6(this, (byte) 0));
        }
        return false;
    }

    public final void l() {
        jy0 jy0Var;
        hg2 hg2Var;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        df7 df7Var = null;
        try {
            jy0Var = jy0.b(new File(str));
        } catch (Exception e) {
            fa4.g(e, true);
            jy0Var = null;
        }
        if (jy0Var != null) {
            long j = jy0Var.a;
            if (j > 0) {
                this.b = true;
                this.W = true;
                this.m = j;
                this.P = jy0Var.b;
            }
        } else {
            try {
                String b = new d54(new File(str)).b("Xmp");
                if (b != null) {
                    try {
                        hg2Var = rdd.a(b);
                    } catch (av7 | NumberFormatException | XmlPullParserException unused) {
                        lad.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        hg2Var = null;
                    }
                    if (hg2Var != null) {
                        w59 w59Var = (w59) hg2Var.c;
                        df7 df7Var2 = null;
                        for (int i = 0; i < w59Var.d; i++) {
                            df7 df7Var3 = (df7) w59Var.get(i);
                            String str2 = df7Var3.b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                df7Var = df7Var3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                df7Var2 = df7Var3;
                            }
                        }
                        if (df7Var != null && df7Var2 != null && df7Var2.c > 0) {
                            try {
                                this.b = true;
                                this.W = true;
                                this.m = new File(str).length() - df7Var2.c;
                                this.P = hg2Var.b;
                            } catch (Exception e2) {
                                fa4.g(e2, true);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
                this.W = false;
            }
        }
        StringBuilder sb = new StringBuilder("parsed isLivePhoto()=");
        sb.append(this.W);
        sb.append(" in ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        de9.s("ms", sb);
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm6.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public jm6(int i, int i2, long j, String str, int i3, int i4, boolean z, int i5, int i6, long j2) {
        this.Q = -1;
        this.B = i;
        this.C = i2;
        this.D = j;
        this.I = str;
        this.F = i5;
        this.G = i6;
        this.H = j2;
        this.E = i4;
        this.J = i3;
        this.b = z;
    }
}
