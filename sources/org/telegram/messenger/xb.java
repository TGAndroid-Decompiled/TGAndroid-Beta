package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f19578a;
    public final MessagesController f19579b;
    public final int f19580c;
    public final ArrayList d;
    public final boolean f19581e;
    public final TLRPC.TL_messages_peerDialogs f19582f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19583n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19578a = i11;
        this.f19579b = messagesController;
        this.f19580c = i10;
        this.d = arrayList;
        this.f19581e = z10;
        this.f19582f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19583n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19578a) {
            case 0:
                this.f19579b.lambda$loadPinnedDialogs$366(this.f19580c, this.d, this.f19581e, this.f19582f, this.h, this.f19583n);
                return;
            default:
                this.f19579b.lambda$loadPinnedDialogs$365(this.f19580c, this.d, this.f19581e, this.f19582f, this.h, this.f19583n);
                return;
        }
    }
}
