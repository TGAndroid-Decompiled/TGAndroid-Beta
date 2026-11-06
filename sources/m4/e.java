package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.ui.Cells.f1;
public final class e implements i {
    public static final byte[] f19610x = {73, 68, 51};
    public final boolean f19611a;
    public final String d;
    public final int f19614e;
    public final String f19615f;
    public String f19616g;
    public j0 h;
    public j0 f19617i;
    public boolean f19621m;
    public boolean f19622n;
    public int f19625q;
    public boolean f19626r;
    public int f19628t;
    public j0 v;
    public long f19630w;
    public final d4.f f19612b = new d4.f(new byte[7], 7);
    public final h2.x f19613c = new h2.x(Arrays.copyOf(f19610x, 10));
    public int f19623o = -1;
    public int f19624p = -1;
    public long f19627s = -9223372036854775807L;
    public long f19629u = -9223372036854775807L;
    public int f19618j = 0;
    public int f19619k = 0;
    public int f19620l = 256;

    public e(int i7, String str, String str2, boolean z9) {
        this.f19611a = z9;
        this.d = str;
        this.f19614e = i7;
        this.f19615f = str2;
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
        boolean z9;
        int i14;
        this.h.getClass();
        String str = m0.f14112a;
        while (xVar.a() > 0) {
            int i15 = this.f19618j;
            char c13 = 65535;
            h2.x xVar2 = this.f19613c;
            int i16 = 3;
            d4.f fVar = this.f19612b;
            int i17 = 0;
            int i18 = 4;
            boolean z10 = true;
            int i19 = 1;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                int min = Math.min(xVar.a(), this.f19628t - this.f19619k);
                                this.v.b(min, xVar);
                                int i20 = this.f19619k + min;
                                this.f19619k = i20;
                                if (i20 == this.f19628t) {
                                    if (this.f19629u == -9223372036854775807L) {
                                        z10 = false;
                                    }
                                    ia.p(z10);
                                    this.v.c(this.f19629u, 1, this.f19628t, 0, null);
                                    this.f19629u += this.f19630w;
                                    this.f19618j = 0;
                                    this.f19619k = 0;
                                    this.f19620l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f19621m) {
                                i7 = 7;
                            } else {
                                i7 = 5;
                            }
                            int min2 = Math.min(xVar.a(), i7 - this.f19619k);
                            xVar.k(this.f19619k, min2, (byte[]) fVar.f8164b);
                            int i21 = this.f19619k + min2;
                            this.f19619k = i21;
                            if (i21 == i7) {
                                fVar.J(0);
                                if (!this.f19626r) {
                                    int j3 = fVar.j(2) + 1;
                                    if (j3 != 2) {
                                        h2.a.l("AdtsReader", "Detected audio object type: " + j3 + ", but assuming AAC LC.");
                                        j3 = 2;
                                    }
                                    fVar.L(5);
                                    int j10 = fVar.j(3);
                                    int i22 = this.f19624p;
                                    byte[] bArr = {(byte) (((j3 << 3) & 248) | ((i22 >> 1) & 7)), (byte) (((j10 << 3) & 120) | ((i22 << 7) & 128))};
                                    f3.a n10 = f3.b.n(new d4.f(bArr, 2), false);
                                    e2.t tVar = new e2.t();
                                    tVar.f10548a = this.f19616g;
                                    tVar.f10562q = s0.n(this.f19615f);
                                    tVar.f10563r = s0.n("audio/mp4a-latm");
                                    tVar.f10555j = n10.f10961a;
                                    tVar.J = n10.f10963c;
                                    tVar.K = n10.f10962b;
                                    tVar.f10566u = Collections.singletonList(bArr);
                                    tVar.d = this.d;
                                    tVar.f10552f = this.f19614e;
                                    e2.u uVar = new e2.u(tVar);
                                    this.f19627s = 1024000000 / uVar.L;
                                    this.h.g(uVar);
                                    this.f19626r = true;
                                } else {
                                    fVar.L(10);
                                }
                                fVar.L(4);
                                int j11 = fVar.j(13);
                                int i23 = j11 - 7;
                                if (this.f19621m) {
                                    i23 = j11 - 9;
                                }
                                j0 j0Var = this.h;
                                long j12 = this.f19627s;
                                this.f19618j = 4;
                                this.f19619k = 0;
                                this.v = j0Var;
                                this.f19630w = j12;
                                this.f19628t = i23;
                            }
                        }
                    } else {
                        byte[] bArr2 = xVar2.f14162a;
                        int min3 = Math.min(xVar.a(), 10 - this.f19619k);
                        xVar.k(this.f19619k, min3, bArr2);
                        int i24 = this.f19619k + min3;
                        this.f19619k = i24;
                        if (i24 == 10) {
                            this.f19617i.b(10, xVar2);
                            xVar2.N(6);
                            j0 j0Var2 = this.f19617i;
                            this.f19618j = 4;
                            this.f19619k = 10;
                            this.v = j0Var2;
                            this.f19630w = 0L;
                            this.f19628t = xVar2.z() + 10;
                        }
                    }
                } else if (xVar.a() != 0) {
                    ((byte[]) fVar.f8164b)[0] = xVar.f14162a[xVar.f14163b];
                    fVar.J(2);
                    int j13 = fVar.j(4);
                    int i25 = this.f19624p;
                    if (i25 != -1 && j13 != i25) {
                        this.f19622n = false;
                        this.f19618j = 0;
                        this.f19619k = 0;
                        this.f19620l = 256;
                    } else {
                        if (!this.f19622n) {
                            this.f19622n = true;
                            this.f19623o = this.f19625q;
                            this.f19624p = j13;
                        }
                        this.f19618j = 3;
                        this.f19619k = 0;
                    }
                }
            } else {
                byte[] bArr3 = xVar.f14162a;
                int i26 = xVar.f14163b;
                int i27 = xVar.f14164c;
                while (true) {
                    if (i26 < i27) {
                        i10 = i26 + 1;
                        i11 = i16;
                        b10 = bArr3[i26];
                        int i28 = b10 & 255;
                        if (this.f19620l == 512 && (((65280 | ((((byte) i28) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f19622n) {
                                break;
                            }
                            int i29 = i26 - 1;
                            xVar.N(i26);
                            byte[] bArr4 = (byte[]) fVar.f8164b;
                            if (xVar.a() >= i19) {
                                xVar.k(i17, i19, bArr4);
                                fVar.J(i18);
                                int j14 = fVar.j(i19);
                                int i30 = this.f19623o;
                                if (i30 != -1 && j14 != i30) {
                                    c10 = 65535;
                                } else {
                                    if (this.f19624p != -1) {
                                        byte[] bArr5 = (byte[]) fVar.f8164b;
                                        if (xVar.a() < i19) {
                                            break;
                                        }
                                        xVar.k(i17, i19, bArr5);
                                        fVar.J(2);
                                        i14 = 4;
                                        if (fVar.j(4) == this.f19624p) {
                                            xVar.N(i10);
                                        }
                                    } else {
                                        i14 = 4;
                                    }
                                    byte[] bArr6 = (byte[]) fVar.f8164b;
                                    if (xVar.a() >= i14) {
                                        xVar.k(i17, i14, bArr6);
                                        fVar.J(14);
                                        int j15 = fVar.j(13);
                                        if (j15 >= 7) {
                                            byte[] bArr7 = xVar.f14162a;
                                            int i31 = xVar.f14164c;
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
                        int i36 = this.f19620l;
                        int i37 = i28 | i36;
                        if (i37 != 329) {
                            if (i37 != 511) {
                                if (i37 != 836) {
                                    if (i37 != 1075) {
                                        c11 = 256;
                                        if (i36 != 256) {
                                            this.f19620l = 256;
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
                                        this.f19618j = 2;
                                        this.f19619k = 3;
                                        this.f19628t = 0;
                                        xVar2.N(0);
                                        xVar.N(i10);
                                        break;
                                    }
                                } else {
                                    i12 = 3;
                                    c11 = 256;
                                    i13 = 0;
                                    c12 = 2;
                                    this.f19620l = 1024;
                                }
                            } else {
                                i12 = 3;
                                c11 = 256;
                                i13 = 0;
                                c12 = 2;
                                this.f19620l = 512;
                            }
                        } else {
                            i12 = 3;
                            c11 = 256;
                            i13 = 0;
                            c12 = 2;
                            this.f19620l = 768;
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
                this.f19625q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f19621m = z9;
                if (!this.f19622n) {
                    this.f19618j = 1;
                    this.f19619k = 0;
                } else {
                    this.f19618j = i11;
                    this.f19619k = 0;
                }
                xVar.N(i10);
            }
        }
    }

    @Override
    public final void d() {
        this.f19629u = -9223372036854775807L;
        this.f19622n = false;
        this.f19618j = 0;
        this.f19619k = 0;
        this.f19620l = 256;
    }

    @Override
    public final void f(int i7, long j3) {
        this.f19629u = j3;
    }

    @Override
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f19616g = (String) g0Var.f19671e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19670c, 1);
        this.h = O1;
        this.v = O1;
        if (this.f19611a) {
            g0Var.b();
            g0Var.c();
            j0 O12 = qVar.O1(g0Var.f19670c, 5);
            this.f19617i = O12;
            e2.t tVar = new e2.t();
            g0Var.c();
            tVar.f10548a = (String) g0Var.f19671e;
            tVar.f10562q = s0.n(this.f19615f);
            tVar.f10563r = s0.n("application/id3");
            f1.s(tVar, O12);
            return;
        }
        this.f19617i = new f3.n();
    }

    @Override
    public final void e(boolean z9) {
    }
}
