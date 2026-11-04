package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r4 implements RequestDelegate {
    public final int f25071a;
    public final g5 f25072b;

    public r4(g5 g5Var, int i3) {
        this.f25071a = i3;
        this.f25072b = g5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f25071a) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        g0.h3(new b4(1, this.f25072b, tL_help_inviteText));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                final g5 g5Var = this.f25072b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                g5 g5Var2 = g5Var;
                                if (tL_error == null) {
                                    g5Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject;
                                    g5Var2.G = 2;
                                } else {
                                    g5Var2.G = 0;
                                }
                                g5Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                g5 g5Var3 = g5Var;
                                if (tL_error == null) {
                                    g5Var3.I = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    g5Var3.H = 2;
                                } else {
                                    g5Var3.H = 0;
                                }
                                g5Var3.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final g5 g5Var2 = this.f25072b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                g5 g5Var22 = g5Var2;
                                if (tL_error == null) {
                                    g5Var22.Y = (TLRPC.GlobalPrivacySettings) tLObject;
                                    g5Var22.G = 2;
                                } else {
                                    g5Var22.G = 0;
                                }
                                g5Var22.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                g5 g5Var3 = g5Var2;
                                if (tL_error == null) {
                                    g5Var3.I = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    g5Var3.H = 2;
                                } else {
                                    g5Var3.H = 0;
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
