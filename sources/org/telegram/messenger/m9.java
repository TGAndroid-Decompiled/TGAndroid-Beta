package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f16987a = 0;
    public final int f16988b;
    public final boolean f16989c;
    public final boolean d;
    public final int e;
    public final BaseController f16990f;
    public final Object h;

    public m9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f16990f = mediaDataController;
        this.f16989c = z10;
        this.f16988b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f16987a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f16990f).lambda$processLoadedRecentDocuments$52(this.f16989c, this.f16988b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f16990f).lambda$processLoadedMessages$189(this.f16988b, (TLRPC.messages_Messages) this.h, this.f16989c, z11, i11);
                return;
        }
    }

    public m9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f16990f = messagesController;
        this.f16988b = i10;
        this.h = messages_messages;
        this.f16989c = z10;
        this.d = z11;
        this.e = i11;
    }
}
