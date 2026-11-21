package m4;

import a8.la;
import e2.s0;
import f3.i0;
import h2.l0;
import java.util.Arrays;
import java.util.Collections;
public final class e implements i {
    public static final byte[] f20614x = {73, 68, 51};
    public final boolean f20615a;
    public final String d;
    public final int f20618e;
    public final String f20619f;
    public String f20620g;
    public i0 h;
    public i0 f20621i;
    public boolean f20625m;
    public boolean f20626n;
    public int f20629q;
    public boolean f20630r;
    public int f20632t;
    public i0 v;
    public long f20634w;
    public final d4.f f20616b = new d4.f(new byte[7], 7);
    public final h2.x f20617c = new h2.x(Arrays.copyOf(f20614x, 10));
    public int f20627o = -1;
    public int f20628p = -1;
    public long f20631s = -9223372036854775807L;
    public long f20633u = -9223372036854775807L;
    public int f20622j = 0;
    public int f20623k = 0;
    public int f20624l = 256;

    public e(int i7, String str, String str2, boolean z10) {
        this.f20615a = z10;
        this.d = str;
        this.f20618e = i7;
        this.f20619f = str2;
    }

    @Override
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        int i11;
        byte b10;
        char c10;
        ?? r42;
        int i12;
        char c11;
        int i13;
        char c12;
        boolean z10;
        int i14;
        this.h.getClass();
        String str = l0.f13812a;
        while (xVar.a() > 0) {
            int i15 = this.f20622j;
            char c13 = 65535;
            h2.x xVar2 = this.f20617c;
            int i16 = 3;
            d4.f fVar = this.f20616b;
            int i17 = 0;
            int i18 = 4;
            boolean z11 = true;
            int i19 = 1;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                int min = Math.min(xVar.a(), this.f20632t - this.f20623k);
                                this.v.b(min, xVar);
                                int i20 = this.f20623k + min;
                                this.f20623k = i20;
                                if (i20 == this.f20632t) {
                                    if (this.f20633u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    la.p(z11);
                                    this.v.c(this.f20633u, 1, this.f20632t, 0, null);
                                    this.f20633u += this.f20634w;
                                    this.f20622j = 0;
                                    this.f20623k = 0;
                                    this.f20624l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f20625m) {
                                i7 = 7;
                            } else {
                                i7 = 5;
                            }
                            int min2 = Math.min(xVar.a(), i7 - this.f20623k);
                            xVar.k(this.f20623k, min2, (byte[]) fVar.f7862b);
                            int i21 = this.f20623k + min2;
                            this.f20623k = i21;
                            if (i21 == i7) {
                                fVar.J(0);
                                if (!this.f20630r) {
                                    int j3 = fVar.j(2) + 1;
                                    if (j3 != 2) {
                                        h2.a.l("AdtsReader", "Detected audio object type: " + j3 + ", but assuming AAC LC.");
                                        j3 = 2;
                                    }
                                    fVar.L(5);
                                    int j10 = fVar.j(3);
                                    int i22 = this.f20628p;
                                    byte[] bArr = {(byte) (((j3 << 3) & 248) | ((i22 >> 1) & 7)), (byte) (((j10 << 3) & 120) | ((i22 << 7) & 128))};
                                    f3.a n10 = f3.b.n(new d4.f(bArr, 2), false);
                                    e2.t tVar = new e2.t();
                                    tVar.f10728a = this.f20620g;
                                    tVar.f10742q = s0.n(this.f20619f);
                                    tVar.f10743r = s0.n("audio/mp4a-latm");
                                    tVar.f10735j = n10.f11122a;
                                    tVar.J = n10.f11124c;
                                    tVar.K = n10.f11123b;
                                    tVar.f10746u = Collections.singletonList(bArr);
                                    tVar.d = this.d;
                                    tVar.f10732f = this.f20618e;
                                    e2.u uVar = new e2.u(tVar);
                                    this.f20631s = 1024000000 / uVar.L;
                                    this.h.g(uVar);
                                    this.f20630r = true;
                                } else {
                                    fVar.L(10);
                                }
                                fVar.L(4);
                                int j11 = fVar.j(13);
                                int i23 = j11 - 7;
                                if (this.f20625m) {
                                    i23 = j11 - 9;
                                }
                                i0 i0Var = this.h;
                                long j12 = this.f20631s;
                                this.f20622j = 4;
                                this.f20623k = 0;
                                this.v = i0Var;
                                this.f20634w = j12;
                                this.f20632t = i23;
                            }
                        }
                    } else {
                        byte[] bArr2 = xVar2.f13862a;
                        int min3 = Math.min(xVar.a(), 10 - this.f20623k);
                        xVar.k(this.f20623k, min3, bArr2);
                        int i24 = this.f20623k + min3;
                        this.f20623k = i24;
                        if (i24 == 10) {
                            this.f20621i.b(10, xVar2);
                            xVar2.N(6);
                            i0 i0Var2 = this.f20621i;
                            this.f20622j = 4;
                            this.f20623k = 10;
                            this.v = i0Var2;
                            this.f20634w = 0L;
                            this.f20632t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    ((byte[]) fVar.f7862b)[0] = xVar.f13862a[xVar.f13863b];
                    fVar.J(2);
                    int j13 = fVar.j(4);
                    int i25 = this.f20628p;
                    if (i25 != -1 && j13 != i25) {
                        this.f20626n = false;
                        this.f20622j = 0;
                        this.f20623k = 0;
                        this.f20624l = 256;
                    } else {
                        if (!this.f20626n) {
                            this.f20626n = true;
                            this.f20627o = this.f20629q;
                            this.f20628p = j13;
                        }
                        this.f20622j = 3;
                        this.f20623k = 0;
                    }
                }
            } else {
                byte[] bArr3 = xVar.f13862a;
                int i26 = xVar.f13863b;
                int i27 = xVar.f13864c;
                while (true) {
                    if (i26 < i27) {
                        i10 = i26 + 1;
                        i11 = i16;
                        b10 = bArr3[i26];
                        int i28 = b10 & 255;
                        if (this.f20624l == 512 && (((65280 | ((((byte) i28) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f20626n) {
                                break;
                            }
                            int i29 = i26 - 1;
                            xVar.N(i26);
                            byte[] bArr4 = (byte[]) fVar.f7862b;
                            if (xVar.a() >= i19) {
                                xVar.k(i17, i19, bArr4);
                                fVar.J(i18);
                                int j14 = fVar.j(i19);
                                int i30 = this.f20627o;
                                if (i30 != -1 && j14 != i30) {
                                    c10 = 65535;
                                } else {
                                    if (this.f20628p != -1) {
                                        byte[] bArr5 = (byte[]) fVar.f7862b;
                                        if (xVar.a() < i19) {
                                            break;
                                        }
                                        xVar.k(i17, i19, bArr5);
                                        fVar.J(2);
                                        i14 = 4;
                                        if (fVar.j(4) == this.f20628p) {
                                            xVar.N(i10);
                                        }
                                    } else {
                                        i14 = 4;
                                    }
                                    byte[] bArr6 = (byte[]) fVar.f7862b;
                                    if (xVar.a() >= i14) {
                                        xVar.k(i17, i14, bArr6);
                                        fVar.J(14);
                                        int j15 = fVar.j(13);
                                        if (j15 >= 7) {
                                            byte[] bArr7 = xVar.f13862a;
                                            int i31 = xVar.f13864c;
                                            int i32 = i29 + j15;
                                            if (i32 < i31) {
                                                byte b11 = bArr7[i32];
                                                c10 = 65535;
                                                if (b11 == -1) {
                                                    int i33 = i32 + 1;
                                                    if (i33 != i31) {
                                                        byte b12 = bArr7[i33];
                                                        if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == j14) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b11 == 73) {
                                                    int i34 = i32 + 1;
                                                    if (i34 != i31) {
                                                        if (bArr7[i34] == 68) {
                                                            int i35 = i32 + 2;
                                                            if (i35 != i31) {
                                                                if (bArr7[i35] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                r42 = true;
                            }
                            c10 = 65535;
                            r42 = true;
                        } else {
                            c10 = c13;
                            r42 = i19;
                        }
                        int i36 = this.f20624l;
                        int i37 = i28 | i36;
                        if (i37 != 329) {
                            if (i37 != 511) {
                                if (i37 != 836) {
                                    if (i37 != 1075) {
                                        c11 = 256;
                                        if (i36 != 256) {
                                            this.f20624l = 256;
                                            i12 = 3;
                                            i13 = 0;
                                            c12 = 2;
                                            i19 = r42;
                                            c13 = c10;
                                            i18 = 4;
                                            i17 = i13;
                                            i16 = i12;
                                        } else {
                                            i12 = 3;
                                            i13 = 0;
                                            c12 = 2;
                                        }
                                    } else {
                                        this.f20622j = 2;
                                        this.f20623k = 3;
                                        this.f20632t = 0;
                                        xVar2.N(0);
                                        xVar.N(i10);
                                        break;
                                    }
                                } else {
                                    i12 = 3;
                                    c11 = 256;
                                    i13 = 0;
                                    c12 = 2;
                                    this.f20624l = 1024;
                                }
                            } else {
                                i12 = 3;
                                c11 = 256;
                                i13 = 0;
                                c12 = 2;
                                this.f20624l = 512;
                            }
                        } else {
                            i12 = 3;
                            c11 = 256;
                            i13 = 0;
                            c12 = 2;
                            this.f20624l = 768;
                        }
                        i26 = i10;
                        i19 = r42;
                        c13 = c10;
                        i18 = 4;
                        i17 = i13;
                        i16 = i12;
                    } else {
                        xVar.N(i26);
                        break;
                    }
                }
                this.f20629q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f20625m = z10;
                if (!this.f20626n) {
                    this.f20622j = 1;
                    this.f20623k = 0;
                } else {
                    this.f20622j = i11;
                    this.f20623k = 0;
                }
                xVar.N(i10);
            }
        }
    }

    @Override
    public final void d() {
        this.f20633u = -9223372036854775807L;
        this.f20626n = false;
        this.f20622j = 0;
        this.f20623k = 0;
        this.f20624l = 256;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f20633u = j3;
    }

    @Override
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f20620g = (String) f0Var.f20642e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20641c, 1);
        this.h = d2;
        this.v = d2;
        if (this.f20615a) {
            f0Var.b();
            f0Var.c();
            i0 d22 = qVar.d2(f0Var.f20641c, 5);
            this.f20621i = d22;
            e2.t tVar = new e2.t();
            f0Var.c();
            tVar.f10728a = (String) f0Var.f20642e;
            tVar.f10742q = s0.n(this.f20619f);
            tVar.f10743r = s0.n("application/id3");
            p5.c.r(tVar, d22);
            return;
        }
        this.f20621i = new f3.n();
    }

    @Override
    public final void e(boolean z10) {
    }
}
