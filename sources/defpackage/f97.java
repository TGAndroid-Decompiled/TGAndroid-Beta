package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class f97 implements p8c {
    public final byte a;
    public final na7 b;

    public f97(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                if (na7Var.V4 != messages_availableeffects) {
                    na7Var.V4 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        vl.g(na7Var.currentAccount).f(na7Var.V4.documents);
                    }
                    na7Var.getNotificationCenter().k(219, new Object[0]);
                }
                na7Var.U4 = false;
                return;
            case 1:
                gl.c3(new t67(na7Var, (TLRPC.TL_help_appConfig) obj, (byte) 1));
                return;
            default:
                gl.c3(new p67(na7Var, (TL_account.TL_webBrowserSettings) obj, (byte) 0));
                return;
        }
    }
}
