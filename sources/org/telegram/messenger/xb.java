package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f18116a;
    public final MessagesController f18117b;
    public final int f18118c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18119f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f18120n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18116a = i11;
        this.f18117b = messagesController;
        this.f18118c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18119f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f18120n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18116a) {
            case 0:
                this.f18117b.lambda$loadPinnedDialogs$366(this.f18118c, this.d, this.e, this.f18119f, this.h, this.f18120n);
                return;
            default:
                this.f18117b.lambda$loadPinnedDialogs$365(this.f18118c, this.d, this.e, this.f18119f, this.h, this.f18120n);
                return;
        }
    }
}
