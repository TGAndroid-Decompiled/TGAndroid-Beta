package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f19503a;
    public final MessagesController f19504b;
    public final int f19505c;
    public final ArrayList d;
    public final boolean f19506e;
    public final TLRPC.TL_messages_peerDialogs f19507f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19508n;

    public wb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19503a = i11;
        this.f19504b = messagesController;
        this.f19505c = i10;
        this.d = arrayList;
        this.f19506e = z10;
        this.f19507f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19508n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19503a) {
            case 0:
                this.f19504b.lambda$loadPinnedDialogs$366(this.f19505c, this.d, this.f19506e, this.f19507f, this.h, this.f19508n);
                return;
            default:
                this.f19504b.lambda$loadPinnedDialogs$365(this.f19505c, this.d, this.f19506e, this.f19507f, this.h, this.f19508n);
                return;
        }
    }
}
