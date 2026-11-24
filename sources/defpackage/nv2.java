package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nv2 implements RequestDelegate {
    public final byte a;
    public final bw2 b;

    public nv2(bw2 bw2Var, byte b) {
        this.a = b;
        this.b = bw2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final bw2 bw2Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        gm.c3(new pf2(bw2Var, tL_help_inviteText, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        bw2 bw2Var2 = bw2Var;
                        switch (b2) {
                            case 0:
                                if (tL_error2 == null) {
                                    bw2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    bw2Var2.G = (byte) 2;
                                } else {
                                    bw2Var2.G = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                return;
                            default:
                                if (tL_error2 == null) {
                                    bw2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    bw2Var2.H = (byte) 2;
                                } else {
                                    bw2Var2.H = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        bw2 bw2Var2 = bw2Var;
                        switch (b2) {
                            case 0:
                                if (tL_error2 == null) {
                                    bw2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    bw2Var2.G = (byte) 2;
                                } else {
                                    bw2Var2.G = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                return;
                            default:
                                if (tL_error2 == null) {
                                    bw2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    bw2Var2.H = (byte) 2;
                                } else {
                                    bw2Var2.H = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
