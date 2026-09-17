package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f19530a;
    public final MessagesController f19531b;
    public final int f19532c;
    public final ArrayList d;
    public final boolean f19533e;
    public final TLRPC.TL_messages_peerDialogs f19534f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19535n;

    public wb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19530a = i11;
        this.f19531b = messagesController;
        this.f19532c = i10;
        this.d = arrayList;
        this.f19533e = z10;
        this.f19534f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19535n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                this.f19531b.lambda$loadPinnedDialogs$366(this.f19532c, this.d, this.f19533e, this.f19534f, this.h, this.f19535n);
                return;
            default:
                this.f19531b.lambda$loadPinnedDialogs$365(this.f19532c, this.d, this.f19533e, this.f19534f, this.h, this.f19535n);
                return;
        }
    }
}
