package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q9 implements Runnable {
    public final int f21017a = 0;
    public final int f21018b;
    public final boolean f21019c;
    public final boolean d;
    public final int e;
    public final BaseController f21020f;
    public final Object h;

    public q9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f21020f = mediaDataController;
        this.f21019c = z10;
        this.f21018b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21017a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f21020f).lambda$processLoadedRecentDocuments$52(this.f21019c, this.f21018b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f21020f).lambda$processLoadedMessages$188(this.f21018b, (TLRPC.messages_Messages) this.h, this.f21019c, z11, i11);
                return;
        }
    }

    public q9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f21020f = messagesController;
        this.f21018b = i10;
        this.h = messages_messages;
        this.f21019c = z10;
        this.d = z11;
        this.e = i11;
    }
}
