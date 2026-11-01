package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class b7 implements Runnable {
    public final int f14937a;
    public final m7 f14938b;

    public b7(m7 m7Var, int i10) {
        this.f14937a = i10;
        this.f14938b = m7Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f14937a) {
            case 0:
                m7.a(this.f14938b);
                return;
            case 1:
                m7 m7Var = this.f14938b;
                if (m7Var.Y == 5) {
                    m7Var.j(1, false);
                    return;
                }
                return;
            case 2:
                this.f14938b.F0.clear();
                return;
            case 3:
                this.f14938b.s(-1);
                return;
            case 4:
                m7 m7Var2 = this.f14938b;
                if (m7Var2.f17066j) {
                    if (v2.f18578a) {
                        f8.b("debug_loading: " + m7Var2.L0.getName() + " pause operation, clear requests");
                    }
                    m7Var2.e(null, false, true);
                    return;
                }
                for (int i12 = 0; i12 < m7Var2.G0.size(); i12++) {
                    ConnectionsManager.getInstance(m7Var2.R).failNotRunningRequest(((l7) m7Var2.G0.get(i12)).f16902a);
                }
                return;
            case 5:
                m7.b(this.f14938b);
                return;
            case 6:
                this.f14938b.j(0, false);
                return;
            default:
                m7 m7Var3 = this.f14938b;
                if (m7Var3.Y != 3 && m7Var3.Y != 2) {
                    m7Var3.Y = 5;
                    b7 b7Var = new b7(m7Var3, 1);
                    f8.b("cancelRequests".concat(" with callback"));
                    if (m7Var3.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i13 = 0; i13 < m7Var3.G0.size(); i13++) {
                            l7 l7Var = (l7) m7Var3.G0.get(i13);
                            if (l7Var.f16902a != 0) {
                                l7Var.f16908j = true;
                                l7Var.f16910l = new ng(l7Var, iArr, b7Var, 20);
                                iArr[0] = iArr[0] + 1;
                                f8.b("cancelRequests cancel " + l7Var.f16902a + " with callback");
                                ConnectionsManager.getInstance(m7Var3.R).cancelRequest(l7Var.f16902a, true, new f7(l7Var, 1));
                                int i14 = l7Var.d >>> 16;
                                iArr2[i14] = iArr2[i14] + l7Var.f16904c;
                            }
                        }
                        for (int i15 = 0; i15 < 8; i15++) {
                            int i16 = (i15 << 16) | 2;
                            int i17 = iArr2[i15];
                            if (m7Var3.f17066j && !d6.g()) {
                                i10 = 262144;
                            } else {
                                i10 = 1048576;
                            }
                            if (i17 > i10) {
                                if (m7Var3.f17089u0) {
                                    i11 = m7Var3.f17096y0;
                                } else {
                                    i11 = m7Var3.T;
                                }
                                ConnectionsManager.getInstance(m7Var3.R).discardConnection(i11, i16);
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
