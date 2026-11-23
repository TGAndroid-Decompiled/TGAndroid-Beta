package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f25752a;
    public final np f25753b;
    public final TLRPC.Dialog f25754c;

    public nn(np npVar, TLRPC.Dialog dialog, int i7) {
        this.f25752a = i7;
        this.f25753b = npVar;
        this.f25754c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f25752a) {
            case 0:
                boolean z10 = s2.f26694a;
                TLRPC.Dialog dialog = this.f25754c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28402id + " has not message");
                }
                np npVar = this.f25753b;
                if (npVar.getMediaDataController().T(dialog.f28402id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar.R.f(dialog.f28402id);
                    if (dialog2 == null) {
                        if (s2.f26694a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28402id + " current dialog not found");
                        }
                        ur messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.f27214a.c(new cr(messagesStorage, dialog.f28402id, new nn(npVar, dialog, 2), 1));
                        return;
                    }
                    if (s2.f26694a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28402id);
                        sb2.append(" current dialog top message ");
                        i5.c.t(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        npVar.X(3, dialog.f28402id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f25753b.f25796e1.e(this.f25754c.f28402id);
                return;
            default:
                np npVar2 = this.f25753b;
                npVar2.getClass();
                npVar2.X(3, this.f25754c.f28402id, false);
                return;
        }
    }
}
