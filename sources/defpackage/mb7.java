package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mb7 implements pcc {
    public final byte a;
    public final uc7 b;

    public mb7(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                if (uc7Var.X4 != messages_availableeffects) {
                    uc7Var.X4 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        wl.g(uc7Var.currentAccount).f(uc7Var.X4.documents);
                    }
                    uc7Var.getNotificationCenter().k(220, new Object[0]);
                }
                uc7Var.W4 = false;
                return;
            case 1:
                hl.c3(new mn6(uc7Var, (TLRPC.TL_help_appConfig) obj, (byte) 29));
                return;
            default:
                hl.c3(new o87(uc7Var, (TL_account.TL_webBrowserSettings) obj, (byte) 0));
                return;
        }
    }
}
