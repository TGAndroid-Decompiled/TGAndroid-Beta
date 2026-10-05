package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f19789a;
    public final MessagesController f19790b;
    public final int f19791c;
    public final ArrayList d;
    public final boolean f19792e;
    public final TLRPC.TL_messages_peerDialogs f19793f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19794n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19789a = i11;
        this.f19790b = messagesController;
        this.f19791c = i10;
        this.d = arrayList;
        this.f19792e = z10;
        this.f19793f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19794n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19789a) {
            case 0:
                this.f19790b.lambda$loadPinnedDialogs$366(this.f19791c, this.d, this.f19792e, this.f19793f, this.h, this.f19794n);
                return;
            default:
                this.f19790b.lambda$loadPinnedDialogs$365(this.f19791c, this.d, this.f19792e, this.f19793f, this.h, this.f19794n);
                return;
        }
    }
}
