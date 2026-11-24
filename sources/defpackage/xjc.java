package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class xjc extends w8b {
    public wtc n;
    public int o;
    public boolean p;
    public yjc q;
    public ln8 r;

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
        yjc yjcVar = this.q;
        if (yjcVar != null) {
            i = yjcVar.e;
        }
        this.o = i;
    }

    @Override
    public final long b(xu7 xu7Var) {
        int i;
        int i2 = 0;
        if ((xu7Var.a[0] & 1) == 1) {
            return -1L;
        }
        wtc wtcVar = this.n;
        wtcVar.getClass();
        byte b = xu7Var.a[0];
        yjc yjcVar = (yjc) wtcVar.a;
        gn5[] gn5VarArr = (gn5[]) wtcVar.d;
        if (gn5VarArr[(b >> 1) & (255 >>> (8 - aye.a(gn5VarArr.length - 1)))].b) {
            i = yjcVar.f;
        } else {
            i = yjcVar.e;
        }
        int i3 = this.o;
        if (this.p) {
            i2 = (i3 + i) / 4;
        }
        long j = i2;
        byte[] bArr = xu7Var.a;
        int length = bArr.length;
        int i4 = xu7Var.c + 4;
        if (length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            xu7Var.L(copyOf.length, copyOf);
        } else {
            xu7Var.M(i4);
        }
        byte[] bArr2 = xu7Var.a;
        int i5 = xu7Var.c;
        bArr2[i5 - 4] = (byte) (j & 255);
        bArr2[i5 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i5 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i5 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override
    public final boolean c(xu7 xu7Var, long j, v8b v8bVar) {
        wtc wtcVar;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        if (this.n != null) {
            ((fm4) v8bVar.b).getClass();
            return false;
        }
        yjc yjcVar = this.q;
        int i5 = 4;
        if (yjcVar == null) {
            aye.c(1, xu7Var, false);
            xu7Var.s();
            int A = xu7Var.A();
            int s = xu7Var.s();
            int o = xu7Var.o();
            if (o <= 0) {
                i3 = -1;
            } else {
                i3 = o;
            }
            int o2 = xu7Var.o();
            if (o2 <= 0) {
                i4 = -1;
            } else {
                i4 = o2;
            }
            xu7Var.o();
            int A2 = xu7Var.A();
            xu7Var.A();
            this.q = new yjc(A, s, i3, i4, (int) Math.pow(2.0d, A2 & 15), (int) Math.pow(2.0d, (A2 & 240) >> 4), Arrays.copyOf(xu7Var.a, xu7Var.c));
        } else {
            ln8 ln8Var = this.r;
            if (ln8Var == null) {
                this.r = aye.b(xu7Var, true, true);
            } else {
                int i6 = xu7Var.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(xu7Var.a, 0, bArr, 0, i6);
                short s2 = yjcVar.a;
                int i7 = 5;
                aye.c(5, xu7Var, false);
                int A3 = xu7Var.A() + 1;
                qd1 qd1Var = new qd1(xu7Var.a);
                int i8 = 3;
                qd1Var.n(xu7Var.b << 3);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    int i12 = i8;
                    if (i9 < A3) {
                        if (qd1Var.f(24) == 5653314) {
                            int f = qd1Var.f(16);
                            int f2 = qd1Var.f(24);
                            if (!qd1Var.e()) {
                                boolean e = qd1Var.e();
                                for (int i13 = 0; i13 < f2; i13++) {
                                    if (e) {
                                        if (qd1Var.e()) {
                                            qd1Var.n(5);
                                        }
                                    } else {
                                        qd1Var.n(5);
                                    }
                                }
                            } else {
                                qd1Var.n(5);
                                for (int i14 = 0; i14 < f2; i14 += qd1Var.f(aye.a(f2 - i14))) {
                                }
                            }
                            int f3 = qd1Var.f(4);
                            if (f3 <= 2) {
                                if (f3 == 1 || f3 == 2) {
                                    qd1Var.n(32);
                                    qd1Var.n(32);
                                    int f4 = qd1Var.f(4) + 1;
                                    qd1Var.n(1);
                                    if (f3 == 1) {
                                        if (f != 0) {
                                            j2 = (long) Math.floor(Math.pow(f2, 1.0d / f));
                                        } else {
                                            j2 = 0;
                                        }
                                    } else {
                                        j2 = f * f2;
                                    }
                                    qd1Var.n((int) (j2 * f4));
                                }
                                i9++;
                                i8 = i12;
                            } else {
                                throw av7.a("lookup type greater than 2 not decodable: " + f3, null);
                            }
                        } else {
                            throw av7.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((qd1Var.d << 3) + qd1Var.e), null);
                        }
                    } else {
                        int i15 = 6;
                        int f5 = qd1Var.f(6) + 1;
                        for (int i16 = 0; i16 < f5; i16++) {
                            if (qd1Var.f(16) != 0) {
                                throw av7.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i17 = 1;
                        int f6 = qd1Var.f(6) + 1;
                        int i18 = 0;
                        while (i18 < f6) {
                            int f7 = qd1Var.f(i11);
                            if (f7 != 0) {
                                if (f7 == i17) {
                                    int f8 = qd1Var.f(i7);
                                    int[] iArr = new int[f8];
                                    int i19 = -1;
                                    for (int i20 = 0; i20 < f8; i20++) {
                                        int f9 = qd1Var.f(i5);
                                        iArr[i20] = f9;
                                        if (f9 > i19) {
                                            i19 = f9;
                                        }
                                    }
                                    int i21 = i19 + 1;
                                    int[] iArr2 = new int[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        iArr2[i22] = qd1Var.f(i12) + 1;
                                        int f10 = qd1Var.f(i10);
                                        if (f10 > 0) {
                                            qd1Var.n(8);
                                        }
                                        int i23 = 0;
                                        for (int i24 = 1; i23 < (i24 << f10); i24 = 1) {
                                            qd1Var.n(8);
                                            i23++;
                                        }
                                        i22++;
                                        i12 = 3;
                                        i10 = 2;
                                    }
                                    qd1Var.n(i10);
                                    int f11 = qd1Var.f(4);
                                    int i25 = 0;
                                    int i26 = 0;
                                    for (int i27 = 0; i27 < f8; i27++) {
                                        i25 += iArr2[iArr[i27]];
                                        while (i26 < i25) {
                                            qd1Var.n(f11);
                                            i26++;
                                        }
                                    }
                                } else {
                                    throw av7.a("floor type greater than 1 not decodable: " + f7, null);
                                }
                            } else {
                                int i28 = 8;
                                qd1Var.n(8);
                                qd1Var.n(16);
                                qd1Var.n(16);
                                qd1Var.n(6);
                                qd1Var.n(8);
                                int f12 = qd1Var.f(4) + 1;
                                int i29 = 0;
                                while (i29 < f12) {
                                    qd1Var.n(i28);
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
                        int f13 = qd1Var.f(i15) + 1;
                        int i30 = 0;
                        while (i30 < f13) {
                            if (qd1Var.f(16) <= 2) {
                                qd1Var.n(24);
                                qd1Var.n(24);
                                qd1Var.n(24);
                                int f14 = qd1Var.f(i15) + 1;
                                qd1Var.n(8);
                                int[] iArr3 = new int[f14];
                                for (int i31 = 0; i31 < f14; i31++) {
                                    int f15 = qd1Var.f(3);
                                    if (qd1Var.e()) {
                                        i2 = qd1Var.f(5);
                                    } else {
                                        i2 = 0;
                                    }
                                    iArr3[i31] = (i2 << 3) + f15;
                                }
                                for (int i32 = 0; i32 < f14; i32++) {
                                    for (int i33 = 0; i33 < 8; i33++) {
                                        if ((iArr3[i32] & (1 << i33)) != 0) {
                                            qd1Var.n(8);
                                        }
                                    }
                                }
                                i30++;
                                i15 = 6;
                            } else {
                                throw av7.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int f16 = qd1Var.f(i15) + 1;
                        for (int i34 = 0; i34 < f16; i34++) {
                            int f17 = qd1Var.f(16);
                            if (f17 != 0) {
                                lad.c("VorbisUtil", "mapping type other than 0 not supported: " + f17);
                            } else {
                                if (qd1Var.e()) {
                                    i = qd1Var.f(4) + 1;
                                } else {
                                    i = 1;
                                }
                                if (qd1Var.e()) {
                                    int f18 = qd1Var.f(8) + 1;
                                    for (int i35 = 0; i35 < f18; i35++) {
                                        int i36 = s2 - 1;
                                        qd1Var.n(aye.a(i36));
                                        qd1Var.n(aye.a(i36));
                                    }
                                }
                                if (qd1Var.f(2) == 0) {
                                    if (i > 1) {
                                        for (int i37 = 0; i37 < s2; i37++) {
                                            qd1Var.n(4);
                                        }
                                    }
                                    for (int i38 = 0; i38 < i; i38++) {
                                        qd1Var.n(8);
                                        qd1Var.n(8);
                                        qd1Var.n(8);
                                    }
                                } else {
                                    throw av7.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                        }
                        int f19 = qd1Var.f(6) + 1;
                        gn5[] gn5VarArr = new gn5[f19];
                        for (int i39 = 0; i39 < f19; i39++) {
                            boolean e2 = qd1Var.e();
                            qd1Var.f(16);
                            qd1Var.f(16);
                            qd1Var.f(8);
                            gn5VarArr[i39] = new gn5((byte) 4, e2);
                        }
                        if (qd1Var.e()) {
                            wtcVar = new wtc(yjcVar, ln8Var, bArr, gn5VarArr);
                        } else {
                            throw av7.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        wtcVar = null;
        this.n = wtcVar;
        if (wtcVar == null) {
            return true;
        }
        yjc yjcVar2 = (yjc) wtcVar.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yjcVar2.g);
        arrayList.add((byte[]) wtcVar.c);
        ld7 a = zjc.a(mm5.r((String[]) ((ln8) wtcVar.b).b));
        em4 em4Var = new em4();
        em4Var.r = ud7.n("audio/ogg");
        em4Var.s = ud7.n("audio/vorbis");
        em4Var.i = yjcVar2.d;
        em4Var.j = yjcVar2.c;
        em4Var.M = yjcVar2.a;
        em4Var.O = yjcVar2.b;
        em4Var.v = arrayList;
        em4Var.l = a;
        v8bVar.b = new fm4(em4Var);
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
