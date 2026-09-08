package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f19605a;
    public final MessagesController f19606b;
    public final int f19607c;
    public final ArrayList d;
    public final boolean f19608e;
    public final TLRPC.TL_messages_peerDialogs f19609f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19610n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19605a = i11;
        this.f19606b = messagesController;
        this.f19607c = i10;
        this.d = arrayList;
        this.f19608e = z10;
        this.f19609f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19610n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19605a) {
            case 0:
                this.f19606b.lambda$loadPinnedDialogs$366(this.f19607c, this.d, this.f19608e, this.f19609f, this.h, this.f19610n);
                return;
            default:
                this.f19606b.lambda$loadPinnedDialogs$365(this.f19607c, this.d, this.f19608e, this.f19609f, this.h, this.f19610n);
                return;
        }
    }
}
