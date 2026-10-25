package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gb implements Runnable {
    public final int f20158a;
    public final MessagesController f20159b;
    public final int f20160c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f20161f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20162n;

    public gb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20158a = i11;
        this.f20159b = messagesController;
        this.f20160c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f20161f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20162n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20158a) {
            case 0:
                this.f20159b.lambda$loadPinnedDialogs$367(this.f20160c, this.d, this.e, this.f20161f, this.h, this.f20162n);
                return;
            default:
                this.f20159b.lambda$loadPinnedDialogs$366(this.f20160c, this.d, this.e, this.f20161f, this.h, this.f20162n);
                return;
        }
    }
}
