package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f17939a = 0;
    public final int f17940b;
    public final boolean f17941c;
    public final boolean d;
    public final int e;
    public final BaseController f17942f;
    public final Object h;

    public n9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f17942f = mediaDataController;
        this.f17941c = z10;
        this.f17940b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f17939a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f17942f).lambda$processLoadedRecentDocuments$52(this.f17941c, this.f17940b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f17942f).lambda$processLoadedMessages$188(this.f17940b, (TLRPC.messages_Messages) this.h, this.f17941c, z11, i11);
                return;
        }
    }

    public n9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f17942f = messagesController;
        this.f17940b = i10;
        this.h = messages_messages;
        this.f17941c = z10;
        this.d = z11;
        this.e = i11;
    }
}
