package a4;

import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.a0;
import f3.l0;
import h2.x;
import h9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import q4.q;
public final class l extends j {
    public k f195n;
    public int f196o;
    public boolean f197p;
    public a0 f198q;
    public l0 f199r;

    @Override
    public final void a(long j3) {
        boolean z9;
        this.f184g = j3;
        int i7 = 0;
        if (j3 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f197p = z9;
        a0 a0Var = this.f198q;
        if (a0Var != null) {
            i7 = a0Var.f10967e;
        }
        this.f196o = i7;
    }

    @Override
    public final long b(x xVar) {
        int i7;
        int i10 = 0;
        byte b10 = xVar.f14162a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f195n;
        kVar.getClass();
        int i11 = kVar.f191b;
        a0 a0Var = (a0) kVar.f192c;
        if (!((ci.a[]) kVar.f194f)[(b10 >> 1) & (255 >>> (8 - i11))].f6416a) {
            i7 = a0Var.f10967e;
        } else {
            i7 = a0Var.f10968f;
        }
        if (this.f197p) {
            i10 = (this.f196o + i7) / 4;
        }
        long j3 = i10;
        byte[] bArr = xVar.f14162a;
        int length = bArr.length;
        int i12 = xVar.f14164c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            xVar.L(copyOf.length, copyOf);
        } else {
            xVar.M(i12);
        }
        byte[] bArr2 = xVar.f14162a;
        int i13 = xVar.f14164c;
        bArr2[i13 - 4] = (byte) (j3 & 255);
        bArr2[i13 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f197p = true;
        this.f196o = i7;
        return j3;
    }

    @Override
    public final boolean c(x xVar, long j3, q qVar) {
        k kVar;
        int i7;
        int i10;
        long j10;
        if (this.f195n != null) {
            ((u) qVar.f53711b).getClass();
            return false;
        }
        a0 a0Var = this.f198q;
        int i11 = 4;
        int i12 = -1;
        if (a0Var == null) {
            f3.b.w(1, xVar, false);
            xVar.s();
            int A = xVar.A();
            int s5 = xVar.s();
            int o4 = xVar.o();
            if (o4 <= 0) {
                o4 = -1;
            }
            int o10 = xVar.o();
            if (o10 > 0) {
                i12 = o10;
            }
            xVar.o();
            int A2 = xVar.A();
            int pow = (int) Math.pow(2.0d, (A2 & 240) >> 4);
            xVar.A();
            ?? copyOf = Arrays.copyOf(xVar.f14162a, xVar.f14164c);
            ?? obj = new Object();
            obj.f10964a = A;
            obj.f10965b = s5;
            obj.f10966c = o4;
            obj.d = i12;
            obj.f10967e = (int) Math.pow(2.0d, A2 & 15);
            obj.f10968f = pow;
            obj.f10969g = copyOf;
            this.f198q = obj;
        } else {
            l0 l0Var = this.f199r;
            if (l0Var == null) {
                this.f199r = f3.b.u(xVar, true, true);
            } else {
                int i13 = xVar.f14164c;
                byte[] bArr = new byte[i13];
                System.arraycopy(xVar.f14162a, 0, bArr, 0, i13);
                int i14 = a0Var.f10964a;
                int i15 = 5;
                f3.b.w(5, xVar, false);
                int A3 = xVar.A() + 1;
                d4.f fVar = new d4.f(xVar.f14162a);
                int i16 = 8;
                fVar.L(xVar.f14163b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 16;
                    if (i17 < A3) {
                        int i19 = i16;
                        if (fVar.j(24) == 5653314) {
                            int j11 = fVar.j(16);
                            int j12 = fVar.j(24);
                            if (!fVar.i()) {
                                boolean i20 = fVar.i();
                                for (int i21 = 0; i21 < j12; i21++) {
                                    if (i20) {
                                        if (fVar.i()) {
                                            fVar.L(i15);
                                        }
                                    } else {
                                        fVar.L(i15);
                                    }
                                }
                            } else {
                                fVar.L(i15);
                                int i22 = 0;
                                while (i22 < j12) {
                                    int i23 = 0;
                                    for (int i24 = j12 - i22; i24 > 0; i24 >>>= 1) {
                                        i23++;
                                    }
                                    i22 += fVar.j(i23);
                                }
                            }
                            int j13 = fVar.j(4);
                            if (j13 <= 2) {
                                if (j13 == 1 || j13 == 2) {
                                    fVar.L(32);
                                    fVar.L(32);
                                    int j14 = fVar.j(4) + 1;
                                    fVar.L(1);
                                    if (j13 == 1) {
                                        if (j11 != 0) {
                                            j10 = (long) Math.floor(Math.pow(j12, 1.0d / j11));
                                        } else {
                                            j10 = 0;
                                        }
                                    } else {
                                        j10 = j12 * j11;
                                    }
                                    fVar.L((int) (j10 * j14));
                                }
                                i17++;
                                i16 = i19;
                                i15 = 5;
                            } else {
                                throw t0.a(null, "lookup type greater than 2 not decodable: " + j13);
                            }
                        } else {
                            throw t0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.d * 8) + fVar.f8166e));
                        }
                    } else {
                        int i25 = i16;
                        int i26 = 6;
                        int j15 = fVar.j(6) + 1;
                        for (int i27 = 0; i27 < j15; i27++) {
                            if (fVar.j(16) != 0) {
                                throw t0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i28 = 1;
                        int j16 = fVar.j(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < j16) {
                                int j17 = fVar.j(i18);
                                if (j17 != 0) {
                                    if (j17 == i28) {
                                        int j18 = fVar.j(5);
                                        int[] iArr = new int[j18];
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < j18; i32++) {
                                            int j19 = fVar.j(i11);
                                            iArr[i32] = j19;
                                            if (j19 > i31) {
                                                i31 = j19;
                                            }
                                        }
                                        int i33 = i31 + 1;
                                        int[] iArr2 = new int[i33];
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            iArr2[i34] = fVar.j(i30) + 1;
                                            int j20 = fVar.j(2);
                                            int i35 = i25;
                                            if (j20 > 0) {
                                                fVar.L(i35);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i36 = 0;
                                            for (int i37 = 1; i36 < (i37 << j20); i37 = 1) {
                                                fVar.L(i35);
                                                i36++;
                                                i35 = 8;
                                            }
                                            i34++;
                                            iArr2 = iArr3;
                                            i25 = 8;
                                            i30 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        fVar.L(2);
                                        int j21 = fVar.j(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < j18; i40++) {
                                            i38 += iArr4[iArr[i40]];
                                            while (i39 < i38) {
                                                fVar.L(j21);
                                                i39++;
                                            }
                                        }
                                    } else {
                                        throw t0.a(null, "floor type greater than 1 not decodable: " + j17);
                                    }
                                } else {
                                    int i41 = i25;
                                    fVar.L(i41);
                                    fVar.L(16);
                                    fVar.L(16);
                                    fVar.L(6);
                                    fVar.L(i41);
                                    int j22 = fVar.j(4) + 1;
                                    int i42 = 0;
                                    while (i42 < j22) {
                                        fVar.L(i41);
                                        i42++;
                                        i41 = 8;
                                    }
                                }
                                i29++;
                                i25 = 8;
                                i26 = 6;
                                i11 = 4;
                                i18 = 16;
                                i28 = 1;
                            } else {
                                int j23 = fVar.j(i26) + 1;
                                int i43 = 0;
                                while (i43 < j23) {
                                    if (fVar.j(16) <= 2) {
                                        fVar.L(24);
                                        fVar.L(24);
                                        fVar.L(24);
                                        int j24 = fVar.j(i26) + 1;
                                        int i44 = 8;
                                        fVar.L(8);
                                        int[] iArr5 = new int[j24];
                                        for (int i45 = 0; i45 < j24; i45++) {
                                            int j25 = fVar.j(3);
                                            if (fVar.i()) {
                                                i10 = fVar.j(5);
                                            } else {
                                                i10 = 0;
                                            }
                                            iArr5[i45] = (i10 * 8) + j25;
                                        }
                                        int i46 = 0;
                                        while (i46 < j24) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr5[i46] & (1 << i47)) != 0) {
                                                    fVar.L(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i26 = 6;
                                    } else {
                                        throw t0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int j26 = fVar.j(i26) + 1;
                                for (int i48 = 0; i48 < j26; i48++) {
                                    int j27 = fVar.j(16);
                                    if (j27 != 0) {
                                        h2.a.c("VorbisUtil", "mapping type other than 0 not supported: " + j27);
                                    } else {
                                        if (fVar.i()) {
                                            i7 = fVar.j(4) + 1;
                                        } else {
                                            i7 = 1;
                                        }
                                        if (fVar.i()) {
                                            int j28 = fVar.j(8) + 1;
                                            for (int i49 = 0; i49 < j28; i49++) {
                                                int i50 = i14 - 1;
                                                int i51 = 0;
                                                for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                                    i51++;
                                                }
                                                fVar.L(i51);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i53++;
                                                    i50 >>>= 1;
                                                }
                                                fVar.L(i53);
                                            }
                                        }
                                        if (fVar.j(2) == 0) {
                                            if (i7 > 1) {
                                                for (int i54 = 0; i54 < i14; i54++) {
                                                    fVar.L(4);
                                                }
                                            }
                                            for (int i55 = 0; i55 < i7; i55++) {
                                                fVar.L(8);
                                                fVar.L(8);
                                                fVar.L(8);
                                            }
                                        } else {
                                            throw t0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int j29 = fVar.j(6);
                                int i56 = j29 + 1;
                                ci.a[] aVarArr = new ci.a[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean i58 = fVar.i();
                                    fVar.j(16);
                                    fVar.j(16);
                                    fVar.j(8);
                                    ?? obj2 = new Object();
                                    obj2.f6416a = i58;
                                    aVarArr[i57] = obj2;
                                }
                                if (fVar.i()) {
                                    int i59 = 0;
                                    while (j29 > 0) {
                                        i59++;
                                        j29 >>>= 1;
                                    }
                                    kVar = new k(a0Var, l0Var, bArr, aVarArr, i59);
                                } else {
                                    throw t0.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        kVar = null;
        this.f195n = kVar;
        if (kVar == null) {
            return true;
        }
        a0 a0Var2 = (a0) kVar.f192c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) a0Var2.f10969g);
        arrayList.add((byte[]) kVar.f193e);
        q0 r10 = f3.b.r(i0.r(((l0) kVar.d).f11060a));
        t tVar = new t();
        tVar.f10562q = s0.n("audio/ogg");
        tVar.f10563r = s0.n("audio/vorbis");
        tVar.h = a0Var2.d;
        tVar.f10554i = a0Var2.f10966c;
        tVar.J = a0Var2.f10964a;
        tVar.K = a0Var2.f10965b;
        tVar.f10566u = arrayList;
        tVar.f10556k = r10;
        qVar.f53711b = new u(tVar);
        return true;
    }

    @Override
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f195n = null;
            this.f198q = null;
            this.f199r = null;
        }
        this.f196o = 0;
        this.f197p = false;
    }
}
