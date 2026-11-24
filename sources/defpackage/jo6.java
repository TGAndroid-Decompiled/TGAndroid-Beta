package defpackage;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class jo6 extends co6 {
    public static np3 Z;
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

    public jo6(int i, String str, int i2, boolean z, int i3, int i4) {
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

    public final jo6 clone() {
        jo6 jo6Var = new jo6(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        jo6Var.K = this.K;
        jo6Var.L = this.L;
        jo6Var.M = this.M;
        jo6Var.N = this.N;
        jo6Var.R = this.R;
        jo6Var.S = this.S;
        jo6Var.T = this.T;
        jo6Var.U = this.U;
        jo6Var.O = this.O;
        jo6Var.g(this);
        return jo6Var;
    }

    public final void g(jo6 jo6Var) {
        this.a = jo6Var.a;
        this.c = jo6Var.c;
        this.h = jo6Var.h;
        this.i = jo6Var.i;
        this.j = jo6Var.j;
        this.k = jo6Var.k;
        this.l = jo6Var.l;
        this.n = jo6Var.n;
        this.o = jo6Var.o;
        this.p = jo6Var.p;
        this.q = jo6Var.q;
        this.r = jo6Var.r;
        this.s = jo6Var.s;
        this.t = jo6Var.t;
        this.u = jo6Var.u;
        this.v = jo6Var.v;
        this.w = jo6Var.w;
        this.m = jo6Var.m;
        this.x = jo6Var.x;
        this.A = jo6Var.A;
        this.g = jo6Var.g;
        this.z = jo6Var.z;
        this.M = jo6Var.M;
        this.N = jo6Var.N;
        this.V = jo6Var.V;
        this.W = jo6Var.W;
        this.m = jo6Var.m;
        this.P = jo6Var.P;
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
            return !gda.e1;
        }
        return bool.booleanValue();
    }

    public final boolean k(kl7 kl7Var) {
        if (i()) {
            return true;
        }
        if (kl7Var != null) {
            ArrayList arrayList = this.Y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.Y = arrayList;
            }
            if (!arrayList.contains(kl7Var)) {
                this.Y.add(kl7Var);
            }
        }
        if (!this.X) {
            this.X = true;
            np3 np3Var = Z;
            if (np3Var == null) {
                np3Var = new np3("livePhotoQueue", true);
                Z = np3Var;
            }
            np3Var.postRunnable(new io6(this, (byte) 0));
        }
        return false;
    }

    public final void l() {
        qz0 qz0Var;
        vh2 vh2Var;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        gh7 gh7Var = null;
        try {
            qz0Var = qz0.b(new File(str));
        } catch (Exception e) {
            fc4.g(e, true);
            qz0Var = null;
        }
        if (qz0Var != null) {
            long j = qz0Var.a;
            if (j > 0) {
                this.b = true;
                this.W = true;
                this.m = j;
                this.P = qz0Var.b;
            }
        } else {
            try {
                String b = new o64(new File(str)).b("Xmp");
                if (b != null) {
                    try {
                        vh2Var = tfd.a(b);
                    } catch (bx7 | NumberFormatException | XmlPullParserException unused) {
                        ncd.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        vh2Var = null;
                    }
                    if (vh2Var != null) {
                        y79 y79Var = (y79) vh2Var.c;
                        gh7 gh7Var2 = null;
                        for (int i = 0; i < y79Var.d; i++) {
                            gh7 gh7Var3 = (gh7) y79Var.get(i);
                            String str2 = gh7Var3.b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                gh7Var = gh7Var3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                gh7Var2 = gh7Var3;
                            }
                        }
                        if (gh7Var != null && gh7Var2 != null && gh7Var2.c > 0) {
                            try {
                                this.b = true;
                                this.W = true;
                                this.m = new File(str).length() - gh7Var2.c;
                                this.P = vh2Var.b;
                            } catch (Exception e2) {
                                fc4.g(e2, true);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                fc4.g(e3, true);
                this.W = false;
            }
        }
        StringBuilder sb = new StringBuilder("parsed isLivePhoto()=");
        sb.append(this.W);
        sb.append(" in ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        hg9.r("ms", sb);
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo6.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public jo6(int i, int i2, long j, String str, int i3, int i4, boolean z, int i5, int i6, long j2) {
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
