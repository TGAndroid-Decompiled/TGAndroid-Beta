package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f18146a;
    public final MessagesController f18147b;
    public final int f18148c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18149f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f18150n;

    public cb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18146a = i11;
        this.f18147b = messagesController;
        this.f18148c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18149f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f18150n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18146a) {
            case 0:
                this.f18147b.lambda$loadPinnedDialogs$365(this.f18148c, this.d, this.e, this.f18149f, this.h, this.f18150n);
                return;
            default:
                this.f18147b.lambda$loadPinnedDialogs$364(this.f18148c, this.d, this.e, this.f18149f, this.h, this.f18150n);
                return;
        }
    }
}
