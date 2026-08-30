package b4;

import j3.m0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class f {
    public final int f1369a;
    public final List f1370b;

    public f(int i10, List list) {
        this.f1369a = i10;
        this.f1370b = list;
    }

    public i0 a(int i10, androidx.biometric.e eVar) {
        String str = (String) eVar.f478b;
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
                                                                return new w(new e(str, false));
                                                            }
                                                            return null;
                                                        case 16:
                                                            return new w(new n(new d0(1, b(eVar))));
                                                        case 17:
                                                            if (!c(2)) {
                                                                return new w(new t(str));
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
                                                return new w(new b(str, 0));
                                            } else if (!c(16)) {
                                                return new c0(new androidx.biometric.e("application/x-scte35", 3));
                                            } else {
                                                return null;
                                            }
                                        }
                                        return new c0(new androidx.biometric.e("application/vnd.dvb.ait", 3));
                                    }
                                    return new w(new b(str, 1));
                                }
                                return new w(new g(str));
                            }
                            return new w(new h((List) eVar.f479c));
                        }
                        return new w(new s(new d0(0, b(eVar))));
                    } else if (c(4)) {
                        return null;
                    } else {
                        return new w(new q(new d0(0, b(eVar)), c(1), c(8)));
                    }
                }
                return new w(new h());
            }
            return new w(new u(str));
        }
        return new w(new k(new d0(1, b(eVar))));
    }

    public List b(androidx.biometric.e eVar) {
        boolean z4;
        String str;
        int i10;
        List list;
        boolean c3 = c(32);
        List list2 = this.f1370b;
        if (c3) {
            return list2;
        }
        h5.w wVar = new h5.w((byte[]) eVar.d);
        while (wVar.a() > 0) {
            int u10 = wVar.u();
            int u11 = wVar.f7001b + wVar.u();
            if (u10 == 134) {
                ArrayList arrayList = new ArrayList();
                int u12 = wVar.u() & 31;
                for (int i11 = 0; i11 < u12; i11++) {
                    String s6 = wVar.s(3, r8.d.f43389c);
                    int u13 = wVar.u();
                    if ((u13 & 128) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        i10 = u13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte u14 = (byte) wVar.u();
                    wVar.G(1);
                    if (z4) {
                        list = Collections.singletonList((u14 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    m0 m0Var = new m0();
                    m0Var.f8684o = str;
                    m0Var.f8675c = s6;
                    m0Var.G = i10;
                    m0Var.f8686q = list;
                    arrayList.add(new n0(m0Var));
                }
                list2 = arrayList;
            }
            wVar.F(u11);
        }
        return list2;
    }

    public boolean c(int i10) {
        if ((i10 & this.f1369a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f1369a = 1;
        this.f1370b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f1369a = 0;
        this.f1370b = arrayList;
    }
}
