package l4;

import h5.c0;
import h5.v;
import h5.w;
import j7.d7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends d7 {
    public final w f11679a = new w();
    public final v f11680b = new v();
    public c0 f11681c;

    @Override
    public final e4.c b(e4.e eVar, ByteBuffer byteBuffer) {
        int i10;
        Object obj;
        boolean z4;
        int i11;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        long j12;
        long j13;
        boolean z16;
        boolean z17;
        long j14;
        long j15;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i15;
        int i16;
        int i17;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        long j16;
        char c3;
        long j17;
        boolean z26;
        long j18;
        c0 c0Var = this.f11681c;
        if (c0Var == null || eVar.f4941s != c0Var.d()) {
            c0 c0Var2 = new c0(eVar.f15216f);
            this.f11681c = c0Var2;
            c0Var2.a(eVar.f15216f - eVar.f4941s);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.f11679a;
        wVar.D(limit, array);
        v vVar = this.f11680b;
        vVar.n(limit, array);
        vVar.s(39);
        long i18 = (vVar.i(1) << 32) | vVar.i(32);
        vVar.s(20);
        int i19 = vVar.i(12);
        int i20 = vVar.i(8);
        wVar.G(14);
        if (i20 != 0) {
            if (i20 != 255) {
                long j19 = -9223372036854775807L;
                if (i20 != 4) {
                    if (i20 != 5) {
                        if (i20 != 6) {
                            obj = null;
                        } else {
                            c0 c0Var3 = this.f11681c;
                            long a2 = k.a(i18, wVar);
                            obj = new k(a2, c0Var3.b(a2));
                        }
                    } else {
                        c0 c0Var4 = this.f11681c;
                        long v = wVar.v();
                        if ((wVar.u() & 128) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z17) {
                            int u10 = wVar.u();
                            if ((u10 & 128) != 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if ((u10 & 64) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if ((u10 & 32) != 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((u10 & 16) != 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (z23 && !z25) {
                                j16 = k.a(i18, wVar);
                            } else {
                                j16 = -9223372036854775807L;
                            }
                            if (!z23) {
                                int u11 = wVar.u();
                                c3 = ' ';
                                ArrayList arrayList = new ArrayList(u11);
                                j17 = 90;
                                for (int i21 = 0; i21 < u11; i21++) {
                                    int u12 = wVar.u();
                                    if (!z25) {
                                        j18 = k.a(i18, wVar);
                                    } else {
                                        j18 = -9223372036854775807L;
                                    }
                                    arrayList.add(new d(u12, j18, c0Var4.b(j18)));
                                }
                                list = arrayList;
                            } else {
                                c3 = ' ';
                                j17 = 90;
                            }
                            if (z24) {
                                long u13 = wVar.u();
                                if ((u13 & 128) != 0) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                j19 = ((((u13 & 1) << c3) | wVar.v()) * 1000) / j17;
                            } else {
                                z26 = false;
                            }
                            int z27 = wVar.z();
                            int u14 = wVar.u();
                            z21 = z26;
                            i17 = wVar.u();
                            z20 = z25;
                            i15 = z27;
                            i16 = u14;
                            j15 = j19;
                            j14 = j16;
                            z18 = z22;
                            z19 = z23;
                        } else {
                            j14 = -9223372036854775807L;
                            j15 = -9223372036854775807L;
                            z18 = false;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                        }
                        obj = new e(v, z17, z18, z19, z20, j14, c0Var4.b(j14), list, z21, j15, i15, i16, i17);
                    }
                } else {
                    int u15 = wVar.u();
                    ArrayList arrayList2 = new ArrayList(u15);
                    int i22 = 0;
                    while (i22 < u15) {
                        long v10 = wVar.v();
                        if ((wVar.u() & 128) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z4) {
                            int u16 = wVar.u();
                            if ((u16 & 128) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((u16 & 64) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((u16 & 32) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                j12 = wVar.v();
                            } else {
                                j12 = -9223372036854775807L;
                            }
                            if (!z14) {
                                int u17 = wVar.u();
                                ArrayList arrayList4 = new ArrayList(u17);
                                int i23 = 0;
                                while (i23 < u17) {
                                    arrayList4.add(new g(wVar.u(), wVar.v()));
                                    i23++;
                                    u15 = u15;
                                }
                                arrayList3 = arrayList4;
                            }
                            i11 = u15;
                            if (z15) {
                                long u18 = wVar.u();
                                if ((u18 & 128) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                j13 = ((((u18 & 1) << 32) | wVar.v()) * 1000) / 90;
                            } else {
                                j13 = -9223372036854775807L;
                                z16 = false;
                            }
                            j11 = j13;
                            z12 = z16;
                            i12 = wVar.z();
                            z10 = z13;
                            z11 = z14;
                            j10 = j12;
                            i13 = wVar.u();
                            i14 = wVar.u();
                        } else {
                            i11 = u15;
                            j10 = -9223372036854775807L;
                            j11 = -9223372036854775807L;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        }
                        arrayList2.add(new h(v10, z4, z10, z11, arrayList3, j10, z12, j11, i12, i13, i14));
                        i22++;
                        u15 = i11;
                    }
                    obj = new i(arrayList2);
                }
                i10 = 0;
            } else {
                long v11 = wVar.v();
                int i24 = i19 - 4;
                byte[] bArr = new byte[i24];
                i10 = 0;
                wVar.e(0, i24, bArr);
                obj = new a(v11, i18, bArr);
            }
        } else {
            i10 = 0;
            obj = new Object();
        }
        if (obj == null) {
            return new e4.c(new e4.b[i10]);
        }
        e4.b[] bVarArr = new e4.b[1];
        bVarArr[i10] = obj;
        return new e4.c(bVarArr);
    }
}
