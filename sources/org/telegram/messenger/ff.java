package org.telegram.messenger;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class ff extends ye {
    public static r5 Z;
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

    public ff(int i7, int i10, long j3, String str, int i11, int i12, boolean z10, int i13, int i14, long j10) {
        this.Q = -1;
        this.B = i7;
        this.C = i10;
        this.D = j3;
        this.I = str;
        this.F = i13;
        this.G = i14;
        this.H = j10;
        this.E = i12;
        this.J = i11;
        this.f28059b = z10;
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
            try {
                if (!this.V) {
                    if (!this.f28059b) {
                        l();
                    }
                    this.V = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.W;
    }

    @Override
    public final void e() {
        if (this.f28059b && this.f28064i != null) {
            new File(this.f28064i).delete();
            this.f28064i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final ff clone() {
        ff ffVar = new ff(this.B, this.C, this.D, this.I, this.J, this.E, this.f28059b, this.F, this.G, this.H);
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
        this.f28058a = ffVar.f28058a;
        this.f28060c = ffVar.f28060c;
        this.h = ffVar.h;
        this.f28064i = ffVar.f28064i;
        this.f28065j = ffVar.f28065j;
        this.f28066k = ffVar.f28066k;
        this.f28067l = ffVar.f28067l;
        this.f28069n = ffVar.f28069n;
        this.f28070o = ffVar.f28070o;
        this.f28071p = ffVar.f28071p;
        this.f28072q = ffVar.f28072q;
        this.f28073r = ffVar.f28073r;
        this.f28074s = ffVar.f28074s;
        this.f28075t = ffVar.f28075t;
        this.f28076u = ffVar.f28076u;
        this.v = ffVar.v;
        this.f28077w = ffVar.f28077w;
        this.f28068m = ffVar.f28068m;
        this.f28078x = ffVar.f28078x;
        this.A = ffVar.A;
        this.f28063g = ffVar.f28063g;
        this.f28080z = ffVar.f28080z;
        this.M = ffVar.M;
        this.N = ffVar.N;
        this.V = ffVar.V;
        this.W = ffVar.W;
        this.f28068m = ffVar.f28068m;
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
        if (this.f28067l != null) {
            try {
                new File(this.f28067l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f28065j != null) {
            try {
                new File(this.f28065j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f28064i != null) {
            try {
                new File(this.f28064i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f28066k != null) {
            try {
                new File(this.f28066k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (!this.V) {
            if (!this.f28059b || this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Boolean bool = this.O;
        if (bool == null) {
            return !cz.f23414i1;
        }
        return bool.booleanValue();
    }

    public final boolean k(org.telegram.ui.Cells.f fVar) {
        if (i()) {
            return true;
        }
        if (fVar != null) {
            if (this.Y == null) {
                this.Y = new ArrayList();
            }
            if (!this.Y.contains(fVar)) {
                this.Y.add(fVar);
            }
        }
        if (!this.X) {
            this.X = true;
            if (Z == null) {
                Z = new r5("livePhotoQueue", true);
            }
            Z.postRunnable(new ef(this, 0));
            return false;
        }
        return false;
    }

    public final void l() {
        d3.w wVar;
        a8.va vaVar;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        n3.c cVar = null;
        try {
            wVar = d3.w.b(new File(str));
        } catch (Exception e10) {
            a8.g(e10, true);
            wVar = null;
        }
        if (wVar != null) {
            long j3 = wVar.f7791a;
            if (j3 > 0) {
                this.f28059b = true;
                this.W = true;
                this.f28068m = j3;
                this.P = wVar.f7792b;
            }
        } else {
            try {
                String b10 = new u1.g(new File(str)).b("Xmp");
                if (b10 != null) {
                    try {
                        vaVar = n3.d.a(b10);
                    } catch (e2.t0 | NumberFormatException | XmlPullParserException unused) {
                        h2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        vaVar = null;
                    }
                    if (vaVar != null) {
                        h9.t1 t1Var = (h9.t1) vaVar.f694c;
                        n3.c cVar2 = null;
                        for (int i7 = 0; i7 < t1Var.d; i7++) {
                            n3.c cVar3 = (n3.c) t1Var.get(i7);
                            String str2 = cVar3.f21334b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null && cVar2.f21335c > 0) {
                            try {
                                this.f28059b = true;
                                this.W = true;
                                this.f28068m = new File(str).length() - cVar2.f21335c;
                                this.P = vaVar.f693b;
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                a8.g(e12, true);
                this.W = false;
            }
        }
        StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
        sb2.append(this.W);
        sb2.append(" in ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        p5.c.s("ms", sb2);
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ff.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ff(int i7, String str, int i10, boolean z10, int i11, int i12) {
        this.Q = -1;
        this.B = 0;
        this.C = i7;
        this.D = 0L;
        this.I = str;
        this.F = i11;
        this.G = i12;
        this.H = 0L;
        if (z10) {
            this.E = i10;
        } else {
            this.J = i10;
        }
        this.f28059b = z10;
    }
}
