package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f18113a;
    public final MessagesController f18114b;
    public final int f18115c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18116f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f18117n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18113a = i11;
        this.f18114b = messagesController;
        this.f18115c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18116f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f18117n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18113a) {
            case 0:
                this.f18114b.lambda$loadPinnedDialogs$366(this.f18115c, this.d, this.e, this.f18116f, this.h, this.f18117n);
                return;
            default:
                this.f18114b.lambda$loadPinnedDialogs$365(this.f18115c, this.d, this.e, this.f18116f, this.h, this.f18117n);
                return;
        }
    }
}
