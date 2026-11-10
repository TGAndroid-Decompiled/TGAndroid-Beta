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
        this.f26849b = z9;
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
                    if (!this.f26849b) {
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
        if (this.f26849b && this.f26854i != null) {
            new File(this.f26854i).delete();
            this.f26854i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final gf clone() {
        gf gfVar = new gf(this.B, this.C, this.D, this.I, this.J, this.E, this.f26849b, this.F, this.G, this.H);
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
        this.f26848a = gfVar.f26848a;
        this.f26850c = gfVar.f26850c;
        this.h = gfVar.h;
        this.f26854i = gfVar.f26854i;
        this.f26855j = gfVar.f26855j;
        this.f26856k = gfVar.f26856k;
        this.f26857l = gfVar.f26857l;
        this.f26859n = gfVar.f26859n;
        this.f26860o = gfVar.f26860o;
        this.f26861p = gfVar.f26861p;
        this.f26862q = gfVar.f26862q;
        this.f26863r = gfVar.f26863r;
        this.f26864s = gfVar.f26864s;
        this.f26865t = gfVar.f26865t;
        this.f26866u = gfVar.f26866u;
        this.v = gfVar.v;
        this.f26867w = gfVar.f26867w;
        this.f26858m = gfVar.f26858m;
        this.f26868x = gfVar.f26868x;
        this.A = gfVar.A;
        this.f26853g = gfVar.f26853g;
        this.f26870z = gfVar.f26870z;
        this.M = gfVar.M;
        this.N = gfVar.N;
        this.V = gfVar.V;
        this.W = gfVar.W;
        this.f26858m = gfVar.f26858m;
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
        if (this.f26857l != null) {
            try {
                new File(this.f26857l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f26855j != null) {
            try {
                new File(this.f26855j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f26854i != null) {
            try {
                new File(this.f26854i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f26856k != null) {
            try {
                new File(this.f26856k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (!this.V) {
            if (!this.f26849b || this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Boolean bool = this.O;
        if (bool == null) {
            return !iz.f23413i1;
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
            long j3 = xVar.f8096a;
            if (j3 > 0) {
                this.f26849b = true;
                this.W = true;
                this.f26858m = j3;
                this.P = xVar.f8097b;
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
                            String str2 = cVar3.f20378b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null && cVar2.f20379c > 0) {
                            try {
                                this.f26849b = true;
                                this.W = true;
                                this.f26858m = new File(str).length() - cVar2.f20379c;
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
        this.f26849b = z9;
    }
}
