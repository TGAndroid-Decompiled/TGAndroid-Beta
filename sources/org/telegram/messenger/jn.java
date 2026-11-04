package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jn implements Runnable {
    public final int f23688a;
    public final hp f23689b;
    public final TLRPC.Dialog f23690c;

    public jn(hp hpVar, TLRPC.Dialog dialog, int i3) {
        this.f23688a = i3;
        this.f23689b = hpVar;
        this.f23690c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f23688a) {
            case 0:
                boolean z10 = r2.f25040a;
                TLRPC.Dialog dialog = this.f23690c;
                if (z10) {
                    a8.b("checkLastDialogMessage for " + dialog.f27005id + " has not message");
                }
                hp hpVar = this.f23689b;
                if (hpVar.getMediaDataController().R(dialog.f27005id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar.R.f(dialog.f27005id);
                    if (dialog2 == null) {
                        if (r2.f25040a) {
                            a8.b("checkLastDialogMessage for " + dialog.f27005id + " current dialog not found");
                        }
                        qr messagesStorage = hpVar.getMessagesStorage();
                        messagesStorage.f24934a.c(new zq(messagesStorage, dialog.f27005id, new jn(hpVar, dialog, 2), 1));
                        return;
                    }
                    if (r2.f25040a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f27005id);
                        sb2.append(" current dialog top message ");
                        k2.p1.q(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        hpVar.X(3, dialog.f27005id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f23689b.f22993e1.e(this.f23690c.f27005id);
                return;
            default:
                hp hpVar2 = this.f23689b;
                hpVar2.getClass();
                hpVar2.X(3, this.f23690c.f27005id, false);
                return;
        }
    }
}
