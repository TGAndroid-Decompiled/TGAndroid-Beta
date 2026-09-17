package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Runnable {
    public final int f18304a = 0;
    public final int f18305b;
    public final boolean f18306c;
    public final boolean d;
    public final int f18307e;
    public final BaseController f18308f;
    public final Object h;

    public l9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18308f = mediaDataController;
        this.f18306c = z10;
        this.f18305b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18307e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18304a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18307e;
                ((MediaDataController) this.f18308f).lambda$processLoadedRecentDocuments$52(this.f18306c, this.f18305b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18307e;
                ((MessagesController) this.f18308f).lambda$processLoadedMessages$189(this.f18305b, (TLRPC.messages_Messages) this.h, this.f18306c, z11, i11);
                return;
        }
    }

    public l9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18308f = messagesController;
        this.f18305b = i10;
        this.h = messages_messages;
        this.f18306c = z10;
        this.d = z11;
        this.f18307e = i11;
    }
}
