package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t9 implements Runnable {
    public final int f16389a = 0;
    public final int f16390b;
    public final boolean f16391c;
    public final boolean d;
    public final int e;
    public final BaseController f16392f;
    public final Object h;

    public t9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f16392f = mediaDataController;
        this.f16391c = z10;
        this.f16390b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f16389a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f16392f).lambda$processLoadedRecentDocuments$52(this.f16391c, this.f16390b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f16392f).lambda$processLoadedMessages$189(this.f16390b, (TLRPC.messages_Messages) this.h, this.f16391c, z11, i11);
                return;
        }
    }

    public t9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f16392f = messagesController;
        this.f16390b = i10;
        this.h = messages_messages;
        this.f16391c = z10;
        this.d = z11;
        this.e = i11;
    }
}
