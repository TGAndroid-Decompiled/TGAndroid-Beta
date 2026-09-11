package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Runnable {
    public final int f18277a = 0;
    public final int f18278b;
    public final boolean f18279c;
    public final boolean d;
    public final int f18280e;
    public final BaseController f18281f;
    public final Object h;

    public l9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f18281f = mediaDataController;
        this.f18279c = z10;
        this.f18278b = i10;
        this.h = arrayList;
        this.d = z11;
        this.f18280e = i11;
    }

    @Override
    public final void run() {
        switch (this.f18277a) {
            case 0:
                boolean z10 = this.d;
                int i10 = this.f18280e;
                ((MediaDataController) this.f18281f).lambda$processLoadedRecentDocuments$52(this.f18279c, this.f18278b, (ArrayList) this.h, z10, i10);
                return;
            default:
                boolean z11 = this.d;
                int i11 = this.f18280e;
                ((MessagesController) this.f18281f).lambda$processLoadedMessages$189(this.f18278b, (TLRPC.messages_Messages) this.h, this.f18279c, z11, i11);
                return;
        }
    }

    public l9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f18281f = messagesController;
        this.f18278b = i10;
        this.h = messages_messages;
        this.f18279c = z10;
        this.d = z11;
        this.f18280e = i11;
    }
}
