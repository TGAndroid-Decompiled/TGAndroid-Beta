package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tn implements Runnable {
    public final int f25647a;
    public final qp f25648b;
    public final TLRPC.Dialog f25649c;

    public tn(qp qpVar, TLRPC.Dialog dialog, int i7) {
        this.f25647a = i7;
        this.f25648b = qpVar;
        this.f25649c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25647a) {
            case 0:
                boolean z9 = r2.f25216a;
                TLRPC.Dialog dialog = this.f25649c;
                if (z9) {
                    a8.b("checkLastDialogMessage for " + dialog.f26964id + " has not message");
                }
                qp qpVar = this.f25648b;
                if (qpVar.getMediaDataController().R(dialog.f26964id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(dialog.f26964id);
                    if (dialog2 == null) {
                        if (r2.f25216a) {
                            a8.b("checkLastDialogMessage for " + dialog.f26964id + " current dialog not found");
                        }
                        yr messagesStorage = qpVar.getMessagesStorage();
                        messagesStorage.f26723a.c(new ir(messagesStorage, dialog.f26964id, new tn(qpVar, dialog, 2), 1));
                        return;
                    }
                    if (r2.f25216a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f26964id);
                        sb2.append(" current dialog top message ");
                        jg.g.s(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        qpVar.X(3, dialog.f26964id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25648b.f24763d1.e(this.f25649c.f26964id);
                return;
            default:
                qp qpVar2 = this.f25648b;
                qpVar2.getClass();
                qpVar2.X(3, this.f25649c.f26964id, false);
                return;
        }
    }
}
