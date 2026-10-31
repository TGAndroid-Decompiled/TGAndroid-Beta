package org.telegram.messenger;

import android.util.Pair;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.xmlpull.v1.XmlPullParserException;
public final class ef extends ze {
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

    public ef(int i10, int i11, long j10, String str, int i12, int i13, boolean z10, int i14, int i15, long j11) {
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
        this.f19507b = z10;
    }

    @Override
    public final String a() {
        return this.I;
    }

    @Override
    public final boolean d() {
        c3.g0 g0Var;
        String str = this.I;
        if (!this.f19507b && !this.V) {
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
                            String str2 = cVar3.f10838b;
                            if ("Primary".equalsIgnoreCase(str2)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str2)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null) {
                            long j10 = cVar2.f10839c;
                            if (j10 > 0) {
                                try {
                                    this.f19507b = true;
                                    this.W = true;
                                    this.f19515m = new File(str).length() - j10;
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
        if (this.f19507b && this.f19511i != null) {
            new File(this.f19511i).delete();
            this.f19511i = null;
        }
        this.M = false;
        this.N = 0L;
        super.e();
    }

    public final ef clone() {
        ef efVar = new ef(this.B, this.C, this.D, this.I, this.J, this.E, this.f19507b, this.F, this.G, this.H);
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
        this.f19506a = efVar.f19506a;
        this.f19508c = efVar.f19508c;
        this.h = efVar.h;
        this.f19511i = efVar.f19511i;
        this.f19512j = efVar.f19512j;
        this.f19513k = efVar.f19513k;
        this.f19514l = efVar.f19514l;
        this.f19516n = efVar.f19516n;
        this.f19517o = efVar.f19517o;
        this.f19518p = efVar.f19518p;
        this.f19519q = efVar.f19519q;
        this.f19520r = efVar.f19520r;
        this.f19521s = efVar.f19521s;
        this.f19522t = efVar.f19522t;
        this.f19523u = efVar.f19523u;
        this.v = efVar.v;
        this.f19524w = efVar.f19524w;
        this.f19515m = efVar.f19515m;
        this.f19525x = efVar.f19525x;
        this.A = efVar.A;
        this.f19510g = efVar.f19510g;
        this.f19527z = efVar.f19527z;
        this.M = efVar.M;
        this.N = efVar.N;
        this.V = efVar.V;
        this.W = efVar.W;
        this.f19515m = efVar.f19515m;
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
        if (this.f19514l != null) {
            try {
                new File(this.f19514l).delete();
            } catch (Exception unused2) {
            }
        }
        if (this.f19512j != null) {
            try {
                new File(this.f19512j).delete();
            } catch (Exception unused3) {
            }
        }
        if (this.h != null) {
            try {
                new File(this.h).delete();
            } catch (Exception unused4) {
            }
        }
        if (this.f19511i != null) {
            try {
                new File(this.f19511i).delete();
            } catch (Exception unused5) {
            }
        }
        if (this.f19513k != null) {
            try {
                new File(this.f19513k).delete();
            } catch (Exception unused6) {
            }
        }
    }

    public final boolean i() {
        Boolean bool = this.O;
        if (bool == null) {
            return !tz.f18154i1;
        }
        return bool.booleanValue();
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ef.j():void");
    }

    public final void k(Pair pair) {
        this.J = ((Integer) pair.first).intValue();
        this.K = ((Integer) pair.second).intValue();
    }

    public ef(int i10, String str, int i11, boolean z10, int i12, int i13) {
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
        this.f19507b = z10;
    }
}
