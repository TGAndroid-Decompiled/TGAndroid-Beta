package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u4 implements RequestDelegate {
    public final int f18249a;
    public final i5 f18250b;

    public u4(i5 i5Var, int i10) {
        this.f18249a = i10;
        this.f18250b = i5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f18249a) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        i0.g3(new e4(1, this.f18250b, tL_help_inviteText));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                final i5 i5Var = this.f18250b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                i5 i5Var2 = i5Var;
                                if (tL_error == null) {
                                    i5Var2.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    i5Var2.F = 2;
                                } else {
                                    i5Var2.F = 0;
                                }
                                i5Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                i5 i5Var3 = i5Var;
                                if (tL_error == null) {
                                    i5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    i5Var3.G = 2;
                                } else {
                                    i5Var3.G = 0;
                                }
                                i5Var3.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final i5 i5Var2 = this.f18250b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                i5 i5Var22 = i5Var2;
                                if (tL_error == null) {
                                    i5Var22.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    i5Var22.F = 2;
                                } else {
                                    i5Var22.F = 0;
                                }
                                i5Var22.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                i5 i5Var3 = i5Var2;
                                if (tL_error == null) {
                                    i5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    i5Var3.G = 2;
                                } else {
                                    i5Var3.G = 0;
                                }
                                i5Var3.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
