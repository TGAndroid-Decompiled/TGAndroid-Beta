package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tn implements Runnable {
    public final int f25634a;
    public final qp f25635b;
    public final TLRPC.Dialog f25636c;

    public tn(qp qpVar, TLRPC.Dialog dialog, int i7) {
        this.f25634a = i7;
        this.f25635b = qpVar;
        this.f25636c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25634a) {
            case 0:
                boolean z9 = r2.f25191a;
                TLRPC.Dialog dialog = this.f25636c;
                if (z9) {
                    a8.b("checkLastDialogMessage for " + dialog.f26956id + " has not message");
                }
                qp qpVar = this.f25635b;
                if (qpVar.getMediaDataController().R(dialog.f26956id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(dialog.f26956id);
                    if (dialog2 == null) {
                        if (r2.f25191a) {
                            a8.b("checkLastDialogMessage for " + dialog.f26956id + " current dialog not found");
                        }
                        yr messagesStorage = qpVar.getMessagesStorage();
                        messagesStorage.f26688a.c(new hr(messagesStorage, dialog.f26956id, new tn(qpVar, dialog, 2), 1));
                        return;
                    }
                    if (r2.f25191a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f26956id);
                        sb2.append(" current dialog top message ");
                        jg.g.s(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        qpVar.X(3, dialog.f26956id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25635b.f24744d1.e(this.f25636c.f26956id);
                return;
            default:
                qp qpVar2 = this.f25635b;
                qpVar2.getClass();
                qpVar2.X(3, this.f25636c.f26956id, false);
                return;
        }
    }
}
