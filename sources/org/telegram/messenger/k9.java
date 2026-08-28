package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f20765a = 0;
    public final int f20766b;
    public final boolean f20767c;
    public final boolean d;
    public final int f20768e;
    public final BaseController f20769f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i9, ArrayList arrayList, boolean z11, int i10) {
        this.f20769f = mediaDataController;
        this.f20767c = z10;
        this.f20766b = i9;
        this.h = arrayList;
        this.d = z11;
        this.f20768e = i10;
    }

    @Override
    public final void run() {
        switch (this.f20765a) {
            case 0:
                boolean z10 = this.d;
                int i9 = this.f20768e;
                ((MediaDataController) this.f20769f).lambda$processLoadedRecentDocuments$52(this.f20767c, this.f20766b, (ArrayList) this.h, z10, i9);
                return;
            default:
                boolean z11 = this.d;
                int i10 = this.f20768e;
                ((MessagesController) this.f20769f).lambda$processLoadedMessages$189(this.f20766b, (TLRPC.messages_Messages) this.h, this.f20767c, z11, i10);
                return;
        }
    }

    public k9(MessagesController messagesController, int i9, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i10) {
        this.f20769f = messagesController;
        this.f20766b = i9;
        this.h = messages_messages;
        this.f20767c = z10;
        this.d = z11;
        this.f20768e = i10;
    }
}
