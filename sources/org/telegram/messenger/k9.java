package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18374a = 0;
    public final int f18375b;
    public final boolean f18376c;
    public final boolean d;
    public final int f18377e;
    public final BaseController f18378f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18378f = mediaDataController;
        this.f18376c = z10;
        this.f18375b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18377e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18374a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18377e;
                ((MediaDataController) this.f18378f).lambda$processLoadedRecentDocuments$52(this.f18376c, this.f18375b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18377e;
                ((MessagesController) this.f18378f).lambda$processLoadedMessages$188(this.f18375b, (TLRPC.messages_Messages) this.h, this.f18376c, z11, i11);
                return;
        }
    }

    public k9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18378f = messagesController;
        this.f18375b = i10;
        this.h = messages_messages;
        this.f18376c = z10;
        this.d = z11;
        this.f18377e = i11;
    }
}
