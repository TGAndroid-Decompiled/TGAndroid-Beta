package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f18242a = 0;
    public final int f18243b;
    public final long f18244c;
    public final long d;
    public final int f18245e;
    public final int f18246f;
    public final boolean h;
    public final BaseController f18247n;
    public final Object f18248r;

    public b9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z4, long j10, int i11, int i12, long j11) {
        this.f18247n = mediaDataController;
        this.f18243b = i10;
        this.f18248r = arrayList;
        this.h = z4;
        this.f18244c = j10;
        this.f18245e = i11;
        this.f18246f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18242a) {
            case 0:
                int i10 = this.f18246f;
                long j10 = this.d;
                ((MediaDataController) this.f18247n).lambda$putMediaDatabase$140(this.f18243b, (ArrayList) this.f18248r, this.h, this.f18244c, this.f18245e, i10, j10);
                return;
            default:
                int i11 = this.f18246f;
                boolean z4 = this.h;
                ((MessagesStorage) this.f18247n).lambda$putMessages$238(this.f18243b, (TLRPC.messages_Messages) this.f18248r, this.f18244c, this.d, this.f18245e, i11, z4);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z4) {
        this.f18247n = messagesStorage;
        this.f18243b = i10;
        this.f18248r = messages_messages;
        this.f18244c = j10;
        this.d = j11;
        this.f18245e = i11;
        this.f18246f = i12;
        this.h = z4;
    }
}
