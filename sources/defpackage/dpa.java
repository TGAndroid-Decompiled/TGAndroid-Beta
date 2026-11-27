package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class dpa extends yye {
    public final ey7 a = new ey7();
    public final zd1 b = new zd1();
    public usb c;

    @Override
    public final vf7 b(xf7 xf7Var, ByteBuffer byteBuffer) {
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
        usb usbVar = this.c;
        if (usbVar == null || xf7Var.r != usbVar.e()) {
            usb usbVar2 = new usb(xf7Var.e);
            this.c = usbVar2;
            usbVar2.a(xf7Var.e - xf7Var.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ey7 ey7Var = this.a;
        ey7Var.L(limit, array);
        zd1 zd1Var = this.b;
        zd1Var.j(limit, array);
        zd1Var.n(39);
        long f = (zd1Var.f(1) << 32) | zd1Var.f(32);
        zd1Var.n(20);
        int f2 = zd1Var.f(12);
        int f3 = zd1Var.f(8);
        ey7Var.O(14);
        if (f3 != 0) {
            if (f3 != 255) {
                if (f3 != 4) {
                    if (f3 != 5) {
                        if (f3 != 6) {
                            obj = null;
                        } else {
                            usb usbVar3 = this.c;
                            long d = wn8.d(f, ey7Var);
                            obj = new wn8(d, usbVar3.b(d), (byte) 1);
                        }
                    } else {
                        usb usbVar4 = this.c;
                        ey7Var.C();
                        if ((ey7Var.A() & 128) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        List list = Collections.EMPTY_LIST;
                        if (!z4) {
                            int A = ey7Var.A();
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
                                j2 = wn8.d(f, ey7Var);
                            } else {
                                j2 = -9223372036854775807L;
                            }
                            if (!z5) {
                                int A2 = ey7Var.A();
                                ArrayList arrayList = new ArrayList(A2);
                                for (int i = 0; i < A2; i++) {
                                    ey7Var.A();
                                    if (!z7) {
                                        j3 = wn8.d(f, ey7Var);
                                    } else {
                                        j3 = -9223372036854775807L;
                                    }
                                    usbVar4.b(j3);
                                    arrayList.add(new Object());
                                }
                                list = arrayList;
                            }
                            if (z6) {
                                ey7Var.A();
                                ey7Var.C();
                            }
                            ey7Var.H();
                            ey7Var.A();
                            ey7Var.A();
                            j = j2;
                        } else {
                            j = -9223372036854775807L;
                        }
                        obj = new epa(j, usbVar4.b(j), list);
                    }
                } else {
                    int A3 = ey7Var.A();
                    ArrayList arrayList2 = new ArrayList(A3);
                    for (int i2 = 0; i2 < A3; i2++) {
                        ey7Var.C();
                        if ((ey7Var.A() & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (!z) {
                            int A4 = ey7Var.A();
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
                                ey7Var.C();
                            } else {
                                int A5 = ey7Var.A();
                                ArrayList arrayList4 = new ArrayList(A5);
                                for (int i3 = 0; i3 < A5; i3++) {
                                    ey7Var.A();
                                    ey7Var.C();
                                    arrayList4.add(new z3f((byte) 26));
                                }
                                arrayList3 = arrayList4;
                            }
                            if (z3) {
                                ey7Var.A();
                                ey7Var.C();
                            }
                            ey7Var.H();
                            ey7Var.A();
                            ey7Var.A();
                        }
                        arrayList2.add(new j09(arrayList3));
                    }
                    obj = new gpa(arrayList2);
                }
            } else {
                long C = ey7Var.C();
                int i4 = f2 - 4;
                ey7Var.k(0, i4, new byte[i4]);
                obj = new wn8(C, f, (byte) 0);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new vf7(new tf7[0]);
        }
        return new vf7(obj);
    }
}
