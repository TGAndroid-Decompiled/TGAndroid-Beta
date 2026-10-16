package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f16688a;
    public final MessagesController f16689b;
    public final int f16690c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f16691f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f16692n;

    public cb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f16688a = i11;
        this.f16689b = messagesController;
        this.f16690c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f16691f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f16692n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f16688a) {
            case 0:
                this.f16689b.lambda$loadPinnedDialogs$365(this.f16690c, this.d, this.e, this.f16691f, this.h, this.f16692n);
                return;
            default:
                this.f16689b.lambda$loadPinnedDialogs$364(this.f16690c, this.d, this.e, this.f16691f, this.h, this.f16692n);
                return;
        }
    }
}
