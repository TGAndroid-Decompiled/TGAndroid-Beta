package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f18946a = 0;
    public final int f18947b;
    public final boolean f18948c;
    public final boolean d;
    public final int e;
    public final BaseController f18949f;
    public final Object h;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18949f = mediaDataController;
        this.f18948c = z10;
        this.f18947b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18946a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f18949f).lambda$processLoadedRecentDocuments$52(this.f18948c, this.f18947b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f18949f).lambda$processLoadedMessages$188(this.f18947b, (TLRPC.messages_Messages) this.h, this.f18948c, z11, i11);
                return;
        }
    }

    public m9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18949f = messagesController;
        this.f18947b = i10;
        this.h = messages_messages;
        this.f18948c = z10;
        this.d = z11;
        this.e = i11;
    }
}
