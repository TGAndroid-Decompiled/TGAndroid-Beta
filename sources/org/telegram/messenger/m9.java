package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f18942a = 0;
    public final int f18943b;
    public final boolean f18944c;
    public final boolean d;
    public final int e;
    public final BaseController f18945f;
    public final Object h;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18945f = mediaDataController;
        this.f18944c = z10;
        this.f18943b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18942a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f18945f).lambda$processLoadedRecentDocuments$52(this.f18944c, this.f18943b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f18945f).lambda$processLoadedMessages$188(this.f18943b, (TLRPC.messages_Messages) this.h, this.f18944c, z11, i11);
                return;
        }
    }

    public m9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18945f = messagesController;
        this.f18943b = i10;
        this.h = messages_messages;
        this.f18944c = z10;
        this.d = z11;
        this.e = i11;
    }
}
