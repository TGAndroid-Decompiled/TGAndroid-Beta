package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Runnable {
    public final int f19184a = 0;
    public final int f19185b;
    public final boolean f19186c;
    public final boolean d;
    public final int e;
    public final BaseController f19187f;
    public final Object h;

    public o9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f19187f = mediaDataController;
        this.f19186c = z10;
        this.f19185b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19184a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f19187f).lambda$processLoadedRecentDocuments$52(this.f19186c, this.f19185b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f19187f).lambda$processLoadedMessages$188(this.f19185b, (TLRPC.messages_Messages) this.h, this.f19186c, z11, i11);
                return;
        }
    }

    public o9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f19187f = messagesController;
        this.f19185b = i10;
        this.h = messages_messages;
        this.f19186c = z10;
        this.d = z11;
        this.e = i11;
    }
}
