package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q4 implements RequestDelegate {
    public final int f24679a;
    public final g5 f24680b;

    public q4(g5 g5Var, int i7) {
        this.f24679a = i7;
        this.f24680b = g5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f24679a) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        g0.h3(new b4(1, this.f24680b, tL_help_inviteText));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                final g5 g5Var = this.f24680b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                g5 g5Var2 = g5Var;
                                if (tL_error == null) {
                                    g5Var2.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    g5Var2.F = 2;
                                } else {
                                    g5Var2.F = 0;
                                }
                                g5Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                g5 g5Var3 = g5Var;
                                if (tL_error == null) {
                                    g5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    g5Var3.G = 2;
                                } else {
                                    g5Var3.G = 0;
                                }
                                g5Var3.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final g5 g5Var2 = this.f24680b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                g5 g5Var22 = g5Var2;
                                if (tL_error == null) {
                                    g5Var22.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    g5Var22.F = 2;
                                } else {
                                    g5Var22.F = 0;
                                }
                                g5Var22.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                g5 g5Var3 = g5Var2;
                                if (tL_error == null) {
                                    g5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    g5Var3.G = 2;
                                } else {
                                    g5Var3.G = 0;
                                }
                                g5Var3.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
