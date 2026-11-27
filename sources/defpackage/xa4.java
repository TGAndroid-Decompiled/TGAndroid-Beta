package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class xa4 implements Runnable {
    public final byte a;
    public final hb4 b;

    public xa4(hb4 hb4Var, byte b) {
        this.a = b;
        this.b = hb4Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                if (hb4Var.Y == 1 && !hb4Var.Z) {
                    hb4Var.q(-1);
                    return;
                }
                return;
            case 1:
                if (hb4Var.j) {
                    if (f11.a) {
                        cc4.b("debug_loading: " + hb4Var.L0.getName() + " pause operation, clear requests");
                    }
                    hb4Var.c(null, false, true);
                    return;
                }
                while (i3 < hb4Var.G0.size()) {
                    ConnectionsManager.getInstance(hb4Var.R).failNotRunningRequest(((gb4) hb4Var.G0.get(i3)).a);
                    i3++;
                }
                return;
            case 2:
                if (hb4Var.Y == 5) {
                    hb4Var.h(1, false);
                    return;
                }
                return;
            case 3:
                hb4Var.F0.clear();
                return;
            case 4:
                hb4Var.j();
                xb4.G(hb4Var.R).e(null, null, null, null, null, hb4Var.r);
                return;
            case 5:
                hb4Var.h(0, false);
                return;
            case 6:
                hb4Var.q(-1);
                return;
            default:
                if (hb4Var.Y != 3 && hb4Var.Y != 2) {
                    hb4Var.Y = (byte) 5;
                    xa4 xa4Var = new xa4(hb4Var, (byte) 2);
                    cc4.b("cancelRequests with callback");
                    if (hb4Var.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i4 = 0; i4 < hb4Var.G0.size(); i4++) {
                            gb4 gb4Var = (gb4) hb4Var.G0.get(i4);
                            if (gb4Var.a != 0) {
                                gb4Var.j = true;
                                gb4Var.l = new cv2(gb4Var, iArr, xa4Var, (byte) 25);
                                iArr[0] = iArr[0] + 1;
                                cc4.b("cancelRequests cancel " + gb4Var.a + " with callback");
                                ConnectionsManager.getInstance(hb4Var.R).cancelRequest(gb4Var.a, true, new bb4(gb4Var, (byte) 1));
                                int i5 = gb4Var.d >>> 16;
                                iArr2[i5] = iArr2[i5] + gb4Var.c;
                            }
                        }
                        while (i3 < 8) {
                            int i6 = (i3 << 16) | 2;
                            int i7 = iArr2[i3];
                            if (hb4Var.j && !pq3.d()) {
                                i = 262144;
                            } else {
                                i = 1048576;
                            }
                            if (i7 > i) {
                                if (hb4Var.u0) {
                                    i2 = hb4Var.y0;
                                } else {
                                    i2 = hb4Var.T;
                                }
                                ConnectionsManager.getInstance(hb4Var.R).discardConnection(i2, i6);
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
