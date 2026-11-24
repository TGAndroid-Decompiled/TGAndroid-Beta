package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gb7 implements qac {
    public final byte a;
    public final oc7 b;

    public gb7(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                if (oc7Var.X4 != messages_availableeffects) {
                    oc7Var.X4 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        vm.g(oc7Var.currentAccount).f(oc7Var.X4.documents);
                    }
                    oc7Var.getNotificationCenter().k(220, new Object[0]);
                }
                oc7Var.W4 = false;
                return;
            case 1:
                gm.c3(new q87(oc7Var, (TLRPC.TL_help_appConfig) obj, (byte) 3));
                return;
            default:
                gm.c3(new r87(oc7Var, (TL_account.TL_webBrowserSettings) obj, (byte) 0));
                return;
        }
    }
}
