package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import g2.n0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.ui.Cells.f1;
public final class e implements i {
    public static final byte[] f17795x = {73, 68, 51};
    public final boolean f17796a;
    public final String d;
    public final int f17799e;
    public final String f17800f;
    public String f17801g;
    public i0 h;
    public i0 f17802i;
    public boolean f17806m;
    public boolean f17807n;
    public int f17810q;
    public boolean f17811r;
    public int f17813t;
    public i0 v;
    public long f17815w;
    public final c4.f f17797b = new c4.f(new byte[7], 7);
    public final g2.y f17798c = new g2.y(Arrays.copyOf(f17795x, 10));
    public int f17808o = -1;
    public int f17809p = -1;
    public long f17812s = -9223372036854775807L;
    public long f17814u = -9223372036854775807L;
    public int f17803j = 0;
    public int f17804k = 0;
    public int f17805l = 256;

    public e(int i3, String str, String str2, boolean z10) {
        this.f17796a = z10;
        this.d = str;
        this.f17799e = i3;
        this.f17800f = str2;
    }

    @Override
    public final void a() {
        this.f17814u = -9223372036854775807L;
        this.f17807n = false;
        this.f17803j = 0;
        this.f17804k = 0;
        this.f17805l = 256;
    }

    @Override
    public final void c(g2.y yVar) {
        int i3;
        int i10;
        int i11;
        byte b10;
        char c2;
        ?? r42;
        int i12;
        char c10;
        int i13;
        char c11;
        boolean z10;
        int i14;
        this.h.getClass();
        String str = n0.f11873a;
        while (yVar.a() > 0) {
            int i15 = this.f17803j;
            char c12 = 65535;
            g2.y yVar2 = this.f17798c;
            int i16 = 3;
            c4.f fVar = this.f17797b;
            int i17 = 0;
            int i18 = 4;
            boolean z11 = true;
            int i19 = 1;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                int min = Math.min(yVar.a(), this.f17813t - this.f17804k);
                                this.v.e(min, yVar);
                                int i20 = this.f17804k + min;
                                this.f17804k = i20;
                                if (i20 == this.f17813t) {
                                    if (this.f17814u == -9223372036854775807L) {
                                        z11 = false;
                                    }
                                    zb.p(z11);
                                    this.v.d(this.f17814u, 1, this.f17813t, 0, null);
                                    this.f17814u += this.f17815w;
                                    this.f17803j = 0;
                                    this.f17804k = 0;
                                    this.f17805l = 256;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f17806m) {
                                i3 = 7;
                            } else {
                                i3 = 5;
                            }
                            int min2 = Math.min(yVar.a(), i3 - this.f17804k);
                            yVar.k(this.f17804k, min2, (byte[]) fVar.f4190b);
                            int i21 = this.f17804k + min2;
                            this.f17804k = i21;
                            if (i21 == i3) {
                                fVar.J(0);
                                if (!this.f17811r) {
                                    int j10 = fVar.j(2) + 1;
                                    if (j10 != 2) {
                                        g2.a.l("AdtsReader", "Detected audio object type: " + j10 + ", but assuming AAC LC.");
                                        j10 = 2;
                                    }
                                    fVar.L(5);
                                    int j11 = fVar.j(3);
                                    int i22 = this.f17809p;
                                    byte[] bArr = {(byte) (((j10 << 3) & 248) | ((i22 >> 1) & 7)), (byte) (((j11 << 3) & 120) | ((i22 << 7) & 128))};
                                    e3.a n4 = e3.b.n(new c4.f(bArr, 2), false);
                                    d2.u uVar = new d2.u();
                                    uVar.f8416a = this.f17801g;
                                    uVar.f8430q = u0.n(this.f17800f);
                                    uVar.f8431r = u0.n("audio/mp4a-latm");
                                    uVar.f8423j = n4.f9403a;
                                    uVar.J = n4.f9405c;
                                    uVar.K = n4.f9404b;
                                    uVar.f8434u = Collections.singletonList(bArr);
                                    uVar.d = this.d;
                                    uVar.f8420f = this.f17799e;
                                    d2.v vVar = new d2.v(uVar);
                                    this.f17812s = 1024000000 / vVar.L;
                                    this.h.g(vVar);
                                    this.f17811r = true;
                                } else {
                                    fVar.L(10);
                                }
                                fVar.L(4);
                                int j12 = fVar.j(13);
                                int i23 = j12 - 7;
                                if (this.f17806m) {
                                    i23 = j12 - 9;
                                }
                                i0 i0Var = this.h;
                                long j13 = this.f17812s;
                                this.f17803j = 4;
                                this.f17804k = 0;
                                this.v = i0Var;
                                this.f17815w = j13;
                                this.f17813t = i23;
                            }
                        }
                    } else {
                        byte[] bArr2 = yVar2.f11923a;
                        int min3 = Math.min(yVar.a(), 10 - this.f17804k);
                        yVar.k(this.f17804k, min3, bArr2);
                        int i24 = this.f17804k + min3;
                        this.f17804k = i24;
                        if (i24 == 10) {
                            this.f17802i.e(10, yVar2);
                            yVar2.N(6);
                            i0 i0Var2 = this.f17802i;
                            this.f17803j = 4;
                            this.f17804k = 10;
                            this.v = i0Var2;
                            this.f17815w = 0L;
                            this.f17813t = yVar2.z() + 10;
                        }
                    }
                } else if (yVar.a() != 0) {
                    ((byte[]) fVar.f4190b)[0] = yVar.f11923a[yVar.f11924b];
                    fVar.J(2);
                    int j14 = fVar.j(4);
                    int i25 = this.f17809p;
                    if (i25 != -1 && j14 != i25) {
                        this.f17807n = false;
                        this.f17803j = 0;
                        this.f17804k = 0;
                        this.f17805l = 256;
                    } else {
                        if (!this.f17807n) {
                            this.f17807n = true;
                            this.f17808o = this.f17810q;
                            this.f17809p = j14;
                        }
                        this.f17803j = 3;
                        this.f17804k = 0;
                    }
                }
            } else {
                byte[] bArr3 = yVar.f11923a;
                int i26 = yVar.f11924b;
                int i27 = yVar.f11925c;
                while (true) {
                    if (i26 < i27) {
                        i10 = i26 + 1;
                        i11 = i16;
                        b10 = bArr3[i26];
                        int i28 = b10 & 255;
                        if (this.f17805l == 512 && (((65280 | ((((byte) i28) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.f17807n) {
                                break;
                            }
                            int i29 = i26 - 1;
                            yVar.N(i26);
                            byte[] bArr4 = (byte[]) fVar.f4190b;
                            if (yVar.a() >= i19) {
                                yVar.k(i17, i19, bArr4);
                                fVar.J(i18);
                                int j15 = fVar.j(i19);
                                int i30 = this.f17808o;
                                if (i30 != -1 && j15 != i30) {
                                    c2 = 65535;
                                } else {
                                    if (this.f17809p != -1) {
                                        byte[] bArr5 = (byte[]) fVar.f4190b;
                                        if (yVar.a() < i19) {
                                            break;
                                        }
                                        yVar.k(i17, i19, bArr5);
                                        fVar.J(2);
                                        i14 = 4;
                                        if (fVar.j(4) == this.f17809p) {
                                            yVar.N(i10);
                                        }
                                    } else {
                                        i14 = 4;
                                    }
                                    byte[] bArr6 = (byte[]) fVar.f4190b;
                                    if (yVar.a() >= i14) {
                                        yVar.k(i17, i14, bArr6);
                                        fVar.J(14);
                                        int j16 = fVar.j(13);
                                        if (j16 >= 7) {
                                            byte[] bArr7 = yVar.f11923a;
                                            int i31 = yVar.f11925c;
                                            int i32 = i29 + j16;
                                            if (i32 < i31) {
                                                byte b11 = bArr7[i32];
                                                c2 = 65535;
                                                if (b11 == -1) {
                                                    int i33 = i32 + 1;
                                                    if (i33 != i31) {
                                                        byte b12 = bArr7[i33];
                                                        if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == j15) {
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
                            c2 = 65535;
                            r42 = true;
                        } else {
                            c2 = c12;
                            r42 = i19;
                        }
                        int i36 = this.f17805l;
                        int i37 = i28 | i36;
                        if (i37 != 329) {
                            if (i37 != 511) {
                                if (i37 != 836) {
                                    if (i37 != 1075) {
                                        c10 = 256;
                                        if (i36 != 256) {
                                            this.f17805l = 256;
                                            i12 = 3;
                                            i13 = 0;
                                            c11 = 2;
                                            i19 = r42;
                                            c12 = c2;
                                            i18 = 4;
                                            i17 = i13;
                                            i16 = i12;
                                        } else {
                                            i12 = 3;
                                            i13 = 0;
                                            c11 = 2;
                                        }
                                    } else {
                                        this.f17803j = 2;
                                        this.f17804k = 3;
                                        this.f17813t = 0;
                                        yVar2.N(0);
                                        yVar.N(i10);
                                        break;
                                    }
                                } else {
                                    i12 = 3;
                                    c10 = 256;
                                    i13 = 0;
                                    c11 = 2;
                                    this.f17805l = 1024;
                                }
                            } else {
                                i12 = 3;
                                c10 = 256;
                                i13 = 0;
                                c11 = 2;
                                this.f17805l = 512;
                            }
                        } else {
                            i12 = 3;
                            c10 = 256;
                            i13 = 0;
                            c11 = 2;
                            this.f17805l = 768;
                        }
                        i26 = i10;
                        i19 = r42;
                        c12 = c2;
                        i18 = 4;
                        i17 = i13;
                        i16 = i12;
                    } else {
                        yVar.N(i26);
                        break;
                    }
                }
                this.f17810q = (b10 & 8) >> 3;
                if ((b10 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f17806m = z10;
                if (!this.f17807n) {
                    this.f17803j = 1;
                    this.f17804k = 0;
                } else {
                    this.f17803j = i11;
                    this.f17804k = 0;
                }
                yVar.N(i10);
            }
        }
    }

    @Override
    public final void e(int i3, long j10) {
        this.f17814u = j10;
    }

    @Override
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f17801g = (String) f0Var.f17823e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.f17822c, 1);
        this.h = i02;
        this.v = i02;
        if (this.f17796a) {
            f0Var.b();
            f0Var.c();
            i0 i03 = qVar.i0(f0Var.f17822c, 5);
            this.f17802i = i03;
            d2.u uVar = new d2.u();
            f0Var.c();
            uVar.f8416a = (String) f0Var.f17823e;
            uVar.f8430q = u0.n(this.f17800f);
            uVar.f8431r = u0.n("application/id3");
            f1.w(uVar, i03);
            return;
        }
        this.f17802i = new e3.n();
    }

    @Override
    public final void d(boolean z10) {
    }
}
