package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f18381a = 0;
    public final int f18382b;
    public final boolean f18383c;
    public final boolean d;
    public final int f18384e;
    public final BaseController f18385f;
    public final Object h;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18385f = mediaDataController;
        this.f18383c = z10;
        this.f18382b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18384e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18381a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18384e;
                ((MediaDataController) this.f18385f).lambda$processLoadedRecentDocuments$52(this.f18383c, this.f18382b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18384e;
                ((MessagesController) this.f18385f).lambda$processLoadedMessages$189(this.f18382b, (TLRPC.messages_Messages) this.h, this.f18383c, z11, i11);
                return;
        }
    }

    public m9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18385f = messagesController;
        this.f18382b = i10;
        this.h = messages_messages;
        this.f18383c = z10;
        this.d = z11;
        this.f18384e = i11;
    }
}
