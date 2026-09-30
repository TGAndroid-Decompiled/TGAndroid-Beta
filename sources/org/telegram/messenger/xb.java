package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f18133a;
    public final MessagesController f18134b;
    public final int f18135c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18136f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f18137n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18133a = i11;
        this.f18134b = messagesController;
        this.f18135c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18136f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f18137n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18133a) {
            case 0:
                this.f18134b.lambda$loadPinnedDialogs$366(this.f18135c, this.d, this.e, this.f18136f, this.h, this.f18137n);
                return;
            default:
                this.f18134b.lambda$loadPinnedDialogs$365(this.f18135c, this.d, this.e, this.f18136f, this.h, this.f18137n);
                return;
        }
    }
}
