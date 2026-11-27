package defpackage;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class no6 extends go6 {
    public static uo3 Z;
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

    public no6(int i, String str, int i2, boolean z, int i3, int i4) {
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

    public final no6 clone() {
        no6 no6Var = new no6(this.B, this.C, this.D, this.I, this.J, this.E, this.b, this.F, this.G, this.H);
        no6Var.K = this.K;
        no6Var.L = this.L;
        no6Var.M = this.M;
        no6Var.N = this.N;
        no6Var.R = this.R;
        no6Var.S = this.S;
        no6Var.T = this.T;
        no6Var.U = this.U;
        no6Var.O = this.O;
        no6Var.g(this);
        return no6Var;
    }

    public final void g(no6 no6Var) {
        this.a = no6Var.a;
        this.c = no6Var.c;
        this.h = no6Var.h;
        this.i = no6Var.i;
        this.j = no6Var.j;
        this.k = no6Var.k;
        this.l = no6Var.l;
        this.n = no6Var.n;
        this.o = no6Var.o;
        this.p = no6Var.p;
        this.q = no6Var.q;
        this.r = no6Var.r;
        this.s = no6Var.s;
        this.t = no6Var.t;
        this.u = no6Var.u;
        this.v = no6Var.v;
        this.w = no6Var.w;
        this.m = no6Var.m;
        this.x = no6Var.x;
        this.A = no6Var.A;
        this.g = no6Var.g;
        this.z = no6Var.z;
        this.M = no6Var.M;
        this.N = no6Var.N;
        this.V = no6Var.V;
        this.W = no6Var.W;
        this.m = no6Var.m;
        this.P = no6Var.P;
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
            return !xea.e1;
        }
        return bool.booleanValue();
    }

    public final boolean k(x38 x38Var) {
        if (i()) {
            return true;
        }
        if (x38Var != null) {
            ArrayList arrayList = this.Y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.Y = arrayList;
            }
            if (!arrayList.contains(x38Var)) {
                this.Y.add(x38Var);
            }
        }
        if (!this.X) {
            this.X = true;
            uo3 uo3Var = Z;
            if (uo3Var == null) {
                uo3Var = new uo3("livePhotoQueue", true);
                Z = uo3Var;
            }
            uo3Var.postRunnable(new mo6(this, (byte) 0));
        }
        return false;
    }

    public final void l() {
        ry0 ry0Var;
        zg2 zg2Var;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        mh7 mh7Var = null;
        try {
            ry0Var = ry0.b(new File(str));
        } catch (Exception e) {
            cc4.g(e, true);
            ry0Var = null;
        }
        if (ry0Var != null) {
            long j = ry0Var.a;
            if (j > 0) {
                this.b = true;
                this.W = true;
                this.m = j;
                this.P = ry0Var.b;
            }
        } else {
            try {
                String b = new y54(new File(str)).b("Xmp");
                if (b != null) {
                    try {
                        zg2Var = jid.a(b);
                    } catch (hy7 | NumberFormatException | XmlPullParserException unused) {
                        efd.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        zg2Var = null;
                    }
                    if (zg2Var != null) {
                        j99 j99Var = (j99) zg2Var.c;
                        mh7 mh7Var2 = null;
                        for (int i = 0; i < j99Var.d; i++) {
                            mh7 mh7Var3 = (mh7) j99Var.get(i);
                            String str2 = mh7Var3.b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                mh7Var = mh7Var3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                mh7Var2 = mh7Var3;
                            }
                        }
                        if (mh7Var != null && mh7Var2 != null && mh7Var2.c > 0) {
                            try {
                                this.b = true;
                                this.W = true;
                                this.m = new File(str).length() - mh7Var2.c;
                                this.P = zg2Var.b;
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                cc4.g(e3, true);
                this.W = false;
            }
        }
        StringBuilder sb = new StringBuilder("parsed isLivePhoto()=");
        sb.append(this.W);
        sb.append(" in ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        uh9.s("ms", sb);
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no6.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public no6(int i, int i2, long j, String str, int i3, int i4, boolean z, int i5, int i6, long j2) {
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
