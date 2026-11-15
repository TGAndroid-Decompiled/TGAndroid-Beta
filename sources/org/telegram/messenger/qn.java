package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qn implements Runnable {
    public final int f26111a;
    public final np f26112b;
    public final TLRPC.Dialog f26113c;

    public qn(np npVar, TLRPC.Dialog dialog, int i7) {
        this.f26111a = i7;
        this.f26112b = npVar;
        this.f26113c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f26111a) {
            case 0:
                boolean z10 = r2.f26206a;
                TLRPC.Dialog dialog = this.f26113c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f28055id + " has not message");
                }
                np npVar = this.f26112b;
                if (npVar.getMediaDataController().R(dialog.f28055id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar.R.f(dialog.f28055id);
                    if (dialog2 == null) {
                        if (r2.f26206a) {
                            a8.b("checkLastDialogMessage for " + dialog.f28055id + " current dialog not found");
                        }
                        vr messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.f27219a.c(new dr(messagesStorage, dialog.f28055id, new qn(npVar, dialog, 2), 1));
                        return;
                    }
                    if (r2.f26206a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f28055id);
                        sb2.append(" current dialog top message ");
                        i5.c.r(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        npVar.X(3, dialog.f28055id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f26112b.f25267e1.e(this.f26113c.f28055id);
                return;
            default:
                np npVar2 = this.f26112b;
                npVar2.getClass();
                npVar2.X(3, this.f26113c.f28055id, false);
                return;
        }
    }
}
