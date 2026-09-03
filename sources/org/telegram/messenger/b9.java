package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f18244a = 0;
    public final int f18245b;
    public final long f18246c;
    public final long d;
    public final int f18247e;
    public final int f18248f;
    public final boolean h;
    public final BaseController f18249n;
    public final Object f18250r;

    public b9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z4, long j10, int i11, int i12, long j11) {
        this.f18249n = mediaDataController;
        this.f18245b = i10;
        this.f18250r = arrayList;
        this.h = z4;
        this.f18246c = j10;
        this.f18247e = i11;
        this.f18248f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18244a) {
            case 0:
                int i10 = this.f18248f;
                long j10 = this.d;
                ((MediaDataController) this.f18249n).lambda$putMediaDatabase$140(this.f18245b, (ArrayList) this.f18250r, this.h, this.f18246c, this.f18247e, i10, j10);
                return;
            default:
                int i11 = this.f18248f;
                boolean z4 = this.h;
                ((MessagesStorage) this.f18249n).lambda$putMessages$238(this.f18245b, (TLRPC.messages_Messages) this.f18250r, this.f18246c, this.d, this.f18247e, i11, z4);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z4) {
        this.f18249n = messagesStorage;
        this.f18245b = i10;
        this.f18250r = messages_messages;
        this.f18246c = j10;
        this.d = j11;
        this.f18247e = i11;
        this.f18248f = i12;
        this.h = z4;
    }
}
