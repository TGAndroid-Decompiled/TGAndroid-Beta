package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b9 implements Runnable {
    public final int f16831a = 0;
    public final int f16832b;
    public final long f16833c;
    public final long d;
    public final int e;
    public final int f16834f;
    public final boolean h;
    public final BaseController f16835n;
    public final Object f16836r;

    public b9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z4, long j10, int i11, int i12, long j11) {
        this.f16835n = mediaDataController;
        this.f16832b = i10;
        this.f16836r = arrayList;
        this.h = z4;
        this.f16833c = j10;
        this.e = i11;
        this.f16834f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f16831a) {
            case 0:
                int i10 = this.f16834f;
                long j10 = this.d;
                ((MediaDataController) this.f16835n).lambda$putMediaDatabase$140(this.f16832b, (ArrayList) this.f16836r, this.h, this.f16833c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f16834f;
                boolean z4 = this.h;
                ((MessagesStorage) this.f16835n).lambda$putMessages$238(this.f16832b, (TLRPC.messages_Messages) this.f16836r, this.f16833c, this.d, this.e, i11, z4);
                return;
        }
    }

    public b9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z4) {
        this.f16835n = messagesStorage;
        this.f16832b = i10;
        this.f16836r = messages_messages;
        this.f16833c = j10;
        this.d = j11;
        this.e = i11;
        this.f16834f = i12;
        this.h = z4;
    }
}
