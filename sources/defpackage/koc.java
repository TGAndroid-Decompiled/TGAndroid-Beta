package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class koc extends ucb {
    public u8a n;
    public int o;
    public boolean p;
    public loc q;
    public j09 r;

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
        loc locVar = this.q;
        if (locVar != null) {
            i = locVar.e;
        }
        this.o = i;
    }

    @Override
    public final long b(ey7 ey7Var) {
        int i;
        int i2 = 0;
        if ((ey7Var.a[0] & 1) == 1) {
            return -1L;
        }
        u8a u8aVar = this.n;
        u8aVar.getClass();
        byte b = ey7Var.a[0];
        loc locVar = (loc) u8aVar.a;
        jp5[] jp5VarArr = (jp5[]) u8aVar.d;
        if (jp5VarArr[(b >> 1) & (255 >>> (8 - s2f.a(jp5VarArr.length - 1)))].b) {
            i = locVar.f;
        } else {
            i = locVar.e;
        }
        int i3 = this.o;
        if (this.p) {
            i2 = (i3 + i) / 4;
        }
        long j = i2;
        byte[] bArr = ey7Var.a;
        int length = bArr.length;
        int i4 = ey7Var.c + 4;
        if (length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            ey7Var.L(copyOf.length, copyOf);
        } else {
            ey7Var.M(i4);
        }
        byte[] bArr2 = ey7Var.a;
        int i5 = ey7Var.c;
        bArr2[i5 - 4] = (byte) (j & 255);
        bArr2[i5 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i5 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i5 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override
    public final boolean c(ey7 ey7Var, long j, k7b k7bVar) {
        u8a u8aVar;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        if (this.n != null) {
            ((ko4) k7bVar.b).getClass();
            return false;
        }
        loc locVar = this.q;
        int i5 = 4;
        if (locVar == null) {
            s2f.c(1, ey7Var, false);
            ey7Var.s();
            int A = ey7Var.A();
            int s = ey7Var.s();
            int o = ey7Var.o();
            if (o <= 0) {
                i3 = -1;
            } else {
                i3 = o;
            }
            int o2 = ey7Var.o();
            if (o2 <= 0) {
                i4 = -1;
            } else {
                i4 = o2;
            }
            ey7Var.o();
            int A2 = ey7Var.A();
            ey7Var.A();
            this.q = new loc(A, s, i3, i4, (int) Math.pow(2.0d, A2 & 15), (int) Math.pow(2.0d, (A2 & 240) >> 4), Arrays.copyOf(ey7Var.a, ey7Var.c));
        } else {
            j09 j09Var = this.r;
            if (j09Var == null) {
                this.r = s2f.b(ey7Var, true, true);
            } else {
                int i6 = ey7Var.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(ey7Var.a, 0, bArr, 0, i6);
                short s2 = locVar.a;
                int i7 = 5;
                s2f.c(5, ey7Var, false);
                int A3 = ey7Var.A() + 1;
                zd1 zd1Var = new zd1(ey7Var.a);
                int i8 = 3;
                zd1Var.n(ey7Var.b << 3);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    int i12 = i8;
                    if (i9 < A3) {
                        if (zd1Var.f(24) == 5653314) {
                            int f = zd1Var.f(16);
                            int f2 = zd1Var.f(24);
                            if (!zd1Var.e()) {
                                boolean e = zd1Var.e();
                                for (int i13 = 0; i13 < f2; i13++) {
                                    if (e) {
                                        if (zd1Var.e()) {
                                            zd1Var.n(5);
                                        }
                                    } else {
                                        zd1Var.n(5);
                                    }
                                }
                            } else {
                                zd1Var.n(5);
                                for (int i14 = 0; i14 < f2; i14 += zd1Var.f(s2f.a(f2 - i14))) {
                                }
                            }
                            int f3 = zd1Var.f(4);
                            if (f3 <= 2) {
                                if (f3 == 1 || f3 == 2) {
                                    zd1Var.n(32);
                                    zd1Var.n(32);
                                    int f4 = zd1Var.f(4) + 1;
                                    zd1Var.n(1);
                                    if (f3 == 1) {
                                        if (f != 0) {
                                            j2 = (long) Math.floor(Math.pow(f2, 1.0d / f));
                                        } else {
                                            j2 = 0;
                                        }
                                    } else {
                                        j2 = f * f2;
                                    }
                                    zd1Var.n((int) (j2 * f4));
                                }
                                i9++;
                                i8 = i12;
                            } else {
                                throw hy7.a("lookup type greater than 2 not decodable: " + f3, null);
                            }
                        } else {
                            throw hy7.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((zd1Var.d << 3) + zd1Var.e), null);
                        }
                    } else {
                        int i15 = 6;
                        int f5 = zd1Var.f(6) + 1;
                        for (int i16 = 0; i16 < f5; i16++) {
                            if (zd1Var.f(16) != 0) {
                                throw hy7.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i17 = 1;
                        int f6 = zd1Var.f(6) + 1;
                        int i18 = 0;
                        while (i18 < f6) {
                            int f7 = zd1Var.f(i11);
                            if (f7 != 0) {
                                if (f7 == i17) {
                                    int f8 = zd1Var.f(i7);
                                    int[] iArr = new int[f8];
                                    int i19 = -1;
                                    for (int i20 = 0; i20 < f8; i20++) {
                                        int f9 = zd1Var.f(i5);
                                        iArr[i20] = f9;
                                        if (f9 > i19) {
                                            i19 = f9;
                                        }
                                    }
                                    int i21 = i19 + 1;
                                    int[] iArr2 = new int[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        iArr2[i22] = zd1Var.f(i12) + 1;
                                        int f10 = zd1Var.f(i10);
                                        if (f10 > 0) {
                                            zd1Var.n(8);
                                        }
                                        int i23 = 0;
                                        for (int i24 = 1; i23 < (i24 << f10); i24 = 1) {
                                            zd1Var.n(8);
                                            i23++;
                                        }
                                        i22++;
                                        i12 = 3;
                                        i10 = 2;
                                    }
                                    zd1Var.n(i10);
                                    int f11 = zd1Var.f(4);
                                    int i25 = 0;
                                    int i26 = 0;
                                    for (int i27 = 0; i27 < f8; i27++) {
                                        i25 += iArr2[iArr[i27]];
                                        while (i26 < i25) {
                                            zd1Var.n(f11);
                                            i26++;
                                        }
                                    }
                                } else {
                                    throw hy7.a("floor type greater than 1 not decodable: " + f7, null);
                                }
                            } else {
                                int i28 = 8;
                                zd1Var.n(8);
                                zd1Var.n(16);
                                zd1Var.n(16);
                                zd1Var.n(6);
                                zd1Var.n(8);
                                int f12 = zd1Var.f(4) + 1;
                                int i29 = 0;
                                while (i29 < f12) {
                                    zd1Var.n(i28);
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
                        int f13 = zd1Var.f(i15) + 1;
                        int i30 = 0;
                        while (i30 < f13) {
                            if (zd1Var.f(16) <= 2) {
                                zd1Var.n(24);
                                zd1Var.n(24);
                                zd1Var.n(24);
                                int f14 = zd1Var.f(i15) + 1;
                                zd1Var.n(8);
                                int[] iArr3 = new int[f14];
                                for (int i31 = 0; i31 < f14; i31++) {
                                    int f15 = zd1Var.f(3);
                                    if (zd1Var.e()) {
                                        i2 = zd1Var.f(5);
                                    } else {
                                        i2 = 0;
                                    }
                                    iArr3[i31] = (i2 << 3) + f15;
                                }
                                for (int i32 = 0; i32 < f14; i32++) {
                                    for (int i33 = 0; i33 < 8; i33++) {
                                        if ((iArr3[i32] & (1 << i33)) != 0) {
                                            zd1Var.n(8);
                                        }
                                    }
                                }
                                i30++;
                                i15 = 6;
                            } else {
                                throw hy7.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int f16 = zd1Var.f(i15) + 1;
                        for (int i34 = 0; i34 < f16; i34++) {
                            int f17 = zd1Var.f(16);
                            if (f17 != 0) {
                                efd.c("VorbisUtil", "mapping type other than 0 not supported: " + f17);
                            } else {
                                if (zd1Var.e()) {
                                    i = zd1Var.f(4) + 1;
                                } else {
                                    i = 1;
                                }
                                if (zd1Var.e()) {
                                    int f18 = zd1Var.f(8) + 1;
                                    for (int i35 = 0; i35 < f18; i35++) {
                                        int i36 = s2 - 1;
                                        zd1Var.n(s2f.a(i36));
                                        zd1Var.n(s2f.a(i36));
                                    }
                                }
                                if (zd1Var.f(2) == 0) {
                                    if (i > 1) {
                                        for (int i37 = 0; i37 < s2; i37++) {
                                            zd1Var.n(4);
                                        }
                                    }
                                    for (int i38 = 0; i38 < i; i38++) {
                                        zd1Var.n(8);
                                        zd1Var.n(8);
                                        zd1Var.n(8);
                                    }
                                } else {
                                    throw hy7.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                        }
                        int f19 = zd1Var.f(6) + 1;
                        jp5[] jp5VarArr = new jp5[f19];
                        for (int i39 = 0; i39 < f19; i39++) {
                            boolean e2 = zd1Var.e();
                            zd1Var.f(16);
                            zd1Var.f(16);
                            zd1Var.f(8);
                            jp5VarArr[i39] = new jp5((byte) 4, e2);
                        }
                        if (zd1Var.e()) {
                            u8aVar = new u8a(locVar, j09Var, bArr, jp5VarArr);
                        } else {
                            throw hy7.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        u8aVar = null;
        this.n = u8aVar;
        if (u8aVar == null) {
            return true;
        }
        loc locVar2 = (loc) u8aVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(locVar2.g);
        arrayList.add((byte[]) u8aVar.c);
        vf7 a = moc.a(po5.r((String[]) ((j09) u8aVar.b).b));
        jo4 jo4Var = new jo4();
        jo4Var.r = eg7.n("audio/ogg");
        jo4Var.s = eg7.n("audio/vorbis");
        jo4Var.i = locVar2.d;
        jo4Var.j = locVar2.c;
        jo4Var.M = locVar2.a;
        jo4Var.O = locVar2.b;
        jo4Var.v = arrayList;
        jo4Var.l = a;
        k7bVar.b = new ko4(jo4Var);
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
