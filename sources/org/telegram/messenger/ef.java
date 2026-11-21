package org.telegram.messenger;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class ef extends xe {
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

    public ef(int i7, int i10, long j3, String str, int i11, int i12, boolean z10, int i13, int i14, long j10) {
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
        this.f27875b = z10;
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
                    if (!this.f27875b) {
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
        if (this.f27875b && this.f27880i != null) {
            new File(this.f27880i).delete();
            this.f27880i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final ef clone() {
        ef efVar = new ef(this.B, this.C, this.D, this.I, this.J, this.E, this.f27875b, this.F, this.G, this.H);
        efVar.K = this.K;
        efVar.L = this.L;
        efVar.M = this.M;
        efVar.N = this.N;
        efVar.R = this.R;
        efVar.S = this.S;
        efVar.T = this.T;
        efVar.U = this.U;
        efVar.O = this.O;
        efVar.g(this);
        return efVar;
    }

    public final void g(ef efVar) {
        this.f27874a = efVar.f27874a;
        this.f27876c = efVar.f27876c;
        this.h = efVar.h;
        this.f27880i = efVar.f27880i;
        this.f27881j = efVar.f27881j;
        this.f27882k = efVar.f27882k;
        this.f27883l = efVar.f27883l;
        this.f27885n = efVar.f27885n;
        this.f27886o = efVar.f27886o;
        this.f27887p = efVar.f27887p;
        this.f27888q = efVar.f27888q;
        this.f27889r = efVar.f27889r;
        this.f27890s = efVar.f27890s;
        this.f27891t = efVar.f27891t;
        this.f27892u = efVar.f27892u;
        this.v = efVar.v;
        this.f27893w = efVar.f27893w;
        this.f27884m = efVar.f27884m;
        this.f27894x = efVar.f27894x;
        this.A = efVar.A;
        this.f27879g = efVar.f27879g;
        this.f27896z = efVar.f27896z;
        this.M = efVar.M;
        this.N = efVar.N;
        this.V = efVar.V;
        this.W = efVar.W;
        this.f27884m = efVar.f27884m;
        this.P = efVar.P;
    }

    public final void h() {
        String str = this.I;
        if (str != null) {
            try {
                new File(str).delete();
            } catch (Exception unused) {
            }
        }
        if (this.f27883l != null) {
            try {
                new File(this.f27883l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f27881j != null) {
            try {
                new File(this.f27881j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f27880i != null) {
            try {
                new File(this.f27880i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f27882k != null) {
            try {
                new File(this.f27882k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        if (!this.V) {
            if (!this.f27875b || this.X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j() {
        Boolean bool = this.O;
        if (bool == null) {
            return !bz.f23197i1;
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
            Z.postRunnable(new df(this, 0));
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
            long j3 = wVar.f7788a;
            if (j3 > 0) {
                this.f27875b = true;
                this.W = true;
                this.f27884m = j3;
                this.P = wVar.f7789b;
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
                            String str2 = cVar3.f21331b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null && cVar2.f21332c > 0) {
                            try {
                                this.f27875b = true;
                                this.W = true;
                                this.f27884m = new File(str).length() - cVar2.f21332c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ef.m():void");
    }

    public final void n(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ef(int i7, String str, int i10, boolean z10, int i11, int i12) {
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
        this.f27875b = z10;
    }
}
