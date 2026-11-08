package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tn implements Runnable {
    public final int f25643a;
    public final qp f25644b;
    public final TLRPC.Dialog f25645c;

    public tn(qp qpVar, TLRPC.Dialog dialog, int i7) {
        this.f25643a = i7;
        this.f25644b = qpVar;
        this.f25645c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25643a) {
            case 0:
                boolean z9 = r2.f25212a;
                TLRPC.Dialog dialog = this.f25645c;
                if (z9) {
                    a8.b("checkLastDialogMessage for " + dialog.f26960id + " has not message");
                }
                qp qpVar = this.f25644b;
                if (qpVar.getMediaDataController().R(dialog.f26960id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(dialog.f26960id);
                    if (dialog2 == null) {
                        if (r2.f25212a) {
                            a8.b("checkLastDialogMessage for " + dialog.f26960id + " current dialog not found");
                        }
                        yr messagesStorage = qpVar.getMessagesStorage();
                        messagesStorage.f26719a.c(new ir(messagesStorage, dialog.f26960id, new tn(qpVar, dialog, 2), 1));
                        return;
                    }
                    if (r2.f25212a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f26960id);
                        sb2.append(" current dialog top message ");
                        jg.g.s(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        qpVar.X(3, dialog.f26960id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25644b.f24759d1.e(this.f25645c.f26960id);
                return;
            default:
                qp qpVar2 = this.f25644b;
                qpVar2.getClass();
                qpVar2.X(3, this.f25645c.f26960id, false);
                return;
        }
    }
}
