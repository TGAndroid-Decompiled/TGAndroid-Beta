package i4;

import f5.c0;
import f5.v;
import f5.w;
import h7.h5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends h5 {
    public final w f8218a = new w();
    public final v f8219b = new v();
    public c0 f8220c;

    @Override
    public final b4.c b(b4.e eVar, ByteBuffer byteBuffer) {
        int i10;
        Object obj;
        boolean z10;
        int i11;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        long j12;
        long j13;
        boolean z17;
        boolean z18;
        long j14;
        long j15;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i15;
        int i16;
        int i17;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        long j16;
        char c3;
        long j17;
        boolean z27;
        long j18;
        c0 c0Var = this.f8220c;
        if (c0Var == null || eVar.f1922n != c0Var.d()) {
            c0 c0Var2 = new c0(eVar.d);
            this.f8220c = c0Var2;
            c0Var2.a(eVar.d - eVar.f1922n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.f8218a;
        wVar.A(limit, array);
        v vVar = this.f8219b;
        vVar.n(limit, array);
        vVar.s(39);
        long i18 = (vVar.i(1) << 32) | vVar.i(32);
        vVar.s(20);
        int i19 = vVar.i(12);
        int i20 = vVar.i(8);
        wVar.D(14);
        if (i20 != 0) {
            if (i20 != 255) {
                long j19 = -9223372036854775807L;
                if (i20 != 4) {
                    if (i20 != 5) {
                        if (i20 != 6) {
                            obj = null;
                        } else {
                            c0 c0Var3 = this.f8220c;
                            long a2 = k.a(i18, wVar);
                            obj = new k(a2, c0Var3.b(a2));
                        }
                    } else {
                        c0 c0Var4 = this.f8220c;
                        long s10 = wVar.s();
                        if ((wVar.r() & 128) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z18) {
                            int r6 = wVar.r();
                            if ((r6 & 128) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if ((r6 & 64) != 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((r6 & 32) != 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((r6 & 16) != 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z24 && !z26) {
                                j16 = k.a(i18, wVar);
                            } else {
                                j16 = -9223372036854775807L;
                            }
                            if (!z24) {
                                int r9 = wVar.r();
                                c3 = ' ';
                                ArrayList arrayList = new ArrayList(r9);
                                j17 = 90;
                                for (int i21 = 0; i21 < r9; i21++) {
                                    int r10 = wVar.r();
                                    if (!z26) {
                                        j18 = k.a(i18, wVar);
                                    } else {
                                        j18 = -9223372036854775807L;
                                    }
                                    arrayList.add(new d(r10, j18, c0Var4.b(j18)));
                                }
                                list = arrayList;
                            } else {
                                c3 = ' ';
                                j17 = 90;
                            }
                            if (z25) {
                                long r11 = wVar.r();
                                if ((r11 & 128) != 0) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                j19 = ((((r11 & 1) << c3) | wVar.s()) * 1000) / j17;
                            } else {
                                z27 = false;
                            }
                            int w10 = wVar.w();
                            int r12 = wVar.r();
                            z22 = z27;
                            i17 = wVar.r();
                            z21 = z26;
                            i15 = w10;
                            i16 = r12;
                            j15 = j19;
                            j14 = j16;
                            z19 = z23;
                            z20 = z24;
                        } else {
                            j14 = -9223372036854775807L;
                            j15 = -9223372036854775807L;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                            z22 = false;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                        }
                        obj = new e(s10, z18, z19, z20, z21, j14, c0Var4.b(j14), list, z22, j15, i15, i16, i17);
                    }
                } else {
                    int r13 = wVar.r();
                    ArrayList arrayList2 = new ArrayList(r13);
                    int i22 = 0;
                    while (i22 < r13) {
                        long s11 = wVar.s();
                        if ((wVar.r() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z10) {
                            int r14 = wVar.r();
                            if ((r14 & 128) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((r14 & 64) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((r14 & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z15) {
                                j12 = wVar.s();
                            } else {
                                j12 = -9223372036854775807L;
                            }
                            if (!z15) {
                                int r15 = wVar.r();
                                ArrayList arrayList4 = new ArrayList(r15);
                                int i23 = 0;
                                while (i23 < r15) {
                                    arrayList4.add(new h(wVar.r(), wVar.s()));
                                    i23++;
                                    r13 = r13;
                                }
                                arrayList3 = arrayList4;
                            }
                            i11 = r13;
                            if (z16) {
                                long r16 = wVar.r();
                                if ((r16 & 128) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                j13 = ((((r16 & 1) << 32) | wVar.s()) * 1000) / 90;
                            } else {
                                j13 = -9223372036854775807L;
                                z17 = false;
                            }
                            j11 = j13;
                            z13 = z17;
                            i12 = wVar.w();
                            z11 = z14;
                            z12 = z15;
                            j10 = j12;
                            i13 = wVar.r();
                            i14 = wVar.r();
                        } else {
                            i11 = r13;
                            j10 = -9223372036854775807L;
                            j11 = -9223372036854775807L;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        }
                        arrayList2.add(new i(s11, z10, z11, z12, arrayList3, j10, z13, j11, i12, i13, i14));
                        i22++;
                        r13 = i11;
                    }
                    obj = new j(arrayList2);
                }
                i10 = 0;
            } else {
                long s12 = wVar.s();
                int i24 = i19 - 4;
                byte[] bArr = new byte[i24];
                i10 = 0;
                wVar.c(0, i24, bArr);
                obj = new a(s12, i18, bArr);
            }
        } else {
            i10 = 0;
            obj = new Object();
        }
        if (obj == null) {
            return new b4.c(new b4.b[i10]);
        }
        b4.b[] bVarArr = new b4.b[1];
        bVarArr[i10] = obj;
        return new b4.c(bVarArr);
    }
}
