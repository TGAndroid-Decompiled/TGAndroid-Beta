package o0;

import f5.w;
import j3.s0;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y3.a0;
import y3.e0;
import y3.m;
import y3.p;
import y3.r;
import y3.s;
import y3.t;
import y3.u;
import y3.z;
public final class i {
    public final int f19006a;
    public final List f19007b;

    public i(int i10, List list) {
        this.f19006a = i10;
        this.f19007b = list;
    }

    public e0 a(int i10, v5.c cVar) {
        String str = (String) cVar.f49410c;
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 27) {
                        if (i10 != 36) {
                            if (i10 != 89) {
                                if (i10 != 138) {
                                    if (i10 != 172) {
                                        if (i10 != 257) {
                                            if (i10 != 134) {
                                                if (i10 != 135) {
                                                    switch (i10) {
                                                        case 15:
                                                            if (!c(2)) {
                                                                return new u(new y3.e(str, false));
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
                                                            switch (i10) {
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
                                                return new u(new y3.b(str, 0));
                                            } else if (!c(16)) {
                                                return new z(new v5.c("application/x-scte35", 6));
                                            } else {
                                                return null;
                                            }
                                        }
                                        return new z(new v5.c("application/vnd.dvb.ait", 6));
                                    }
                                    return new u(new y3.b(str, 1));
                                }
                                return new u(new y3.f(str));
                            }
                            return new u(new y3.g((List) cVar.f49409b));
                        }
                        return new u(new r(new a0(0, b(cVar))));
                    } else if (c(4)) {
                        return null;
                    } else {
                        return new u(new p(new a0(0, b(cVar)), c(1), c(8)));
                    }
                }
                return new u(new y3.g());
            }
            return new u(new t(str));
        }
        return new u(new y3.j(new a0(1, b(cVar))));
    }

    public List b(v5.c cVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        boolean c3 = c(32);
        List list2 = this.f19007b;
        if (c3) {
            return list2;
        }
        w wVar = new w((byte[]) cVar.d);
        while (wVar.a() > 0) {
            int r6 = wVar.r();
            int r9 = wVar.f6641b + wVar.r();
            if (r6 == 134) {
                ArrayList arrayList = new ArrayList();
                int r10 = wVar.r() & 31;
                for (int i11 = 0; i11 < r10; i11++) {
                    String p10 = wVar.p(3, p8.d.f45658c);
                    int r11 = wVar.r();
                    if ((r11 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = r11 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte r12 = (byte) wVar.r();
                    wVar.D(1);
                    if (z10) {
                        list = Collections.singletonList((r12 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    s0 s0Var = new s0();
                    s0Var.f10742o = str;
                    s0Var.f10732c = p10;
                    s0Var.G = i10;
                    s0Var.f10744q = list;
                    arrayList.add(new t0(s0Var));
                }
                list2 = arrayList;
            }
            wVar.C(r9);
        }
        return list2;
    }

    public boolean c(int i10) {
        if ((i10 & this.f19006a) != 0) {
            return true;
        }
        return false;
    }

    public i() {
        this.f19006a = 1;
        this.f19007b = Collections.singletonList(null);
    }

    public i(ArrayList arrayList) {
        this.f19006a = 0;
        this.f19007b = arrayList;
    }
}
