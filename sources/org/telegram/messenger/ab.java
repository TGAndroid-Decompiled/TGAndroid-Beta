package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ab implements Runnable {
    public final int f17862a;
    public final MessagesController f17863b;
    public final int f17864c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f17865f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f17866n;

    public ab(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f17862a = i11;
        this.f17863b = messagesController;
        this.f17864c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f17865f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f17866n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f17862a) {
            case 0:
                this.f17863b.lambda$loadPinnedDialogs$365(this.f17864c, this.d, this.e, this.f17865f, this.h, this.f17866n);
                return;
            default:
                this.f17863b.lambda$loadPinnedDialogs$364(this.f17864c, this.d, this.e, this.f17865f, this.h, this.f17866n);
                return;
        }
    }
}
