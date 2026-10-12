package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cb implements Runnable {
    public final int f16991a;
    public final MessagesController f16992b;
    public final int f16993c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f16994f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f16995n;

    public cb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f16991a = i11;
        this.f16992b = messagesController;
        this.f16993c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f16994f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f16995n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f16991a) {
            case 0:
                this.f16992b.lambda$loadPinnedDialogs$365(this.f16993c, this.d, this.e, this.f16994f, this.h, this.f16995n);
                return;
            default:
                this.f16992b.lambda$loadPinnedDialogs$364(this.f16993c, this.d, this.e, this.f16994f, this.h, this.f16995n);
                return;
        }
    }
}
