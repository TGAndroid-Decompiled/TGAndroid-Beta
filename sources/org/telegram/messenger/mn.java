package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f25617a;
    public final mp f25618b;
    public final TLRPC.Dialog f25619c;

    public mn(mp mpVar, TLRPC.Dialog dialog, int i7) {
        this.f25617a = i7;
        this.f25618b = mpVar;
        this.f25619c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25617a) {
            case 0:
                boolean z10 = s2.f26749a;
                TLRPC.Dialog dialog = this.f25619c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28435id + " has not message");
                }
                mp mpVar = this.f25618b;
                if (mpVar.getMediaDataController().T(dialog.f28435id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(dialog.f28435id);
                    if (dialog2 == null) {
                        if (s2.f26749a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28435id + " current dialog not found");
                        }
                        tr messagesStorage = mpVar.getMessagesStorage();
                        messagesStorage.f27080a.c(new br(messagesStorage, dialog.f28435id, new mn(mpVar, dialog, 2), 1));
                        return;
                    }
                    if (s2.f26749a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28435id);
                        sb2.append(" current dialog top message ");
                        i5.c.t(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        mpVar.X(3, dialog.f28435id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25618b.f25661e1.e(this.f25619c.f28435id);
                return;
            default:
                mp mpVar2 = this.f25618b;
                mpVar2.getClass();
                mpVar2.X(3, this.f25619c.f28435id, false);
                return;
        }
    }
}
