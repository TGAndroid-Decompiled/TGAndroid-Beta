package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wn implements Runnable {
    public final int f19113a;
    public final vp f19114b;
    public final TLRPC.Dialog f19115c;

    public wn(vp vpVar, TLRPC.Dialog dialog, int i10) {
        this.f19113a = i10;
        this.f19114b = vpVar;
        this.f19115c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19113a) {
            case 0:
                boolean z10 = v2.f18448a;
                TLRPC.Dialog dialog = this.f19115c;
                if (z10) {
                    f8.b("checkLastDialogMessage for " + dialog.f19797id + " has not message");
                }
                vp vpVar = this.f19114b;
                if (vpVar.getMediaDataController().R(dialog.f19797id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar.Q.f(dialog.f19797id);
                    if (dialog2 == null) {
                        if (v2.f18448a) {
                            f8.b("checkLastDialogMessage for " + dialog.f19797id + " current dialog not found");
                        }
                        hs messagesStorage = vpVar.getMessagesStorage();
                        messagesStorage.f15938a.c(new or(messagesStorage, dialog.f19797id, new wn(vpVar, dialog, 2), 1));
                        return;
                    }
                    if (v2.f18448a) {
                        StringBuilder sb2 = new StringBuilder("checkLastDialogMessage for ");
                        sb2.append(dialog.f19797id);
                        sb2.append(" current dialog top message ");
                        i0.a.p(dialog2.top_message, sb2);
                    }
                    if (dialog2.top_message == 0) {
                        vpVar.X(3, dialog.f19797id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f19114b.f18763d1.e(this.f19115c.f19797id);
                return;
            default:
                vp vpVar2 = this.f19114b;
                vpVar2.getClass();
                vpVar2.X(3, this.f19115c.f19797id, false);
                return;
        }
    }
}
