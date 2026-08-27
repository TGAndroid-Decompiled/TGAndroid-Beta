package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class wb implements Runnable {

    public final int f22043a;

    public final MessagesController f22044b;

    public final int f22045c;
    public final ArrayList d;

    public final boolean f22046e;

    public final TLRPC.TL_messages_peerDialogs f22047f;
    public final a0.h h;

    public final TLRPC.TL_messages_dialogs f22048n;

    public wb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f22043a = i11;
        this.f22044b = messagesController;
        this.f22045c = i10;
        this.d = arrayList;
        this.f22046e = z10;
        this.f22047f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f22048n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f22043a) {
            case 0:
                this.f22044b.lambda$loadPinnedDialogs$366(this.f22045c, this.d, this.f22046e, this.f22047f, this.h, this.f22048n);
                break;
            default:
                this.f22044b.lambda$loadPinnedDialogs$365(this.f22045c, this.d, this.f22046e, this.f22047f, this.h, this.f22048n);
                break;
        }
    }
}
