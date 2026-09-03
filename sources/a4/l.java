package a4;

import h5.v;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.ArrayList;
import java.util.Arrays;
import k7.x6;
import l3.o0;
import org.telegram.ui.Components.tp0;
public final class l extends j {
    public k f87n;
    public int f88o;
    public boolean f89p;
    public o0 f90q;
    public tp0 f91r;

    @Override
    public final void a(long j10) {
        boolean z4;
        this.f78g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f89p = z4;
        o0 o0Var = this.f90q;
        if (o0Var != null) {
            i10 = o0Var.e;
        }
        this.f88o = i10;
    }

    @Override
    public final long b(w wVar) {
        int i10;
        int i11 = 0;
        byte b10 = wVar.f6987a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f87n;
        h5.a.j(kVar);
        int i12 = kVar.f84a;
        o0 o0Var = (o0) kVar.f85b;
        if (!((h5.c[]) kVar.e)[(b10 >> 1) & (255 >>> (8 - i12))].f6920a) {
            i10 = o0Var.e;
        } else {
            i10 = o0Var.f11318f;
        }
        if (this.f89p) {
            i11 = (this.f88o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = wVar.f6987a;
        int length = bArr.length;
        int i13 = wVar.f6989c + 4;
        if (length < i13) {
            byte[] copyOf = Arrays.copyOf(bArr, i13);
            wVar.D(copyOf.length, copyOf);
        } else {
            wVar.E(i13);
        }
        byte[] bArr2 = wVar.f6987a;
        int i14 = wVar.f6989c;
        bArr2[i14 - 4] = (byte) (j10 & 255);
        bArr2[i14 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i14 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i14 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f89p = true;
        this.f88o = i10;
        return j10;
    }

    @Override
    public final boolean c(w wVar, long j10, af.c cVar) {
        k kVar;
        int i10;
        int i11;
        long j11;
        if (this.f87n != null) {
            ((n0) cVar.f156b).getClass();
            return false;
        }
        o0 o0Var = this.f90q;
        int i12 = 4;
        int i13 = -1;
        if (o0Var == null) {
            x6.c(1, wVar, false);
            wVar.m();
            int u10 = wVar.u();
            int m9 = wVar.m();
            int i14 = wVar.i();
            if (i14 <= 0) {
                i14 = -1;
            }
            int i15 = wVar.i();
            if (i15 > 0) {
                i13 = i15;
            }
            wVar.i();
            int u11 = wVar.u();
            int pow = (int) Math.pow(2.0d, (u11 & 240) >> 4);
            wVar.u();
            ?? copyOf = Arrays.copyOf(wVar.f6987a, wVar.f6989c);
            ?? obj = new Object();
            obj.f11315a = u10;
            obj.f11316b = m9;
            obj.f11317c = i14;
            obj.d = i13;
            obj.e = (int) Math.pow(2.0d, u11 & 15);
            obj.f11318f = pow;
            obj.f11319g = copyOf;
            this.f90q = obj;
        } else {
            tp0 tp0Var = this.f91r;
            if (tp0Var == null) {
                this.f91r = x6.b(wVar, true, true);
            } else {
                int i16 = wVar.f6989c;
                byte[] bArr = new byte[i16];
                System.arraycopy(wVar.f6987a, 0, bArr, 0, i16);
                int i17 = o0Var.f11315a;
                int i18 = 5;
                x6.c(5, wVar, false);
                int u12 = wVar.u() + 1;
                v vVar = new v(wVar.f6987a);
                vVar.s(wVar.f6988b * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 16;
                    if (i19 < u12) {
                        if (vVar.i(24) == 5653314) {
                            int i21 = vVar.i(16);
                            int i22 = vVar.i(24);
                            if (!vVar.h()) {
                                boolean h = vVar.h();
                                for (int i23 = 0; i23 < i22; i23++) {
                                    if (h) {
                                        if (vVar.h()) {
                                            vVar.s(i18);
                                        }
                                    } else {
                                        vVar.s(i18);
                                    }
                                }
                            } else {
                                vVar.s(i18);
                                int i24 = 0;
                                while (i24 < i22) {
                                    int i25 = 0;
                                    for (int i26 = i22 - i24; i26 > 0; i26 >>>= 1) {
                                        i25++;
                                    }
                                    i24 += vVar.i(i25);
                                }
                            }
                            int i27 = vVar.i(4);
                            if (i27 <= 2) {
                                if (i27 == 1 || i27 == 2) {
                                    vVar.s(32);
                                    vVar.s(32);
                                    int i28 = vVar.i(4) + 1;
                                    vVar.s(1);
                                    if (i27 == 1) {
                                        if (i21 != 0) {
                                            j11 = (long) Math.floor(Math.pow(i22, 1.0d / i21));
                                        } else {
                                            j11 = 0;
                                        }
                                    } else {
                                        j11 = i22 * i21;
                                    }
                                    vVar.s((int) (j11 * i28));
                                }
                                i19++;
                                i18 = 5;
                            } else {
                                throw r1.a("lookup type greater than 2 not decodable: " + i27, null);
                            }
                        } else {
                            throw r1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((vVar.d * 8) + vVar.e), null);
                        }
                    } else {
                        int i29 = 6;
                        int i30 = vVar.i(6) + 1;
                        for (int i31 = 0; i31 < i30; i31++) {
                            if (vVar.i(16) != 0) {
                                throw r1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i32 = 1;
                        int i33 = vVar.i(6) + 1;
                        int i34 = 0;
                        while (true) {
                            int i35 = 3;
                            if (i34 < i33) {
                                int i36 = vVar.i(i20);
                                if (i36 != 0) {
                                    if (i36 == i32) {
                                        int i37 = vVar.i(5);
                                        int[] iArr = new int[i37];
                                        int i38 = -1;
                                        for (int i39 = 0; i39 < i37; i39++) {
                                            int i40 = vVar.i(i12);
                                            iArr[i39] = i40;
                                            if (i40 > i38) {
                                                i38 = i40;
                                            }
                                        }
                                        int i41 = i38 + 1;
                                        int[] iArr2 = new int[i41];
                                        int i42 = 0;
                                        while (i42 < i41) {
                                            iArr2[i42] = vVar.i(i35) + 1;
                                            int i43 = vVar.i(2);
                                            int i44 = 8;
                                            if (i43 > 0) {
                                                vVar.s(8);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i45 = 0;
                                            for (int i46 = 1; i45 < (i46 << i43); i46 = 1) {
                                                vVar.s(i44);
                                                i45++;
                                                i44 = 8;
                                            }
                                            i42++;
                                            iArr2 = iArr3;
                                            i35 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        vVar.s(2);
                                        int i47 = vVar.i(4);
                                        int i48 = 0;
                                        int i49 = 0;
                                        for (int i50 = 0; i50 < i37; i50++) {
                                            i48 += iArr4[iArr[i50]];
                                            while (i49 < i48) {
                                                vVar.s(i47);
                                                i49++;
                                            }
                                        }
                                    } else {
                                        throw r1.a("floor type greater than 1 not decodable: " + i36, null);
                                    }
                                } else {
                                    int i51 = 8;
                                    vVar.s(8);
                                    vVar.s(16);
                                    vVar.s(16);
                                    vVar.s(6);
                                    vVar.s(8);
                                    int i52 = vVar.i(4) + 1;
                                    int i53 = 0;
                                    while (i53 < i52) {
                                        vVar.s(i51);
                                        i53++;
                                        i51 = 8;
                                    }
                                }
                                i34++;
                                i29 = 6;
                                i12 = 4;
                                i20 = 16;
                                i32 = 1;
                            } else {
                                int i54 = vVar.i(i29) + 1;
                                int i55 = 0;
                                while (i55 < i54) {
                                    if (vVar.i(16) <= 2) {
                                        vVar.s(24);
                                        vVar.s(24);
                                        vVar.s(24);
                                        int i56 = vVar.i(i29) + 1;
                                        int i57 = 8;
                                        vVar.s(8);
                                        int[] iArr5 = new int[i56];
                                        for (int i58 = 0; i58 < i56; i58++) {
                                            int i59 = vVar.i(3);
                                            if (vVar.h()) {
                                                i11 = vVar.i(5);
                                            } else {
                                                i11 = 0;
                                            }
                                            iArr5[i58] = (i11 * 8) + i59;
                                        }
                                        int i60 = 0;
                                        while (i60 < i56) {
                                            int i61 = 0;
                                            while (i61 < i57) {
                                                if ((iArr5[i60] & (1 << i61)) != 0) {
                                                    vVar.s(i57);
                                                }
                                                i61++;
                                                i57 = 8;
                                            }
                                            i60++;
                                            i57 = 8;
                                        }
                                        i55++;
                                        i29 = 6;
                                    } else {
                                        throw r1.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int i62 = vVar.i(i29) + 1;
                                for (int i63 = 0; i63 < i62; i63++) {
                                    int i64 = vVar.i(16);
                                    if (i64 != 0) {
                                        h5.a.o("VorbisUtil", "mapping type other than 0 not supported: " + i64);
                                    } else {
                                        if (vVar.h()) {
                                            i10 = vVar.i(4) + 1;
                                        } else {
                                            i10 = 1;
                                        }
                                        if (vVar.h()) {
                                            int i65 = vVar.i(8) + 1;
                                            for (int i66 = 0; i66 < i65; i66++) {
                                                int i67 = i17 - 1;
                                                int i68 = 0;
                                                for (int i69 = i67; i69 > 0; i69 >>>= 1) {
                                                    i68++;
                                                }
                                                vVar.s(i68);
                                                int i70 = 0;
                                                while (i67 > 0) {
                                                    i70++;
                                                    i67 >>>= 1;
                                                }
                                                vVar.s(i70);
                                            }
                                        }
                                        if (vVar.i(2) == 0) {
                                            if (i10 > 1) {
                                                for (int i71 = 0; i71 < i17; i71++) {
                                                    vVar.s(4);
                                                }
                                            }
                                            for (int i72 = 0; i72 < i10; i72++) {
                                                vVar.s(8);
                                                vVar.s(8);
                                                vVar.s(8);
                                            }
                                        } else {
                                            throw r1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int i73 = vVar.i(6);
                                int i74 = i73 + 1;
                                h5.c[] cVarArr = new h5.c[i74];
                                for (int i75 = 0; i75 < i74; i75++) {
                                    boolean h9 = vVar.h();
                                    vVar.i(16);
                                    vVar.i(16);
                                    vVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f6920a = h9;
                                    cVarArr[i75] = obj2;
                                }
                                if (vVar.h()) {
                                    int i76 = 0;
                                    while (i73 > 0) {
                                        i76++;
                                        i73 >>>= 1;
                                    }
                                    kVar = new k(o0Var, tp0Var, bArr, cVarArr, i76);
                                } else {
                                    throw r1.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        kVar = null;
        this.f87n = kVar;
        if (kVar == null) {
            return true;
        }
        o0 o0Var2 = (o0) kVar.f85b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) o0Var2.f11319g);
        arrayList.add((byte[]) kVar.d);
        e4.c a2 = x6.a(s8.v.u((String[]) ((tp0) kVar.f86c).f29015b));
        m0 m0Var = new m0();
        m0Var.f8666o = "audio/vorbis";
        m0Var.f8658f = o0Var2.d;
        m0Var.f8659g = o0Var2.f11317c;
        m0Var.B = o0Var2.f11315a;
        m0Var.C = o0Var2.f11316b;
        m0Var.f8668q = arrayList;
        m0Var.f8660i = a2;
        cVar.f156b = new n0(m0Var);
        return true;
    }

    @Override
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f87n = null;
            this.f90q = null;
            this.f91r = null;
        }
        this.f88o = 0;
        this.f89p = false;
    }
}
