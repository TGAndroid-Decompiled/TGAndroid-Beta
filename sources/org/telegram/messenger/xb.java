package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xb implements Runnable {
    public final int f18035a;
    public final MessagesController f18036b;
    public final int f18037c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f18038f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f18039n;

    public xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f18035a = i11;
        this.f18036b = messagesController;
        this.f18037c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f18038f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f18039n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f18035a) {
            case 0:
                this.f18036b.lambda$loadPinnedDialogs$366(this.f18037c, this.d, this.e, this.f18038f, this.h, this.f18039n);
                return;
            default:
                this.f18036b.lambda$loadPinnedDialogs$365(this.f18037c, this.d, this.e, this.f18038f, this.h, this.f18039n);
                return;
        }
    }
}
