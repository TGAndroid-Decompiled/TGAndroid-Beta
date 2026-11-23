package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f25788a;
    public final np f25789b;
    public final TLRPC.Dialog f25790c;

    public nn(np npVar, TLRPC.Dialog dialog, int i7) {
        this.f25788a = i7;
        this.f25789b = npVar;
        this.f25790c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25788a) {
            case 0:
                boolean z10 = s2.f26730a;
                TLRPC.Dialog dialog = this.f25790c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28438id + " has not message");
                }
                np npVar = this.f25789b;
                if (npVar.getMediaDataController().T(dialog.f28438id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar.R.f(dialog.f28438id);
                    if (dialog2 == null) {
                        if (s2.f26730a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28438id + " current dialog not found");
                        }
                        ur messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.f27250a.c(new cr(messagesStorage, dialog.f28438id, new nn(npVar, dialog, 2), 1));
                        return;
                    }
                    if (s2.f26730a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28438id);
                        sb2.append(" current dialog top message ");
                        i5.c.t(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        npVar.X(3, dialog.f28438id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25789b.f25832e1.e(this.f25790c.f28438id);
                return;
            default:
                np npVar2 = this.f25789b;
                npVar2.getClass();
                npVar2.X(3, this.f25790c.f28438id, false);
                return;
        }
    }
}
