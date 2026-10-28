package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r9 implements Runnable {
    public final int f21098a = 0;
    public final int f21099b;
    public final boolean f21100c;
    public final boolean d;
    public final int e;
    public final BaseController f21101f;
    public final Object h;

    public r9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f21101f = mediaDataController;
        this.f21100c = z10;
        this.f21099b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21098a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f21101f).lambda$processLoadedRecentDocuments$52(this.f21100c, this.f21099b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f21101f).lambda$processLoadedMessages$188(this.f21099b, (TLRPC.messages_Messages) this.h, this.f21100c, z11, i11);
                return;
        }
    }

    public r9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f21101f = messagesController;
        this.f21099b = i10;
        this.h = messages_messages;
        this.f21100c = z10;
        this.d = z11;
        this.e = i11;
    }
}
