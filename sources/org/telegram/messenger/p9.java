package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p9 implements Runnable {
    public final int f19186a = 0;
    public final int f19187b;
    public final boolean f19188c;
    public final boolean d;
    public final int e;
    public final BaseController f19189f;
    public final Object h;

    public p9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f19189f = mediaDataController;
        this.f19188c = z10;
        this.f19187b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19186a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f19189f).lambda$processLoadedRecentDocuments$52(this.f19188c, this.f19187b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f19189f).lambda$processLoadedMessages$188(this.f19187b, (TLRPC.messages_Messages) this.h, this.f19188c, z11, i11);
                return;
        }
    }

    public p9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f19189f = messagesController;
        this.f19187b = i10;
        this.h = messages_messages;
        this.f19188c = z10;
        this.d = z11;
        this.e = i11;
    }
}
