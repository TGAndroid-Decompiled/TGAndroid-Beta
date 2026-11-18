package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f25589a;
    public final mp f25590b;
    public final TLRPC.Dialog f25591c;

    public mn(mp mpVar, TLRPC.Dialog dialog, int i7) {
        this.f25589a = i7;
        this.f25590b = mpVar;
        this.f25591c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25589a) {
            case 0:
                boolean z10 = s2.f26721a;
                TLRPC.Dialog dialog = this.f25591c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28407id + " has not message");
                }
                mp mpVar = this.f25590b;
                if (mpVar.getMediaDataController().T(dialog.f28407id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(dialog.f28407id);
                    if (dialog2 == null) {
                        if (s2.f26721a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28407id + " current dialog not found");
                        }
                        tr messagesStorage = mpVar.getMessagesStorage();
                        messagesStorage.f27052a.c(new br(messagesStorage, dialog.f28407id, new mn(mpVar, dialog, 2), 1));
                        return;
                    }
                    if (s2.f26721a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28407id);
                        sb2.append(" current dialog top message ");
                        i5.c.t(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        mpVar.X(3, dialog.f28407id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25590b.f25633e1.e(this.f25591c.f28407id);
                return;
            default:
                mp mpVar2 = this.f25590b;
                mpVar2.getClass();
                mpVar2.X(3, this.f25591c.f28407id, false);
                return;
        }
    }
}
