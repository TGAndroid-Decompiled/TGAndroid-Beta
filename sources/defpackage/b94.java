package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class b94 implements Runnable {
    public final byte a;
    public final l94 b;

    public b94(l94 l94Var, byte b) {
        this.a = b;
        this.b = l94Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                if (l94Var.Y == 1 && !l94Var.Z) {
                    l94Var.q(-1);
                    return;
                }
                return;
            case 1:
                if (l94Var.Y == 5) {
                    l94Var.h(1, false);
                    return;
                }
                return;
            case 2:
                l94Var.F0.clear();
                return;
            case 3:
                l94Var.q(-1);
                return;
            case 4:
                if (l94Var.j) {
                    if (w01.a) {
                        fa4.b("debug_loading: " + l94Var.L0.getName() + " pause operation, clear requests");
                    }
                    l94Var.c(null, false, true);
                    return;
                }
                while (i3 < l94Var.G0.size()) {
                    ConnectionsManager.getInstance(l94Var.R).failNotRunningRequest(((k94) l94Var.G0.get(i3)).a);
                    i3++;
                }
                return;
            case 5:
                l94Var.j();
                ba4.G(l94Var.R).e(null, null, null, null, null, l94Var.r);
                return;
            case 6:
                l94Var.h(0, false);
                return;
            default:
                if (l94Var.Y != 3 && l94Var.Y != 2) {
                    l94Var.Y = (byte) 5;
                    b94 b94Var = new b94(l94Var, (byte) 1);
                    fa4.b("cancelRequests with callback");
                    if (l94Var.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i4 = 0; i4 < l94Var.G0.size(); i4++) {
                            k94 k94Var = (k94) l94Var.G0.get(i4);
                            if (k94Var.a != 0) {
                                k94Var.j = true;
                                k94Var.l = new mg3(k94Var, iArr, b94Var, (byte) 21);
                                iArr[0] = iArr[0] + 1;
                                fa4.b("cancelRequests cancel " + k94Var.a + " with callback");
                                ConnectionsManager.getInstance(l94Var.R).cancelRequest(k94Var.a, true, new e94(k94Var, (byte) 1));
                                int i5 = k94Var.d >>> 16;
                                iArr2[i5] = iArr2[i5] + k94Var.c;
                            }
                        }
                        while (i3 < 8) {
                            int i6 = (i3 << 16) | 2;
                            int i7 = iArr2[i3];
                            if (l94Var.j && !yp3.d()) {
                                i = 262144;
                            } else {
                                i = 1048576;
                            }
                            if (i7 > i) {
                                if (l94Var.u0) {
                                    i2 = l94Var.y0;
                                } else {
                                    i2 = l94Var.T;
                                }
                                ConnectionsManager.getInstance(l94Var.R).discardConnection(i2, i6);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
