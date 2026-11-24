package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class bb4 implements Runnable {
    public final byte a;
    public final lb4 b;

    public bb4(lb4 lb4Var, byte b) {
        this.a = b;
        this.b = lb4Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                if (lb4Var.Y == 1 && !lb4Var.Z) {
                    lb4Var.q(-1);
                    return;
                }
                return;
            case 1:
                if (lb4Var.Y == 5) {
                    lb4Var.h(1, false);
                    return;
                }
                return;
            case 2:
                lb4Var.F0.clear();
                return;
            case 3:
                lb4Var.q(-1);
                return;
            case 4:
                if (lb4Var.j) {
                    if (e21.a) {
                        fc4.b("debug_loading: " + lb4Var.L0.getName() + " pause operation, clear requests");
                    }
                    lb4Var.c(null, false, true);
                    return;
                }
                while (i3 < lb4Var.G0.size()) {
                    ConnectionsManager.getInstance(lb4Var.R).failNotRunningRequest(((kb4) lb4Var.G0.get(i3)).a);
                    i3++;
                }
                return;
            case 5:
                lb4Var.j();
                bc4.G(lb4Var.R).e(null, null, null, null, null, lb4Var.r);
                return;
            case 6:
                lb4Var.h(0, false);
                return;
            default:
                if (lb4Var.Y != 3 && lb4Var.Y != 2) {
                    lb4Var.Y = (byte) 5;
                    bb4 bb4Var = new bb4(lb4Var, (byte) 1);
                    fc4.b("cancelRequests with callback");
                    if (lb4Var.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i4 = 0; i4 < lb4Var.G0.size(); i4++) {
                            kb4 kb4Var = (kb4) lb4Var.G0.get(i4);
                            if (kb4Var.a != 0) {
                                kb4Var.j = true;
                                kb4Var.l = new pz2(kb4Var, iArr, bb4Var, (byte) 23);
                                iArr[0] = iArr[0] + 1;
                                fc4.b("cancelRequests cancel " + kb4Var.a + " with callback");
                                ConnectionsManager.getInstance(lb4Var.R).cancelRequest(kb4Var.a, true, new eb4(kb4Var, (byte) 1));
                                int i5 = kb4Var.d >>> 16;
                                iArr2[i5] = iArr2[i5] + kb4Var.c;
                            }
                        }
                        while (i3 < 8) {
                            int i6 = (i3 << 16) | 2;
                            int i7 = iArr2[i3];
                            if (lb4Var.j && !ir3.d()) {
                                i = 262144;
                            } else {
                                i = 1048576;
                            }
                            if (i7 > i) {
                                if (lb4Var.u0) {
                                    i2 = lb4Var.y0;
                                } else {
                                    i2 = lb4Var.T;
                                }
                                ConnectionsManager.getInstance(lb4Var.R).discardConnection(i2, i6);
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
