package org.telegram.messenger;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class gf extends ze {
    public static q5 Z;
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

    public gf(int i7, int i10, long j3, String str, int i11, int i12, boolean z9, int i13, int i14, long j10) {
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
        this.f26845b = z9;
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
                    if (!this.f26845b) {
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
        if (this.f26845b && this.f26850i != null) {
            new File(this.f26850i).delete();
            this.f26850i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final gf clone() {
        gf gfVar = new gf(this.B, this.C, this.D, this.I, this.J, this.E, this.f26845b, this.F, this.G, this.H);
        gfVar.K = this.K;
        gfVar.L = this.L;
        gfVar.M = this.M;
        gfVar.N = this.N;
        gfVar.R = this.R;
        gfVar.S = this.S;
        gfVar.T = this.T;
        gfVar.U = this.U;
        gfVar.O = this.O;
        gfVar.g(this);
        return gfVar;
    }

    public final void g(gf gfVar) {
        this.f26844a = gfVar.f26844a;
        this.f26846c = gfVar.f26846c;
        this.h = gfVar.h;
        this.f26850i = gfVar.f26850i;
        this.f26851j = gfVar.f26851j;
        this.f26852k = gfVar.f26852k;
        this.f26853l = gfVar.f26853l;
        this.f26855n = gfVar.f26855n;
        this.f26856o = gfVar.f26856o;
        this.f26857p = gfVar.f26857p;
        this.f26858q = gfVar.f26858q;
        this.f26859r = gfVar.f26859r;
        this.f26860s = gfVar.f26860s;
        this.f26861t = gfVar.f26861t;
        this.f26862u = gfVar.f26862u;
        this.v = gfVar.v;
        this.f26863w = gfVar.f26863w;
        this.f26854m = gfVar.f26854m;
        this.f26864x = gfVar.f26864x;
        this.A = gfVar.A;
        this.f26849g = gfVar.f26849g;
        this.f26866z = gfVar.f26866z;
        this.M = gfVar.M;
        this.N = gfVar.N;
        this.V = gfVar.V;
        this.W = gfVar.W;
        this.f26854m = gfVar.f26854m;
        this.P = gfVar.P;
    }

    public final void h() {
        String str = this.I;
        if (str != null) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
        if (this.f26853l != null) {
            try {
                new File(this.f26853l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f26851j != null) {
            try {
                new File(this.f26851j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f26850i != null) {
            try {
                new File(this.f26850i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f26852k != null) {
            try {
                new File(this.f26852k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (!this.V) {
            if (!this.f26845b || this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Boolean bool = this.O;
        if (bool == null) {
            return !iz.f23409i1;
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
                Z = new q5("livePhotoQueue", true);
            }
            Z.postRunnable(new ff(this, 0));
            return false;
        }
        return false;
    }

    public final void l() {
        d3.x xVar;
        a8.ua uaVar;
        String str = this.I;
        long currentTimeMillis = System.currentTimeMillis();
        n3.c cVar = null;
        try {
            xVar = d3.x.b(new File(str));
        } catch (Exception e10) {
            a8.g(e10, true);
            xVar = null;
        }
        if (xVar != null) {
            long j3 = xVar.f8093a;
            if (j3 > 0) {
                this.f26845b = true;
                this.W = true;
                this.f26854m = j3;
                this.P = xVar.f8094b;
            }
        } else {
            try {
                String b10 = new u1.g(new File(str)).b("Xmp");
                if (b10 != null) {
                    try {
                        uaVar = n3.d.a(b10);
                    } catch (e2.t0 | NumberFormatException | XmlPullParserException unused) {
                        h2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        uaVar = null;
                    }
                    if (uaVar != null) {
                        h9.t1 t1Var = (h9.t1) uaVar.f680c;
                        n3.c cVar2 = null;
                        for (int i7 = 0; i7 < t1Var.d; i7++) {
                            n3.c cVar3 = (n3.c) t1Var.get(i7);
                            String str2 = cVar3.f20373b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null && cVar2.f20374c > 0) {
                            try {
                                this.f26845b = true;
                                this.W = true;
                                this.f26854m = new File(str).length() - cVar2.f20374c;
                                this.P = uaVar.f679b;
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
        org.telegram.ui.Cells.f1.u("ms", sb2);
    }

    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gf.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public gf(int i7, String str, int i10, boolean z9, int i11, int i12) {
        this.Q = -1;
        this.B = 0;
        this.C = i7;
        this.D = 0L;
        this.I = str;
        this.F = i11;
        this.G = i12;
        this.H = 0L;
        if (z9) {
            this.E = i10;
        } else {
            this.J = i10;
        }
        this.f26845b = z9;
    }
}
