package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f17304a;
    public final MessagesController f17305b;
    public final int f17306c;
    public final ArrayList d;
    public final boolean f17307e;
    public final TLRPC.TL_messages_peerDialogs f17308f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f17309n;

    public cb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f17304a = i11;
        this.f17305b = messagesController;
        this.f17306c = i10;
        this.d = arrayList;
        this.f17307e = z10;
        this.f17308f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f17309n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                this.f17305b.lambda$loadPinnedDialogs$365(this.f17306c, this.d, this.f17307e, this.f17308f, this.h, this.f17309n);
                return;
            default:
                this.f17305b.lambda$loadPinnedDialogs$364(this.f17306c, this.d, this.f17307e, this.f17308f, this.h, this.f17309n);
                return;
        }
    }
}
