package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Runnable {
    public final int f18768a = 0;
    public final int f18769b;
    public final boolean f18770c;
    public final boolean d;
    public final int e;
    public final BaseController f18771f;
    public final Object h;

    public k9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18771f = mediaDataController;
        this.f18770c = z10;
        this.f18769b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18768a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f18771f).lambda$processLoadedRecentDocuments$52(this.f18770c, this.f18769b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f18771f).lambda$processLoadedMessages$188(this.f18769b, (TLRPC.messages_Messages) this.h, this.f18770c, z11, i11);
                return;
        }
    }

    public k9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18771f = messagesController;
        this.f18769b = i10;
        this.h = messages_messages;
        this.f18770c = z10;
        this.d = z11;
        this.e = i11;
    }
}
