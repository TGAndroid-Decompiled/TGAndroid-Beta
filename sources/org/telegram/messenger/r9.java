package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r9 implements Runnable {
    public final int f19849a = 0;
    public final int f19850b;
    public final boolean f19851c;
    public final boolean d;
    public final int f19852e;
    public final BaseController f19853f;
    public final Object h;

    public r9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList, boolean z10, int i11) {
        this.f19853f = mediaDataController;
        this.f19851c = z4;
        this.f19850b = i10;
        this.h = arrayList;
        this.d = z10;
        this.f19852e = i11;
    }

    @Override
    public final void run() {
        switch (this.f19849a) {
            case 0:
                boolean z4 = this.d;
                int i10 = this.f19852e;
                ((MediaDataController) this.f19853f).lambda$processLoadedRecentDocuments$52(this.f19851c, this.f19850b, (ArrayList) this.h, z4, i10);
                return;
            default:
                boolean z10 = this.d;
                int i11 = this.f19852e;
                ((MessagesController) this.f19853f).lambda$processLoadedMessages$189(this.f19850b, (TLRPC.messages_Messages) this.h, this.f19851c, z10, i11);
                return;
        }
    }

    public r9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z4, boolean z10, int i11) {
        this.f19853f = messagesController;
        this.f19850b = i10;
        this.h = messages_messages;
        this.f19851c = z4;
        this.d = z10;
        this.f19852e = i11;
    }
}
