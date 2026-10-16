package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f18699a = 0;
    public final int f18700b;
    public final long f18701c;
    public final long d;
    public final int e;
    public final int f18702f;
    public final boolean h;
    public final BaseController f18703n;
    public final Object f18704r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f18703n = mediaDataController;
        this.f18700b = i10;
        this.f18704r = arrayList;
        this.h = z10;
        this.f18701c = j10;
        this.e = i11;
        this.f18702f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18699a) {
            case 0:
                int i10 = this.f18702f;
                long j10 = this.d;
                ((MediaDataController) this.f18703n).lambda$putMediaDatabase$140(this.f18700b, (ArrayList) this.f18704r, this.h, this.f18701c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f18702f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f18703n).lambda$putMessages$238(this.f18700b, (TLRPC.messages_Messages) this.f18704r, this.f18701c, this.d, this.e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f18703n = messagesStorage;
        this.f18700b = i10;
        this.f18704r = messages_messages;
        this.f18701c = j10;
        this.d = j11;
        this.e = i11;
        this.f18702f = i12;
        this.h = z10;
    }
}
