package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class xlc extends yab {
    public e7a n;
    public int o;
    public boolean p;
    public ylc q;
    public cf9 r;

    @Override
    public final void a(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        ylc ylcVar = this.q;
        if (ylcVar != null) {
            i = ylcVar.e;
        }
        this.o = i;
    }

    @Override
    public final long b(yw7 yw7Var) {
        int i;
        int i2 = 0;
        if ((yw7Var.a[0] & 1) == 1) {
            return -1L;
        }
        e7a e7aVar = this.n;
        e7aVar.getClass();
        byte b = yw7Var.a[0];
        ylc ylcVar = (ylc) e7aVar.a;
        gp5[] gp5VarArr = (gp5[]) e7aVar.d;
        if (gp5VarArr[(b >> 1) & (255 >>> (8 - c0f.a(gp5VarArr.length - 1)))].b) {
            i = ylcVar.f;
        } else {
            i = ylcVar.e;
        }
        int i3 = this.o;
        if (this.p) {
            i2 = (i3 + i) / 4;
        }
        long j = i2;
        byte[] bArr = yw7Var.a;
        int length = bArr.length;
        int i4 = yw7Var.c + 4;
        if (length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            yw7Var.L(copyOf.length, copyOf);
        } else {
            yw7Var.M(i4);
        }
        byte[] bArr2 = yw7Var.a;
        int i5 = yw7Var.c;
        bArr2[i5 - 4] = (byte) (j & 255);
        bArr2[i5 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i5 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i5 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override
    public final boolean c(yw7 yw7Var, long j, xab xabVar) {
        e7a e7aVar;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        if (this.n != null) {
            ((go4) xabVar.b).getClass();
            return false;
        }
        ylc ylcVar = this.q;
        int i5 = 4;
        if (ylcVar == null) {
            c0f.c(1, yw7Var, false);
            yw7Var.s();
            int A = yw7Var.A();
            int s = yw7Var.s();
            int o = yw7Var.o();
            if (o <= 0) {
                i3 = -1;
            } else {
                i3 = o;
            }
            int o2 = yw7Var.o();
            if (o2 <= 0) {
                i4 = -1;
            } else {
                i4 = o2;
            }
            yw7Var.o();
            int A2 = yw7Var.A();
            yw7Var.A();
            this.q = new ylc(A, s, i3, i4, (int) Math.pow(2.0d, A2 & 15), (int) Math.pow(2.0d, (A2 & 240) >> 4), Arrays.copyOf(yw7Var.a, yw7Var.c));
        } else {
            cf9 cf9Var = this.r;
            if (cf9Var == null) {
                this.r = c0f.b(yw7Var, true, true);
            } else {
                int i6 = yw7Var.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(yw7Var.a, 0, bArr, 0, i6);
                short s2 = ylcVar.a;
                int i7 = 5;
                c0f.c(5, yw7Var, false);
                int A3 = yw7Var.A() + 1;
                ye1 ye1Var = new ye1(yw7Var.a);
                int i8 = 3;
                ye1Var.n(yw7Var.b << 3);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    int i12 = i8;
                    if (i9 < A3) {
                        if (ye1Var.f(24) == 5653314) {
                            int f = ye1Var.f(16);
                            int f2 = ye1Var.f(24);
                            if (!ye1Var.e()) {
                                boolean e = ye1Var.e();
                                for (int i13 = 0; i13 < f2; i13++) {
                                    if (e) {
                                        if (ye1Var.e()) {
                                            ye1Var.n(5);
                                        }
                                    } else {
                                        ye1Var.n(5);
                                    }
                                }
                            } else {
                                ye1Var.n(5);
                                for (int i14 = 0; i14 < f2; i14 += ye1Var.f(c0f.a(f2 - i14))) {
                                }
                            }
                            int f3 = ye1Var.f(4);
                            if (f3 <= 2) {
                                if (f3 == 1 || f3 == 2) {
                                    ye1Var.n(32);
                                    ye1Var.n(32);
                                    int f4 = ye1Var.f(4) + 1;
                                    ye1Var.n(1);
                                    if (f3 == 1) {
                                        if (f != 0) {
                                            j2 = (long) Math.floor(Math.pow(f2, 1.0d / f));
                                        } else {
                                            j2 = 0;
                                        }
                                    } else {
                                        j2 = f * f2;
                                    }
                                    ye1Var.n((int) (j2 * f4));
                                }
                                i9++;
                                i8 = i12;
                            } else {
                                throw bx7.a("lookup type greater than 2 not decodable: " + f3, null);
                            }
                        } else {
                            throw bx7.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((ye1Var.d << 3) + ye1Var.e), null);
                        }
                    } else {
                        int i15 = 6;
                        int f5 = ye1Var.f(6) + 1;
                        for (int i16 = 0; i16 < f5; i16++) {
                            if (ye1Var.f(16) != 0) {
                                throw bx7.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i17 = 1;
                        int f6 = ye1Var.f(6) + 1;
                        int i18 = 0;
                        while (i18 < f6) {
                            int f7 = ye1Var.f(i11);
                            if (f7 != 0) {
                                if (f7 == i17) {
                                    int f8 = ye1Var.f(i7);
                                    int[] iArr = new int[f8];
                                    int i19 = -1;
                                    for (int i20 = 0; i20 < f8; i20++) {
                                        int f9 = ye1Var.f(i5);
                                        iArr[i20] = f9;
                                        if (f9 > i19) {
                                            i19 = f9;
                                        }
                                    }
                                    int i21 = i19 + 1;
                                    int[] iArr2 = new int[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        iArr2[i22] = ye1Var.f(i12) + 1;
                                        int f10 = ye1Var.f(i10);
                                        if (f10 > 0) {
                                            ye1Var.n(8);
                                        }
                                        int i23 = 0;
                                        for (int i24 = 1; i23 < (i24 << f10); i24 = 1) {
                                            ye1Var.n(8);
                                            i23++;
                                        }
                                        i22++;
                                        i12 = 3;
                                        i10 = 2;
                                    }
                                    ye1Var.n(i10);
                                    int f11 = ye1Var.f(4);
                                    int i25 = 0;
                                    int i26 = 0;
                                    for (int i27 = 0; i27 < f8; i27++) {
                                        i25 += iArr2[iArr[i27]];
                                        while (i26 < i25) {
                                            ye1Var.n(f11);
                                            i26++;
                                        }
                                    }
                                } else {
                                    throw bx7.a("floor type greater than 1 not decodable: " + f7, null);
                                }
                            } else {
                                int i28 = 8;
                                ye1Var.n(8);
                                ye1Var.n(16);
                                ye1Var.n(16);
                                ye1Var.n(6);
                                ye1Var.n(8);
                                int f12 = ye1Var.f(4) + 1;
                                int i29 = 0;
                                while (i29 < f12) {
                                    ye1Var.n(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            }
                            i18++;
                            i12 = 3;
                            i15 = 6;
                            i10 = 2;
                            i5 = 4;
                            i11 = 16;
                            i7 = 5;
                            i17 = 1;
                        }
                        int f13 = ye1Var.f(i15) + 1;
                        int i30 = 0;
                        while (i30 < f13) {
                            if (ye1Var.f(16) <= 2) {
                                ye1Var.n(24);
                                ye1Var.n(24);
                                ye1Var.n(24);
                                int f14 = ye1Var.f(i15) + 1;
                                ye1Var.n(8);
                                int[] iArr3 = new int[f14];
                                for (int i31 = 0; i31 < f14; i31++) {
                                    int f15 = ye1Var.f(3);
                                    if (ye1Var.e()) {
                                        i2 = ye1Var.f(5);
                                    } else {
                                        i2 = 0;
                                    }
                                    iArr3[i31] = (i2 << 3) + f15;
                                }
                                for (int i32 = 0; i32 < f14; i32++) {
                                    for (int i33 = 0; i33 < 8; i33++) {
                                        if ((iArr3[i32] & (1 << i33)) != 0) {
                                            ye1Var.n(8);
                                        }
                                    }
                                }
                                i30++;
                                i15 = 6;
                            } else {
                                throw bx7.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int f16 = ye1Var.f(i15) + 1;
                        for (int i34 = 0; i34 < f16; i34++) {
                            int f17 = ye1Var.f(16);
                            if (f17 != 0) {
                                ncd.c("VorbisUtil", "mapping type other than 0 not supported: " + f17);
                            } else {
                                if (ye1Var.e()) {
                                    i = ye1Var.f(4) + 1;
                                } else {
                                    i = 1;
                                }
                                if (ye1Var.e()) {
                                    int f18 = ye1Var.f(8) + 1;
                                    for (int i35 = 0; i35 < f18; i35++) {
                                        int i36 = s2 - 1;
                                        ye1Var.n(c0f.a(i36));
                                        ye1Var.n(c0f.a(i36));
                                    }
                                }
                                if (ye1Var.f(2) == 0) {
                                    if (i > 1) {
                                        for (int i37 = 0; i37 < s2; i37++) {
                                            ye1Var.n(4);
                                        }
                                    }
                                    for (int i38 = 0; i38 < i; i38++) {
                                        ye1Var.n(8);
                                        ye1Var.n(8);
                                        ye1Var.n(8);
                                    }
                                } else {
                                    throw bx7.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                        }
                        int f19 = ye1Var.f(6) + 1;
                        gp5[] gp5VarArr = new gp5[f19];
                        for (int i39 = 0; i39 < f19; i39++) {
                            boolean e2 = ye1Var.e();
                            ye1Var.f(16);
                            ye1Var.f(16);
                            ye1Var.f(8);
                            gp5VarArr[i39] = new gp5((byte) 4, e2);
                        }
                        if (ye1Var.e()) {
                            e7aVar = new e7a(ylcVar, cf9Var, bArr, gp5VarArr);
                        } else {
                            throw bx7.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        e7aVar = null;
        this.n = e7aVar;
        if (e7aVar == null) {
            return true;
        }
        ylc ylcVar2 = (ylc) e7aVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ylcVar2.g);
        arrayList.add((byte[]) e7aVar.c);
        nf7 a = zlc.a(mo5.r((String[]) ((cf9) e7aVar.b).b));
        fo4 fo4Var = new fo4();
        fo4Var.r = wf7.n("audio/ogg");
        fo4Var.s = wf7.n("audio/vorbis");
        fo4Var.i = ylcVar2.d;
        fo4Var.j = ylcVar2.c;
        fo4Var.M = ylcVar2.a;
        fo4Var.O = ylcVar2.b;
        fo4Var.v = arrayList;
        fo4Var.l = a;
        xabVar.b = new go4(fo4Var);
        return true;
    }

    @Override
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
