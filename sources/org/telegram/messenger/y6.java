package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class y6 implements Runnable {
    public final int f26586a;
    public final i7 f26587b;

    public y6(i7 i7Var, int i7) {
        this.f26586a = i7;
        this.f26587b = i7Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        switch (this.f26586a) {
            case 0:
                i7.a(this.f26587b);
                return;
            case 1:
                i7 i7Var = this.f26587b;
                if (i7Var.Y == 5) {
                    i7Var.j(1, false);
                    return;
                }
                return;
            case 2:
                this.f26587b.F0.clear();
                return;
            case 3:
                this.f26587b.s(-1);
                return;
            case 4:
                i7 i7Var2 = this.f26587b;
                if (i7Var2.f23102j) {
                    if (r2.f25199a) {
                        a8.b("debug_loading: " + i7Var2.L0.getName() + " pause operation, clear requests");
                    }
                    i7Var2.e(null, false, true);
                    return;
                }
                for (int i11 = 0; i11 < i7Var2.G0.size(); i11++) {
                    ConnectionsManager.getInstance(i7Var2.R).failNotRunningRequest(((h7) i7Var2.G0.get(i11)).f22841a);
                }
                return;
            case 5:
                i7.b(this.f26587b);
                return;
            case 6:
                this.f26587b.j(0, false);
                return;
            default:
                i7 i7Var3 = this.f26587b;
                if (i7Var3.Y != 3 && i7Var3.Y != 2) {
                    i7Var3.Y = 5;
                    y6 y6Var = new y6(i7Var3, 1);
                    a8.b("cancelRequests".concat(" with callback"));
                    if (i7Var3.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i12 = 0; i12 < i7Var3.G0.size(); i12++) {
                            h7 h7Var = (h7) i7Var3.G0.get(i12);
                            if (h7Var.f22841a != 0) {
                                h7Var.f22848j = true;
                                h7Var.f22850l = new ng(h7Var, iArr, y6Var, 20);
                                iArr[0] = iArr[0] + 1;
                                a8.b("cancelRequests cancel " + h7Var.f22841a + " with callback");
                                ConnectionsManager.getInstance(i7Var3.R).cancelRequest(h7Var.f22841a, true, new b7(h7Var, 1));
                                int i13 = h7Var.d >>> 16;
                                iArr2[i13] = iArr2[i13] + h7Var.f22843c;
                            }
                        }
                        for (int i14 = 0; i14 < 8; i14++) {
                            int i15 = (i14 << 16) | 2;
                            int i16 = iArr2[i14];
                            if (i7Var3.f23102j && !b6.g()) {
                                i7 = 262144;
                            } else {
                                i7 = 1048576;
                            }
                            if (i16 > i7) {
                                if (i7Var3.f23125u0) {
                                    i10 = i7Var3.f23132y0;
                                } else {
                                    i10 = i7Var3.T;
                                }
                                ConnectionsManager.getInstance(i7Var3.R).discardConnection(i10, i15);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
