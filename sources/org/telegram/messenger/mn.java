package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f25684a;
    public final mp f25685b;
    public final TLRPC.Dialog f25686c;

    public mn(mp mpVar, TLRPC.Dialog dialog, int i7) {
        this.f25684a = i7;
        this.f25685b = mpVar;
        this.f25686c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25684a) {
            case 0:
                boolean z10 = s2.f26829a;
                TLRPC.Dialog dialog = this.f25686c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28496id + " has not message");
                }
                mp mpVar = this.f25685b;
                if (mpVar.getMediaDataController().T(dialog.f28496id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(dialog.f28496id);
                    if (dialog2 == null) {
                        if (s2.f26829a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28496id + " current dialog not found");
                        }
                        tr messagesStorage = mpVar.getMessagesStorage();
                        messagesStorage.f27149a.c(new br(messagesStorage, dialog.f28496id, new mn(mpVar, dialog, 2), 1));
                        return;
                    }
                    if (s2.f26829a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28496id);
                        sb2.append(" current dialog top message ");
                        i5.c.t(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        mpVar.X(3, dialog.f28496id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25685b.f25728e1.e(this.f25686c.f28496id);
                return;
            default:
                mp mpVar2 = this.f25685b;
                mpVar2.getClass();
                mpVar2.X(3, this.f25686c.f28496id, false);
                return;
        }
    }
}
