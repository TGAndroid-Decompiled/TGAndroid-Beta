package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Runnable {
    public final int f19118a = 0;
    public final int f19119b;
    public final boolean f19120c;
    public final boolean d;
    public final int e;
    public final BaseController f19121f;
    public final Object h;

    public o9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f19121f = mediaDataController;
        this.f19120c = z10;
        this.f19119b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f19121f).lambda$processLoadedRecentDocuments$52(this.f19120c, this.f19119b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f19121f).lambda$processLoadedMessages$188(this.f19119b, (TLRPC.messages_Messages) this.h, this.f19120c, z11, i11);
                return;
        }
    }

    public o9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f19121f = messagesController;
        this.f19119b = i10;
        this.h = messages_messages;
        this.f19120c = z10;
        this.d = z11;
        this.e = i11;
    }
}
