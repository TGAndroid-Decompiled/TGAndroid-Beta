package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f18367a = 0;
    public final int f18368b;
    public final boolean f18369c;
    public final boolean d;
    public final int f18370e;
    public final BaseController f18371f;
    public final Object h;

    public n9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18371f = mediaDataController;
        this.f18369c = z10;
        this.f18368b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18370e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18367a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18370e;
                ((MediaDataController) this.f18371f).lambda$processLoadedRecentDocuments$52(this.f18369c, this.f18368b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18370e;
                ((MessagesController) this.f18371f).lambda$processLoadedMessages$188(this.f18368b, (TLRPC.messages_Messages) this.h, this.f18369c, z11, i11);
                return;
        }
    }

    public n9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18371f = messagesController;
        this.f18368b = i10;
        this.h = messages_messages;
        this.f18369c = z10;
        this.d = z11;
        this.f18370e = i11;
    }
}
