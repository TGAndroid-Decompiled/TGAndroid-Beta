package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f17852a = 0;
    public final int f17853b;
    public final long f17854c;
    public final long d;
    public final int e;
    public final int f17855f;
    public final boolean h;
    public final BaseController f17856n;
    public final Object f17857r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f17856n = mediaDataController;
        this.f17853b = i10;
        this.f17857r = arrayList;
        this.h = z10;
        this.f17854c = j3;
        this.e = i11;
        this.f17855f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17852a) {
            case 0:
                int i10 = this.f17855f;
                long j3 = this.d;
                ((MediaDataController) this.f17856n).lambda$putMediaDatabase$140(this.f17853b, (ArrayList) this.f17857r, this.h, this.f17854c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f17855f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f17856n).lambda$putMessages$238(this.f17853b, (TLRPC.messages_Messages) this.f17857r, this.f17854c, this.d, this.e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f17856n = messagesStorage;
        this.f17853b = i10;
        this.f17857r = messages_messages;
        this.f17854c = j3;
        this.d = j10;
        this.e = i11;
        this.f17855f = i12;
        this.h = z10;
    }
}
