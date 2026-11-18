package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f25591a;
    public final mp f25592b;
    public final TLRPC.Dialog f25593c;

    public mn(mp mpVar, TLRPC.Dialog dialog, int i7) {
        this.f25591a = i7;
        this.f25592b = mpVar;
        this.f25593c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25591a) {
            case 0:
                boolean z10 = s2.f26723a;
                TLRPC.Dialog dialog = this.f25593c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28409id + " has not message");
                }
                mp mpVar = this.f25592b;
                if (mpVar.getMediaDataController().T(dialog.f28409id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(dialog.f28409id);
                    if (dialog2 == null) {
                        if (s2.f26723a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28409id + " current dialog not found");
                        }
                        tr messagesStorage = mpVar.getMessagesStorage();
                        messagesStorage.f27054a.c(new br(messagesStorage, dialog.f28409id, new mn(mpVar, dialog, 2), 1));
                        return;
                    }
                    if (s2.f26723a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28409id);
                        sb2.append(" current dialog top message ");
                        i5.c.t(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        mpVar.X(3, dialog.f28409id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25592b.f25635e1.e(this.f25593c.f28409id);
                return;
            default:
                mp mpVar2 = this.f25592b;
                mpVar2.getClass();
                mpVar2.X(3, this.f25593c.f28409id, false);
                return;
        }
    }
}
