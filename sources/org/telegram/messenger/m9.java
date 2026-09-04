package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f18354a = 0;
    public final int f18355b;
    public final boolean f18356c;
    public final boolean d;
    public final int f18357e;
    public final BaseController f18358f;
    public final Object h;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18358f = mediaDataController;
        this.f18356c = z10;
        this.f18355b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18357e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18354a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18357e;
                ((MediaDataController) this.f18358f).lambda$processLoadedRecentDocuments$52(this.f18356c, this.f18355b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18357e;
                ((MessagesController) this.f18358f).lambda$processLoadedMessages$189(this.f18355b, (TLRPC.messages_Messages) this.h, this.f18356c, z11, i11);
                return;
        }
    }

    public m9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18358f = messagesController;
        this.f18355b = i10;
        this.h = messages_messages;
        this.f18356c = z10;
        this.d = z11;
        this.f18357e = i11;
    }
}
