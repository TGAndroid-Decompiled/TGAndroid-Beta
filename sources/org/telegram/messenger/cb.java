package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f17303a;
    public final MessagesController f17304b;
    public final int f17305c;
    public final ArrayList d;
    public final boolean f17306e;
    public final TLRPC.TL_messages_peerDialogs f17307f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f17308n;

    public cb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f17303a = i11;
        this.f17304b = messagesController;
        this.f17305c = i10;
        this.d = arrayList;
        this.f17306e = z10;
        this.f17307f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f17308n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                this.f17304b.lambda$loadPinnedDialogs$365(this.f17305c, this.d, this.f17306e, this.f17307f, this.h, this.f17308n);
                return;
            default:
                this.f17304b.lambda$loadPinnedDialogs$364(this.f17305c, this.d, this.f17306e, this.f17307f, this.h, this.f17308n);
                return;
        }
    }
}
