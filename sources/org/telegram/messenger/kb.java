package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kb implements Runnable {
    public final int f20503a;
    public final MessagesController f20504b;
    public final int f20505c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f20506f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20507n;

    public kb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20503a = i11;
        this.f20504b = messagesController;
        this.f20505c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f20506f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20507n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20503a) {
            case 0:
                this.f20504b.lambda$loadPinnedDialogs$367(this.f20505c, this.d, this.e, this.f20506f, this.h, this.f20507n);
                return;
            default:
                this.f20504b.lambda$loadPinnedDialogs$366(this.f20505c, this.d, this.e, this.f20506f, this.h, this.f20507n);
                return;
        }
    }
}
