package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class db implements Runnable {
    public final int f18226a;
    public final MessagesController f18227b;
    public final int f18228c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18229f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f18230n;

    public db(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18226a = i11;
        this.f18227b = messagesController;
        this.f18228c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18229f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f18230n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18226a) {
            case 0:
                this.f18227b.lambda$loadPinnedDialogs$365(this.f18228c, this.d, this.e, this.f18229f, this.h, this.f18230n);
                return;
            default:
                this.f18227b.lambda$loadPinnedDialogs$364(this.f18228c, this.d, this.e, this.f18229f, this.h, this.f18230n);
                return;
        }
    }
}
