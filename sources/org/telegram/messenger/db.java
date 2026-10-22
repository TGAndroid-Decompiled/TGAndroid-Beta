package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class db implements Runnable {
    public final int f18163a;
    public final MessagesController f18164b;
    public final int f18165c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18166f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f18167n;

    public db(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18163a = i11;
        this.f18164b = messagesController;
        this.f18165c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18166f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f18167n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18163a) {
            case 0:
                this.f18164b.lambda$loadPinnedDialogs$365(this.f18165c, this.d, this.e, this.f18166f, this.h, this.f18167n);
                return;
            default:
                this.f18164b.lambda$loadPinnedDialogs$364(this.f18165c, this.d, this.e, this.f18166f, this.h, this.f18167n);
                return;
        }
    }
}
