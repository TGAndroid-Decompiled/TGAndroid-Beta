package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f17842a = 0;
    public final int f17843b;
    public final long f17844c;
    public final long d;
    public final int e;
    public final int f17845f;
    public final boolean h;
    public final BaseController f17846n;
    public final Object f17847r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f17846n = mediaDataController;
        this.f17843b = i10;
        this.f17847r = arrayList;
        this.h = z10;
        this.f17844c = j3;
        this.e = i11;
        this.f17845f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17842a) {
            case 0:
                int i10 = this.f17845f;
                long j3 = this.d;
                ((MediaDataController) this.f17846n).lambda$putMediaDatabase$140(this.f17843b, (ArrayList) this.f17847r, this.h, this.f17844c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f17845f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f17846n).lambda$putMessages$238(this.f17843b, (TLRPC.messages_Messages) this.f17847r, this.f17844c, this.d, this.e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f17846n = messagesStorage;
        this.f17843b = i10;
        this.f17847r = messages_messages;
        this.f17844c = j3;
        this.d = j10;
        this.e = i11;
        this.f17845f = i12;
        this.h = z10;
    }
}
