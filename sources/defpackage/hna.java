package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class hna extends iwe {
    public final yw7 a = new yw7();
    public final ye1 b = new ye1();
    public vqb c;

    @Override
    public final nf7 b(pf7 pf7Var, ByteBuffer byteBuffer) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        boolean z6;
        boolean z7;
        long j2;
        long j3;
        vqb vqbVar = this.c;
        if (vqbVar == null || pf7Var.r != vqbVar.e()) {
            vqb vqbVar2 = new vqb(pf7Var.e);
            this.c = vqbVar2;
            vqbVar2.a(pf7Var.e - pf7Var.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        yw7 yw7Var = this.a;
        yw7Var.L(limit, array);
        ye1 ye1Var = this.b;
        ye1Var.j(limit, array);
        ye1Var.n(39);
        long f = (ye1Var.f(1) << 32) | ye1Var.f(32);
        ye1Var.n(20);
        int f2 = ye1Var.f(12);
        int f3 = ye1Var.f(8);
        yw7Var.O(14);
        if (f3 != 0) {
            if (f3 != 255) {
                if (f3 != 4) {
                    if (f3 != 5) {
                        if (f3 != 6) {
                            obj = null;
                        } else {
                            vqb vqbVar3 = this.c;
                            long d = lm8.d(f, yw7Var);
                            obj = new lm8(d, vqbVar3.b(d), (byte) 1);
                        }
                    } else {
                        vqb vqbVar4 = this.c;
                        yw7Var.C();
                        if ((yw7Var.A() & 128) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z4) {
                            int A = yw7Var.A();
                            if ((A & 64) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if ((A & 32) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if ((A & 16) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z5 && !z7) {
                                j2 = lm8.d(f, yw7Var);
                            } else {
                                j2 = -9223372036854775807L;
                            }
                            if (!z5) {
                                int A2 = yw7Var.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i = 0; i < A2; i++) {
                                    yw7Var.A();
                                    if (!z7) {
                                        j3 = lm8.d(f, yw7Var);
                                    } else {
                                        j3 = -9223372036854775807L;
                                    }
                                    vqbVar4.b(j3);
                                    arrayList.add(new Object());
                                }
                                list = arrayList;
                            }
                            if (z6) {
                                yw7Var.A();
                                yw7Var.C();
                            }
                            yw7Var.H();
                            yw7Var.A();
                            yw7Var.A();
                            j = j2;
                        } else {
                            j = -9223372036854775807L;
                        }
                        obj = new ina(j, vqbVar4.b(j), list);
                    }
                } else {
                    int A3 = yw7Var.A();
                    ArrayList arrayList2 = new ArrayList(A3);
                    for (int i2 = 0; i2 < A3; i2++) {
                        yw7Var.C();
                        if ((yw7Var.A() & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z) {
                            int A4 = yw7Var.A();
                            if ((A4 & 64) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((A4 & 32) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2) {
                                yw7Var.C();
                            } else {
                                int A5 = yw7Var.A();
                                ArrayList arrayList4 = new ArrayList(A5);
                                for (int i3 = 0; i3 < A5; i3++) {
                                    yw7Var.A();
                                    yw7Var.C();
                                    arrayList4.add(new k1f((byte) 26));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z3) {
                                yw7Var.A();
                                yw7Var.C();
                            }
                            yw7Var.H();
                            yw7Var.A();
                            yw7Var.A();
                        }
                        arrayList2.add(new cf9(arrayList3));
                    }
                    obj = new kna(arrayList2);
                }
            } else {
                long C = yw7Var.C();
                int i4 = f2 - 4;
                yw7Var.k(0, i4, new byte[i4]);
                obj = new lm8(C, f, (byte) 0);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new nf7(new lf7[0]);
        }
        return new nf7(obj);
    }
}
