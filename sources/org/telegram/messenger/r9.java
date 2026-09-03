package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r9 implements Runnable {
    public final int f19851a = 0;
    public final int f19852b;
    public final boolean f19853c;
    public final boolean d;
    public final int f19854e;
    public final BaseController f19855f;
    public final Object h;

    public r9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList, boolean z10, int i11) {
        this.f19855f = mediaDataController;
        this.f19853c = z4;
        this.f19852b = i10;
        this.h = arrayList;
        this.d = z10;
        this.f19854e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19851a) {
            case 0:
                boolean z4 = this.d;
                int i10 = this.f19854e;
                ((MediaDataController) this.f19855f).lambda$processLoadedRecentDocuments$52(this.f19853c, this.f19852b, (ArrayList) this.h, z4, i10);
                return;
            default:
                boolean z10 = this.d;
                int i11 = this.f19854e;
                ((MessagesController) this.f19855f).lambda$processLoadedMessages$189(this.f19852b, (TLRPC.messages_Messages) this.h, this.f19853c, z10, i11);
                return;
        }
    }

    public r9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z4, boolean z10, int i11) {
        this.f19855f = messagesController;
        this.f19852b = i10;
        this.h = messages_messages;
        this.f19853c = z4;
        this.d = z10;
        this.f19854e = i11;
    }
}
