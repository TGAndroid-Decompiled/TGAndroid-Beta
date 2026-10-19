package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Runnable {
    public final int f18859a = 0;
    public final int f18860b;
    public final boolean f18861c;
    public final boolean d;
    public final int e;
    public final BaseController f18862f;
    public final Object h;

    public l9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18862f = mediaDataController;
        this.f18861c = z10;
        this.f18860b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18859a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.e;
                ((MediaDataController) this.f18862f).lambda$processLoadedRecentDocuments$52(this.f18861c, this.f18860b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.e;
                ((MessagesController) this.f18862f).lambda$processLoadedMessages$188(this.f18860b, (TLRPC.messages_Messages) this.h, this.f18861c, z11, i11);
                return;
        }
    }

    public l9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18862f = messagesController;
        this.f18860b = i10;
        this.h = messages_messages;
        this.f18861c = z10;
        this.d = z11;
        this.e = i11;
    }
}
