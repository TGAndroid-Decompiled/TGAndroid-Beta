package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f19784a;
    public final MessagesController f19785b;
    public final int f19786c;
    public final ArrayList d;
    public final boolean f19787e;
    public final TLRPC.TL_messages_peerDialogs f19788f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19789n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19784a = i11;
        this.f19785b = messagesController;
        this.f19786c = i10;
        this.d = arrayList;
        this.f19787e = z10;
        this.f19788f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19789n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19784a) {
            case 0:
                this.f19785b.lambda$loadPinnedDialogs$366(this.f19786c, this.d, this.f19787e, this.f19788f, this.h, this.f19789n);
                return;
            default:
                this.f19785b.lambda$loadPinnedDialogs$365(this.f19786c, this.d, this.f19787e, this.f19788f, this.h, this.f19789n);
                return;
        }
    }
}
