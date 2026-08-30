package b4;
public final class c0 implements i0 {
    public final b0 f1332a;
    public final h5.w f1333b = new h5.w(32);
    public int f1334c;
    public int d;
    public boolean e;
    public boolean f1335f;

    public c0(b0 b0Var) {
        this.f1332a = b0Var;
    }

    @Override
    public final void a(int i10, h5.w wVar) {
        boolean z4;
        int i11;
        boolean z10;
        if ((i10 & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i11 = wVar.f7001b + wVar.u();
        } else {
            i11 = -1;
        }
        if (this.f1335f) {
            if (z4) {
                this.f1335f = false;
                wVar.F(i11);
                this.d = 0;
            } else {
                return;
            }
        }
        while (wVar.a() > 0) {
            int i12 = this.d;
            h5.w wVar2 = this.f1333b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int u10 = wVar.u();
                    wVar.F(wVar.f7001b - 1);
                    if (u10 == 255) {
                        this.f1335f = true;
                        return;
                    }
                }
                int min = Math.min(wVar.a(), 3 - this.d);
                wVar.e(this.d, min, wVar2.f7000a);
                int i13 = this.d + min;
                this.d = i13;
                if (i13 == 3) {
                    wVar2.F(0);
                    wVar2.E(3);
                    wVar2.G(1);
                    int u11 = wVar2.u();
                    int u12 = wVar2.u();
                    if ((u11 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.e = z10;
                    int i14 = (((u11 & 15) << 8) | u12) + 3;
                    this.f1334c = i14;
                    byte[] bArr = wVar2.f7000a;
                    if (bArr.length < i14) {
                        wVar2.b(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(wVar.a(), this.f1334c - this.d);
                wVar.e(this.d, min2, wVar2.f7000a);
                int i15 = this.d + min2;
                this.d = i15;
                int i16 = this.f1334c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.e) {
                        if (h5.d0.k(0, i16, -1, wVar2.f7000a) != 0) {
                            this.f1335f = true;
                            return;
                        }
                        wVar2.E(this.f1334c - 4);
                    } else {
                        wVar2.E(i16);
                    }
                    wVar2.F(0);
                    this.f1332a.a(wVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override
    public final void b() {
        this.f1335f = true;
    }

    @Override
    public final void c(h5.c0 c0Var, r3.m mVar, h0 h0Var) {
        this.f1332a.c(c0Var, mVar, h0Var);
        this.f1335f = true;
    }
}
