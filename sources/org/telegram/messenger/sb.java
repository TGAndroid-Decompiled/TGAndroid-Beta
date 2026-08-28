package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sb implements Runnable {
    public final int f21476a;
    public final MessagesController f21477b;
    public final int f21478c;
    public final ArrayList d;
    public final boolean f21479e;
    public final TLRPC.TL_messages_peerDialogs f21480f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f21481n;

    public sb(MessagesController messagesController, int i9, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f21476a = i10;
        this.f21477b = messagesController;
        this.f21478c = i9;
        this.d = arrayList;
        this.f21479e = z10;
        this.f21480f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f21481n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f21476a) {
            case 0:
                this.f21477b.lambda$loadPinnedDialogs$366(this.f21478c, this.d, this.f21479e, this.f21480f, this.h, this.f21481n);
                return;
            default:
                this.f21477b.lambda$loadPinnedDialogs$365(this.f21478c, this.d, this.f21479e, this.f21480f, this.h, this.f21481n);
                return;
        }
    }
}
