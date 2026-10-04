package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18347a = 0;
    public final int f18348b;
    public final boolean f18349c;
    public final boolean d;
    public final int f18350e;
    public final BaseController f18351f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18351f = mediaDataController;
        this.f18349c = z10;
        this.f18348b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18350e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18347a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18350e;
                ((MediaDataController) this.f18351f).lambda$processLoadedRecentDocuments$52(this.f18349c, this.f18348b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18350e;
                ((MessagesController) this.f18351f).lambda$processLoadedMessages$189(this.f18348b, (TLRPC.messages_Messages) this.h, this.f18349c, z11, i11);
                return;
        }
    }

    public k9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18351f = messagesController;
        this.f18348b = i10;
        this.h = messages_messages;
        this.f18349c = z10;
        this.d = z11;
        this.f18350e = i11;
    }
}
