package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f19792a;
    public final MessagesController f19793b;
    public final int f19794c;
    public final ArrayList d;
    public final boolean f19795e;
    public final TLRPC.TL_messages_peerDialogs f19796f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19797n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19792a = i11;
        this.f19793b = messagesController;
        this.f19794c = i10;
        this.d = arrayList;
        this.f19795e = z10;
        this.f19796f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19797n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19792a) {
            case 0:
                this.f19793b.lambda$loadPinnedDialogs$366(this.f19794c, this.d, this.f19795e, this.f19796f, this.h, this.f19797n);
                return;
            default:
                this.f19793b.lambda$loadPinnedDialogs$365(this.f19794c, this.d, this.f19795e, this.f19796f, this.h, this.f19797n);
                return;
        }
    }
}
