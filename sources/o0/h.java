package o0;

import d5.y;
import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w3.a0;
import w3.e0;
import w3.m;
import w3.p;
import w3.r;
import w3.s;
import w3.t;
import w3.u;
import w3.z;
public final class h {
    public final int f18763a;
    public final List f18764b;

    public h(int i9, List list) {
        this.f18763a = i9;
        this.f18764b = list;
    }

    public e0 a(int i9, t5.c cVar) {
        String str = (String) cVar.f47683c;
        if (i9 != 2) {
            if (i9 != 3 && i9 != 4) {
                if (i9 != 21) {
                    if (i9 != 27) {
                        if (i9 != 36) {
                            if (i9 != 89) {
                                if (i9 != 138) {
                                    if (i9 != 172) {
                                        if (i9 != 257) {
                                            if (i9 != 134) {
                                                if (i9 != 135) {
                                                    switch (i9) {
                                                        case 15:
                                                            if (!c(2)) {
                                                                return new u(new w3.e(str, false));
                                                            }
                                                            return null;
                                                        case 16:
                                                            return new u(new m(new a0(1, b(cVar))));
                                                        case 17:
                                                            if (!c(2)) {
                                                                return new u(new s(str));
                                                            }
                                                            return null;
                                                        default:
                                                            switch (i9) {
                                                                case 128:
                                                                    break;
                                                                case 129:
                                                                    break;
                                                                case 130:
                                                                    if (!c(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new u(new w3.b(str, 0));
                                            } else if (!c(16)) {
                                                return new z(new t5.c("application/x-scte35", 6));
                                            } else {
                                                return null;
                                            }
                                        }
                                        return new z(new t5.c("application/vnd.dvb.ait", 6));
                                    }
                                    return new u(new w3.b(str, 1));
                                }
                                return new u(new w3.f(str));
                            }
                            return new u(new w3.g((List) cVar.f47682b));
                        }
                        return new u(new r(new a0(0, b(cVar))));
                    } else if (c(4)) {
                        return null;
                    } else {
                        return new u(new p(new a0(0, b(cVar)), c(1), c(8)));
                    }
                }
                return new u(new w3.g());
            }
            return new u(new t(str));
        }
        return new u(new w3.j(new a0(1, b(cVar))));
    }

    public List b(t5.c cVar) {
        boolean z10;
        String str;
        int i9;
        List list;
        boolean c10 = c(32);
        List list2 = this.f18764b;
        if (c10) {
            return list2;
        }
        y yVar = new y((byte[]) cVar.d);
        while (yVar.a() > 0) {
            int r10 = yVar.r();
            int r11 = yVar.f4411b + yVar.r();
            if (r10 == 134) {
                ArrayList arrayList = new ArrayList();
                int r12 = yVar.r() & 31;
                for (int i10 = 0; i10 < r12; i10++) {
                    String p6 = yVar.p(3, n8.d.f18513c);
                    int r13 = yVar.r();
                    if ((r13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i9 = r13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i9 = 1;
                    }
                    byte r14 = (byte) yVar.r();
                    yVar.D(1);
                    if (z10) {
                        list = Collections.singletonList((r14 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    s0 s0Var = new s0();
                    s0Var.f9705o = str;
                    s0Var.f9695c = p6;
                    s0Var.G = i9;
                    s0Var.f9707q = list;
                    arrayList.add(new t0(s0Var));
                }
                list2 = arrayList;
            }
            yVar.C(r11);
        }
        return list2;
    }

    public boolean c(int i9) {
        if ((i9 & this.f18763a) != 0) {
            return true;
        }
        return false;
    }

    public h() {
        this.f18763a = 1;
        this.f18764b = Collections.singletonList(null);
    }

    public h(ArrayList arrayList) {
        this.f18763a = 0;
        this.f18764b = arrayList;
    }
}
