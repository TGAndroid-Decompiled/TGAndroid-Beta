package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f19791a;
    public final MessagesController f19792b;
    public final int f19793c;
    public final ArrayList d;
    public final boolean f19794e;
    public final TLRPC.TL_messages_peerDialogs f19795f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19796n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19791a = i11;
        this.f19792b = messagesController;
        this.f19793c = i10;
        this.d = arrayList;
        this.f19794e = z10;
        this.f19795f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19796n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19791a) {
            case 0:
                this.f19792b.lambda$loadPinnedDialogs$366(this.f19793c, this.d, this.f19794e, this.f19795f, this.h, this.f19796n);
                return;
            default:
                this.f19792b.lambda$loadPinnedDialogs$365(this.f19793c, this.d, this.f19794e, this.f19795f, this.h, this.f19796n);
                return;
        }
    }
}
