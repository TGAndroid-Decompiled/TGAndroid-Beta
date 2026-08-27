package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class o9 implements Runnable {

    public final int f21139a = 0;

    public final int f21140b;

    public final boolean f21141c;
    public final boolean d;

    public final int f21142e;

    public final BaseController f21143f;
    public final Object h;

    public o9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f21143f = mediaDataController;
        this.f21141c = z10;
        this.f21140b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f21142e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21139a) {
            case 0:
                ((MediaDataController) this.f21143f).lambda$processLoadedRecentDocuments$52(this.f21141c, this.f21140b, (ArrayList) this.h, this.d, this.f21142e);
                break;
            default:
                ((MessagesController) this.f21143f).lambda$processLoadedMessages$189(this.f21140b, (TLRPC.messages_Messages) this.h, this.f21141c, this.d, this.f21142e);
                break;
        }
    }

    public o9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f21143f = messagesController;
        this.f21140b = i10;
        this.h = messages_messages;
        this.f21141c = z10;
        this.d = z11;
        this.f21142e = i11;
    }
}
