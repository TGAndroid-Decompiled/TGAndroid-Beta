package g4;

import d5.e0;
import d5.x;
import d5.y;
import g7.y8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class c extends y8 {
    public final y f7079a = new y();
    public final x f7080b = new x();
    public e0 f7081c;

    @Override
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        int i9;
        Object obj;
        boolean z10;
        int i10;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
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
        int i14;
        int i15;
        int i16;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        long j16;
        char c10;
        long j17;
        boolean z27;
        long j18;
        e0 e0Var = this.f7081c;
        if (e0Var == null || eVar.f50291n != e0Var.d()) {
            e0 e0Var2 = new e0(eVar.d);
            this.f7081c = e0Var2;
            e0Var2.a(eVar.d - eVar.f50291n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.f7079a;
        yVar.A(limit, array);
        x xVar = this.f7080b;
        xVar.n(limit, array);
        xVar.s(39);
        long i17 = (xVar.i(1) << 32) | xVar.i(32);
        xVar.s(20);
        int i18 = xVar.i(12);
        int i19 = xVar.i(8);
        yVar.D(14);
        if (i19 != 0) {
            if (i19 != 255) {
                long j19 = -9223372036854775807L;
                if (i19 != 4) {
                    if (i19 != 5) {
                        if (i19 != 6) {
                            obj = null;
                        } else {
                            e0 e0Var3 = this.f7081c;
                            long a2 = j.a(i17, yVar);
                            obj = new j(a2, e0Var3.b(a2));
                        }
                    } else {
                        e0 e0Var4 = this.f7081c;
                        long s10 = yVar.s();
                        if ((yVar.r() & 128) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z18) {
                            int r10 = yVar.r();
                            if ((r10 & 128) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if ((r10 & 64) != 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((r10 & 32) != 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((r10 & 16) != 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z24 && !z26) {
                                j16 = j.a(i17, yVar);
                            } else {
                                j16 = -9223372036854775807L;
                            }
                            if (!z24) {
                                int r11 = yVar.r();
                                c10 = ' ';
                                ArrayList arrayList = new ArrayList(r11);
                                j17 = 90;
                                for (int i20 = 0; i20 < r11; i20++) {
                                    int r12 = yVar.r();
                                    if (!z26) {
                                        j18 = j.a(i17, yVar);
                                    } else {
                                        j18 = -9223372036854775807L;
                                    }
                                    arrayList.add(new d(r12, j18, e0Var4.b(j18)));
                                }
                                list = arrayList;
                            } else {
                                c10 = ' ';
                                j17 = 90;
                            }
                            if (z25) {
                                long r13 = yVar.r();
                                if ((r13 & 128) != 0) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                j19 = ((((r13 & 1) << c10) | yVar.s()) * 1000) / j17;
                            } else {
                                z27 = false;
                            }
                            int w8 = yVar.w();
                            int r14 = yVar.r();
                            z22 = z27;
                            i16 = yVar.r();
                            z21 = z26;
                            i14 = w8;
                            i15 = r14;
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
                            i14 = 0;
                            i15 = 0;
                            i16 = 0;
                        }
                        obj = new e(s10, z18, z19, z20, z21, j14, e0Var4.b(j14), list, z22, j15, i14, i15, i16);
                    }
                } else {
                    int r15 = yVar.r();
                    ArrayList arrayList2 = new ArrayList(r15);
                    int i21 = 0;
                    while (i21 < r15) {
                        long s11 = yVar.s();
                        if ((yVar.r() & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z10) {
                            int r16 = yVar.r();
                            if ((r16 & 128) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((r16 & 64) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if ((r16 & 32) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z15) {
                                j12 = yVar.s();
                            } else {
                                j12 = -9223372036854775807L;
                            }
                            if (!z15) {
                                int r17 = yVar.r();
                                ArrayList arrayList4 = new ArrayList(r17);
                                int i22 = 0;
                                while (i22 < r17) {
                                    arrayList4.add(new g(yVar.r(), yVar.s()));
                                    i22++;
                                    r15 = r15;
                                }
                                arrayList3 = arrayList4;
                            }
                            i10 = r15;
                            if (z16) {
                                long r18 = yVar.r();
                                if ((r18 & 128) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                j13 = ((((r18 & 1) << 32) | yVar.s()) * 1000) / 90;
                            } else {
                                j13 = -9223372036854775807L;
                                z17 = false;
                            }
                            j11 = j13;
                            z13 = z17;
                            i11 = yVar.w();
                            z11 = z14;
                            z12 = z15;
                            j10 = j12;
                            i12 = yVar.r();
                            i13 = yVar.r();
                        } else {
                            i10 = r15;
                            j10 = -9223372036854775807L;
                            j11 = -9223372036854775807L;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                            i11 = 0;
                            i12 = 0;
                            i13 = 0;
                        }
                        arrayList2.add(new h(s11, z10, z11, z12, arrayList3, j10, z13, j11, i11, i12, i13));
                        i21++;
                        r15 = i10;
                    }
                    obj = new i(arrayList2);
                }
                i9 = 0;
            } else {
                long s12 = yVar.s();
                int i23 = i18 - 4;
                byte[] bArr = new byte[i23];
                i9 = 0;
                yVar.c(0, i23, bArr);
                obj = new a(s12, i17, bArr);
            }
        } else {
            i9 = 0;
            obj = new Object();
        }
        if (obj == null) {
            return new z3.c(new z3.b[i9]);
        }
        z3.b[] bVarArr = new z3.b[1];
        bVarArr[i9] = obj;
        return new z3.c(bVarArr);
    }
}
