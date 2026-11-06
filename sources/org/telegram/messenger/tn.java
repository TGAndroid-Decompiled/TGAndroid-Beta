package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tn implements Runnable {
    public final int f25642a;
    public final qp f25643b;
    public final TLRPC.Dialog f25644c;

    public tn(qp qpVar, TLRPC.Dialog dialog, int i7) {
        this.f25642a = i7;
        this.f25643b = qpVar;
        this.f25644c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25642a) {
            case 0:
                boolean z9 = r2.f25199a;
                TLRPC.Dialog dialog = this.f25644c;
                if (z9) {
                    a8.b("checkLastDialogMessage for " + dialog.f26957id + " has not message");
                }
                qp qpVar = this.f25643b;
                if (qpVar.getMediaDataController().R(dialog.f26957id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(dialog.f26957id);
                    if (dialog2 == null) {
                        if (r2.f25199a) {
                            a8.b("checkLastDialogMessage for " + dialog.f26957id + " current dialog not found");
                        }
                        yr messagesStorage = qpVar.getMessagesStorage();
                        messagesStorage.f26696a.c(new hr(messagesStorage, dialog.f26957id, new tn(qpVar, dialog, 2), 1));
                        return;
                    }
                    if (r2.f25199a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f26957id);
                        sb2.append(" current dialog top message ");
                        jg.g.s(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        qpVar.X(3, dialog.f26957id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25643b.f24752d1.e(this.f25644c.f26957id);
                return;
            default:
                qp qpVar2 = this.f25643b;
                qpVar2.getClass();
                qpVar2.X(3, this.f25644c.f26957id, false);
                return;
        }
    }
}
