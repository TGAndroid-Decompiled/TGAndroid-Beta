package o0;

import h3.s0;
import h3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w3.a0;
import w3.f0;
import w3.p;
import w3.r;
import w3.s;
import w3.t;
import w3.u;
import w3.z;

public final class i {

    public final int f19107a;

    public final List f19108b;

    public i(int i10, List list) {
        this.f19107a = i10;
        this.f19108b = list;
    }

    public f0 a(int i10, u2.b bVar) {
        String str = (String) bVar.f48262b;
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new u(new t(str));
            }
            if (i10 == 21) {
                return new u(new w3.g());
            }
            if (i10 == 27) {
                if (c(4)) {
                    return null;
                }
                return new u(new p(new a0(0, b(bVar)), c(1), c(8)));
            }
            if (i10 == 36) {
                return new u(new r(new a0(0, b(bVar))));
            }
            if (i10 == 89) {
                return new u(new w3.g((List) bVar.f48263c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new u(new w3.b(str, 1));
                }
                if (i10 == 257) {
                    return new z(new u2.b("application/vnd.dvb.ait", 6));
                }
                if (i10 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new z(new u2.b("application/x-scte35", 6));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new w3.e(str, false));
                        case 16:
                            return new u(new w3.m(new a0(1, b(bVar))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new u(new s(str));
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
                            break;
                    }
                }
                return new u(new w3.b(str, 0));
            }
            return new u(new w3.f(str));
        }
        return new u(new w3.j(new a0(1, b(bVar))));
    }

    public List b(u2.b bVar) {
        String str;
        int i10;
        boolean zC = c(32);
        List list = this.f19108b;
        if (zC) {
            return list;
        }
        d5.z zVar = new d5.z((byte[]) bVar.d);
        while (zVar.a() > 0) {
            int iR = zVar.r();
            int iR2 = zVar.f4859b + zVar.r();
            if (iR == 134) {
                ArrayList arrayList = new ArrayList();
                int iR3 = zVar.r() & 31;
                for (int i11 = 0; i11 < iR3; i11++) {
                    String strP = zVar.p(3, o8.d.f19363c);
                    int iR4 = zVar.r();
                    boolean z10 = (iR4 & 128) != 0;
                    if (z10) {
                        i10 = iR4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bR = (byte) zVar.r();
                    zVar.D(1);
                    List listSingletonList = z10 ? Collections.singletonList((bR & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    s0 s0Var = new s0();
                    s0Var.f8135o = str;
                    s0Var.f8125c = strP;
                    s0Var.G = i10;
                    s0Var.f8137q = listSingletonList;
                    arrayList.add(new t0(s0Var));
                }
                list = arrayList;
            }
            zVar.C(iR2);
        }
        return list;
    }

    public boolean c(int i10) {
        return (i10 & this.f19107a) != 0;
    }

    public i() {
        this.f19107a = 1;
        this.f19108b = Collections.singletonList(null);
    }

    public i(ArrayList arrayList) {
        this.f19107a = 0;
        this.f19108b = arrayList;
    }
}
