package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f17852a;
    public final MessagesController f17853b;
    public final int f17854c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f17855f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f17856n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f17852a = i11;
        this.f17853b = messagesController;
        this.f17854c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f17855f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f17856n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f17852a) {
            case 0:
                this.f17853b.lambda$loadPinnedDialogs$366(this.f17854c, this.d, this.e, this.f17855f, this.h, this.f17856n);
                return;
            default:
                this.f17853b.lambda$loadPinnedDialogs$365(this.f17854c, this.d, this.e, this.f17855f, this.h, this.f17856n);
                return;
        }
    }
}
