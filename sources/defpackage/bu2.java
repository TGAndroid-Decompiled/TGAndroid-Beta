package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bu2 implements RequestDelegate {
    public final byte a;
    public final qu2 b;

    public bu2(qu2 qu2Var, byte b) {
        this.a = b;
        this.b = qu2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final qu2 qu2Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        gl.d3(new ee2(qu2Var, tL_help_inviteText, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        qu2 qu2Var2 = qu2Var;
                        switch (b2) {
                            case 0:
                                if (tL_error2 == null) {
                                    qu2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    qu2Var2.G = (byte) 2;
                                } else {
                                    qu2Var2.G = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                if (tL_error2 == null) {
                                    qu2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    qu2Var2.H = (byte) 2;
                                } else {
                                    qu2Var2.H = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        qu2 qu2Var2 = qu2Var;
                        switch (b2) {
                            case 0:
                                if (tL_error2 == null) {
                                    qu2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    qu2Var2.G = (byte) 2;
                                } else {
                                    qu2Var2.G = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                            default:
                                if (tL_error2 == null) {
                                    qu2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    qu2Var2.H = (byte) 2;
                                } else {
                                    qu2Var2.H = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
