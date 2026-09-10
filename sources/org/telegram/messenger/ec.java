package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ec implements Runnable {
    public final int f15079a;
    public final MessagesController f15080b;
    public final int f15081c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f15082f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f15083n;

    public ec(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f15079a = i11;
        this.f15080b = messagesController;
        this.f15081c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f15082f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f15083n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f15079a) {
            case 0:
                this.f15080b.lambda$loadPinnedDialogs$366(this.f15081c, this.d, this.e, this.f15082f, this.h, this.f15083n);
                return;
            default:
                this.f15080b.lambda$loadPinnedDialogs$365(this.f15081c, this.d, this.e, this.f15082f, this.h, this.f15083n);
                return;
        }
    }
}
