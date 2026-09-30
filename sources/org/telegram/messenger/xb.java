package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f18118a;
    public final MessagesController f18119b;
    public final int f18120c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18121f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f18122n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18118a = i11;
        this.f18119b = messagesController;
        this.f18120c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18121f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f18122n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18118a) {
            case 0:
                this.f18119b.lambda$loadPinnedDialogs$366(this.f18120c, this.d, this.e, this.f18121f, this.h, this.f18122n);
                return;
            default:
                this.f18119b.lambda$loadPinnedDialogs$365(this.f18120c, this.d, this.e, this.f18121f, this.h, this.f18122n);
                return;
        }
    }
}
