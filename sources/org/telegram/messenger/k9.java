package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f16813a = 0;
    public final int f16814b;
    public final boolean f16815c;
    public final boolean d;
    public final int e;
    public final BaseController f16816f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f16816f = mediaDataController;
        this.f16815c = z10;
        this.f16814b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f16813a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f16816f).lambda$processLoadedRecentDocuments$52(this.f16815c, this.f16814b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f16816f).lambda$processLoadedMessages$189(this.f16814b, (TLRPC.messages_Messages) this.h, this.f16815c, z11, i11);
                return;
        }
    }

    public k9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f16816f = messagesController;
        this.f16814b = i10;
        this.h = messages_messages;
        this.f16815c = z10;
        this.d = z11;
        this.e = i11;
    }
}
