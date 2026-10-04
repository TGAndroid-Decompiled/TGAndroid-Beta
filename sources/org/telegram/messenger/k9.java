package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18348a = 0;
    public final int f18349b;
    public final boolean f18350c;
    public final boolean d;
    public final int f18351e;
    public final BaseController f18352f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18352f = mediaDataController;
        this.f18350c = z10;
        this.f18349b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18351e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18351e;
                ((MediaDataController) this.f18352f).lambda$processLoadedRecentDocuments$52(this.f18350c, this.f18349b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18351e;
                ((MessagesController) this.f18352f).lambda$processLoadedMessages$189(this.f18349b, (TLRPC.messages_Messages) this.h, this.f18350c, z11, i11);
                return;
        }
    }

    public k9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18352f = messagesController;
        this.f18349b = i10;
        this.h = messages_messages;
        this.f18350c = z10;
        this.d = z11;
        this.f18351e = i11;
    }
}
