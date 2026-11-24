package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class gla extends fue {
    public final xu7 a = new xu7();
    public final qd1 b = new qd1();
    public uob c;

    @Override
    public final ld7 b(nd7 nd7Var, ByteBuffer byteBuffer) {
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
        uob uobVar = this.c;
        if (uobVar == null || nd7Var.r != uobVar.e()) {
            uob uobVar2 = new uob(nd7Var.e);
            this.c = uobVar2;
            uobVar2.a(nd7Var.e - nd7Var.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xu7 xu7Var = this.a;
        xu7Var.L(limit, array);
        qd1 qd1Var = this.b;
        qd1Var.j(limit, array);
        qd1Var.n(39);
        long f = (qd1Var.f(1) << 32) | qd1Var.f(32);
        qd1Var.n(20);
        int f2 = qd1Var.f(12);
        int f3 = qd1Var.f(8);
        xu7Var.O(14);
        if (f3 != 0) {
            if (f3 != 255) {
                if (f3 != 4) {
                    if (f3 != 5) {
                        if (f3 != 6) {
                            obj = null;
                        } else {
                            uob uobVar3 = this.c;
                            long d = hk8.d(f, xu7Var);
                            obj = new hk8(d, uobVar3.b(d), (byte) 1);
                        }
                    } else {
                        uob uobVar4 = this.c;
                        xu7Var.C();
                        if ((xu7Var.A() & 128) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z4) {
                            int A = xu7Var.A();
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
                                j2 = hk8.d(f, xu7Var);
                            } else {
                                j2 = -9223372036854775807L;
                            }
                            if (!z5) {
                                int A2 = xu7Var.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i = 0; i < A2; i++) {
                                    xu7Var.A();
                                    if (!z7) {
                                        j3 = hk8.d(f, xu7Var);
                                    } else {
                                        j3 = -9223372036854775807L;
                                    }
                                    uobVar4.b(j3);
                                    arrayList.add(new Object());
                                }
                                list = arrayList;
                            }
                            if (z6) {
                                xu7Var.A();
                                xu7Var.C();
                            }
                            xu7Var.H();
                            xu7Var.A();
                            xu7Var.A();
                            j = j2;
                        } else {
                            j = -9223372036854775807L;
                        }
                        obj = new hla(j, uobVar4.b(j), list);
                    }
                } else {
                    int A3 = xu7Var.A();
                    ArrayList arrayList2 = new ArrayList(A3);
                    for (int i2 = 0; i2 < A3; i2++) {
                        xu7Var.C();
                        if ((xu7Var.A() & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z) {
                            int A4 = xu7Var.A();
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
                                xu7Var.C();
                            } else {
                                int A5 = xu7Var.A();
                                ArrayList arrayList4 = new ArrayList(A5);
                                for (int i3 = 0; i3 < A5; i3++) {
                                    xu7Var.A();
                                    xu7Var.C();
                                    arrayList4.add(new ize((byte) 26));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z3) {
                                xu7Var.A();
                                xu7Var.C();
                            }
                            xu7Var.H();
                            xu7Var.A();
                            xu7Var.A();
                        }
                        arrayList2.add(new ln8(arrayList3));
                    }
                    obj = new jla(arrayList2);
                }
            } else {
                long C = xu7Var.C();
                int i4 = f2 - 4;
                xu7Var.k(0, i4, new byte[i4]);
                obj = new hk8(C, f, (byte) 0);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new ld7(new jd7[0]);
        }
        return new ld7(obj);
    }
}
