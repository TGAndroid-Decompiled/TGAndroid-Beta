package org.telegram.messenger;

import android.util.Pair;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class ff extends af {
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
    public boolean V;
    public boolean W;

    public ff(int i10, int i11, long j10, String str, int i12, int i13, boolean z10, int i14, int i15, long j11) {
        this.Q = -1;
        this.B = i10;
        this.C = i11;
        this.D = j10;
        this.I = str;
        this.F = i14;
        this.G = i15;
        this.H = j11;
        this.E = i13;
        this.J = i12;
        this.f14603b = z10;
    }

    @Override
    public final String a() {
        return this.I;
    }

    @Override
    public final boolean d() {
        c3.g0 g0Var;
        String str = this.I;
        if (!this.f14603b && !this.V) {
            this.V = true;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                String b10 = new r1.g(new File(str)).b("Xmp");
                if (b10 != null) {
                    k3.c cVar = null;
                    try {
                        g0Var = k3.d.a(b10);
                    } catch (b2.w0 | NumberFormatException | XmlPullParserException unused) {
                        e2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        g0Var = null;
                    }
                    if (g0Var != null) {
                        e9.x1 x1Var = (e9.x1) g0Var.f3651c;
                        k3.c cVar2 = null;
                        for (int i10 = 0; i10 < x1Var.d; i10++) {
                            k3.c cVar3 = (k3.c) x1Var.get(i10);
                            String str2 = cVar3.f10839b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null) {
                            long j10 = cVar2.f10840c;
                            if (j10 > 0) {
                                try {
                                    this.f14603b = true;
                                    this.W = true;
                                    this.f14611m = new File(str).length() - j10;
                                    this.P = g0Var.f3650b;
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                this.W = false;
            }
            StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
            sb2.append(this.W);
            sb2.append(" in ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            a1.g.z("ms", sb2);
            return this.W;
        }
        return this.W;
    }

    @Override
    public final void e() {
        if (this.f14603b && this.f14607i != null) {
            new File(this.f14607i).delete();
            this.f14607i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final ff clone() {
        ff ffVar = new ff(this.B, this.C, this.D, this.I, this.J, this.E, this.f14603b, this.F, this.G, this.H);
        ffVar.K = this.K;
        ffVar.L = this.L;
        ffVar.M = this.M;
        ffVar.N = this.N;
        ffVar.R = this.R;
        ffVar.S = this.S;
        ffVar.T = this.T;
        ffVar.U = this.U;
        ffVar.O = this.O;
        ffVar.g(this);
        return ffVar;
    }

    public final void g(ff ffVar) {
        this.f14602a = ffVar.f14602a;
        this.f14604c = ffVar.f14604c;
        this.h = ffVar.h;
        this.f14607i = ffVar.f14607i;
        this.f14608j = ffVar.f14608j;
        this.f14609k = ffVar.f14609k;
        this.f14610l = ffVar.f14610l;
        this.f14612n = ffVar.f14612n;
        this.f14613o = ffVar.f14613o;
        this.f14614p = ffVar.f14614p;
        this.f14615q = ffVar.f14615q;
        this.f14616r = ffVar.f14616r;
        this.f14617s = ffVar.f14617s;
        this.f14618t = ffVar.f14618t;
        this.f14619u = ffVar.f14619u;
        this.v = ffVar.v;
        this.f14620w = ffVar.f14620w;
        this.f14611m = ffVar.f14611m;
        this.f14621x = ffVar.f14621x;
        this.A = ffVar.A;
        this.f14606g = ffVar.f14606g;
        this.f14623z = ffVar.f14623z;
        this.M = ffVar.M;
        this.N = ffVar.N;
        this.V = ffVar.V;
        this.W = ffVar.W;
        this.f14611m = ffVar.f14611m;
        this.P = ffVar.P;
    }

    public final void h() {
        String str = this.I;
        if (str != null) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
        if (this.f14610l != null) {
            try {
                new File(this.f14610l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f14608j != null) {
            try {
                new File(this.f14608j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f14607i != null) {
            try {
                new File(this.f14607i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f14609k != null) {
            try {
                new File(this.f14609k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        Boolean bool = this.O;
        if (bool == null) {
            return !uz.f18523i1;
        }
        return bool.booleanValue();
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ff.j():void");
    }

    public final void k(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ff(int i10, String str, int i11, boolean z10, int i12, int i13) {
        this.Q = -1;
        this.B = 0;
        this.C = i10;
        this.D = 0L;
        this.I = str;
        this.F = i12;
        this.G = i13;
        this.H = 0L;
        if (z10) {
            this.E = i11;
        } else {
            this.J = i11;
        }
        this.f14603b = z10;
    }
}
