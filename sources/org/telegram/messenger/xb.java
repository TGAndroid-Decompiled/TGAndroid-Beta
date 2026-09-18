package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f17863a;
    public final MessagesController f17864b;
    public final int f17865c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f17866f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f17867n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f17863a = i11;
        this.f17864b = messagesController;
        this.f17865c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f17866f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f17867n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f17863a) {
            case 0:
                this.f17864b.lambda$loadPinnedDialogs$366(this.f17865c, this.d, this.e, this.f17866f, this.h, this.f17867n);
                return;
            default:
                this.f17864b.lambda$loadPinnedDialogs$365(this.f17865c, this.d, this.e, this.f17866f, this.h, this.f17867n);
                return;
        }
    }
}
