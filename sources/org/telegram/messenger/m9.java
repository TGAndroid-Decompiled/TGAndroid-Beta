package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f17002a = 0;
    public final int f17003b;
    public final boolean f17004c;
    public final boolean d;
    public final int e;
    public final BaseController f17005f;
    public final Object h;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f17005f = mediaDataController;
        this.f17004c = z10;
        this.f17003b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f17002a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f17005f).lambda$processLoadedRecentDocuments$52(this.f17004c, this.f17003b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f17005f).lambda$processLoadedMessages$189(this.f17003b, (TLRPC.messages_Messages) this.h, this.f17004c, z11, i11);
                return;
        }
    }

    public m9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f17005f = messagesController;
        this.f17003b = i10;
        this.h = messages_messages;
        this.f17004c = z10;
        this.d = z11;
        this.e = i11;
    }
}
