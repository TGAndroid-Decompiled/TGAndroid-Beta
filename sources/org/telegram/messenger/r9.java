package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r9 implements Runnable {
    public final int f18258a = 0;
    public final int f18259b;
    public final boolean f18260c;
    public final boolean d;
    public final int e;
    public final BaseController f18261f;
    public final Object h;

    public r9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList, boolean z10, int i11) {
        this.f18261f = mediaDataController;
        this.f18260c = z4;
        this.f18259b = i10;
        this.h = arrayList;
        this.d = z10;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18258a) {
            case 0:
                boolean z4 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f18261f).lambda$processLoadedRecentDocuments$52(this.f18260c, this.f18259b, (ArrayList) this.h, z4, i10);
                return;
            default:
                boolean z10 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f18261f).lambda$processLoadedMessages$189(this.f18259b, (TLRPC.messages_Messages) this.h, this.f18260c, z10, i11);
                return;
        }
    }

    public r9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z4, boolean z10, int i11) {
        this.f18261f = messagesController;
        this.f18259b = i10;
        this.h = messages_messages;
        this.f18260c = z4;
        this.d = z10;
        this.e = i11;
    }
}
