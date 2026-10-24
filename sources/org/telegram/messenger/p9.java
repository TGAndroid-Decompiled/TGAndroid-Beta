package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p9 implements Runnable {
    public final int f19253a = 0;
    public final int f19254b;
    public final boolean f19255c;
    public final boolean d;
    public final int e;
    public final BaseController f19256f;
    public final Object h;

    public p9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f19256f = mediaDataController;
        this.f19255c = z10;
        this.f19254b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19253a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f19256f).lambda$processLoadedRecentDocuments$52(this.f19255c, this.f19254b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f19256f).lambda$processLoadedMessages$188(this.f19254b, (TLRPC.messages_Messages) this.h, this.f19255c, z11, i11);
                return;
        }
    }

    public p9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f19256f = messagesController;
        this.f19254b = i10;
        this.h = messages_messages;
        this.f19255c = z10;
        this.d = z11;
        this.e = i11;
    }
}
