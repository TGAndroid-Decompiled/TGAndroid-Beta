package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q9 implements Runnable {
    public final int f21323a = 0;
    public final int f21324b;
    public final boolean f21325c;
    public final boolean d;
    public final int f21326e;
    public final BaseController f21327f;
    public final Object h;

    public q9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f21327f = mediaDataController;
        this.f21325c = z10;
        this.f21324b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f21326e = i11;
    }

    @Override
    public final void run() {
        switch (this.f21323a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f21326e;
                ((MediaDataController) this.f21327f).lambda$processLoadedRecentDocuments$52(this.f21325c, this.f21324b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f21326e;
                ((MessagesController) this.f21327f).lambda$processLoadedMessages$189(this.f21324b, (TLRPC.messages_Messages) this.h, this.f21325c, z11, i11);
                return;
        }
    }

    public q9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f21327f = messagesController;
        this.f21324b = i10;
        this.h = messages_messages;
        this.f21325c = z10;
        this.d = z11;
        this.f21326e = i11;
    }
}
