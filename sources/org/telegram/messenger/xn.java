package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xn implements Runnable {
    public final int f19456a;
    public final wp f19457b;
    public final TLRPC.Dialog f19458c;

    public xn(wp wpVar, TLRPC.Dialog dialog, int i10) {
        this.f19456a = i10;
        this.f19457b = wpVar;
        this.f19458c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19456a) {
            case 0:
                boolean z10 = v2.f18578a;
                TLRPC.Dialog dialog = this.f19458c;
                if (z10) {
                    f8.b("checkLastDialogMessage for " + dialog.f19798id + " has not message");
                }
                wp wpVar = this.f19457b;
                if (wpVar.getMediaDataController().R(dialog.f19798id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar.Q.f(dialog.f19798id);
                    if (dialog2 == null) {
                        if (v2.f18578a) {
                            f8.b("checkLastDialogMessage for " + dialog.f19798id + " current dialog not found");
                        }
                        is messagesStorage = wpVar.getMessagesStorage();
                        messagesStorage.f16331a.c(new pr(messagesStorage, dialog.f19798id, new xn(wpVar, dialog, 2), 1));
                        return;
                    }
                    if (v2.f18578a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f19798id);
                        sb2.append(" current dialog top message ");
                        i0.a.p(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        wpVar.X(3, dialog.f19798id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f19457b.f19106d1.e(this.f19458c.f19798id);
                return;
            default:
                wp wpVar2 = this.f19457b;
                wpVar2.getClass();
                wpVar2.X(3, this.f19458c.f19798id, false);
                return;
        }
    }
}
