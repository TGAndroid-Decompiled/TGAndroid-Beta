package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f18083a;
    public final MessagesController f18084b;
    public final int f18085c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18086f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f18087n;

    public cb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18083a = i11;
        this.f18084b = messagesController;
        this.f18085c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18086f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f18087n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18083a) {
            case 0:
                this.f18084b.lambda$loadPinnedDialogs$365(this.f18085c, this.d, this.e, this.f18086f, this.h, this.f18087n);
                return;
            default:
                this.f18084b.lambda$loadPinnedDialogs$364(this.f18085c, this.d, this.e, this.f18086f, this.h, this.f18087n);
                return;
        }
    }
}
