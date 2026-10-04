package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18343a = 0;
    public final int f18344b;
    public final boolean f18345c;
    public final boolean d;
    public final int f18346e;
    public final BaseController f18347f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18347f = mediaDataController;
        this.f18345c = z10;
        this.f18344b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18346e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18343a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18346e;
                ((MediaDataController) this.f18347f).lambda$processLoadedRecentDocuments$52(this.f18345c, this.f18344b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18346e;
                ((MessagesController) this.f18347f).lambda$processLoadedMessages$189(this.f18344b, (TLRPC.messages_Messages) this.h, this.f18345c, z11, i11);
                return;
        }
    }

    public k9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18347f = messagesController;
        this.f18344b = i10;
        this.h = messages_messages;
        this.f18345c = z10;
        this.d = z11;
        this.f18346e = i11;
    }
}
