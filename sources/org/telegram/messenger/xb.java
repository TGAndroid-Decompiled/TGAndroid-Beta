package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f18099a;
    public final MessagesController f18100b;
    public final int f18101c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18102f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f18103n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18099a = i11;
        this.f18100b = messagesController;
        this.f18101c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18102f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f18103n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18099a) {
            case 0:
                this.f18100b.lambda$loadPinnedDialogs$366(this.f18101c, this.d, this.e, this.f18102f, this.h, this.f18103n);
                return;
            default:
                this.f18100b.lambda$loadPinnedDialogs$365(this.f18101c, this.d, this.e, this.f18102f, this.h, this.f18103n);
                return;
        }
    }
}
