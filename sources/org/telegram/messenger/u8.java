package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19356a = 0;
    public final int f19357b;
    public final long f19358c;
    public final long d;
    public final int f19359e;
    public final int f19360f;
    public final boolean h;
    public final BaseController f19361n;
    public final Object f19362r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19361n = mediaDataController;
        this.f19357b = i10;
        this.f19362r = arrayList;
        this.h = z10;
        this.f19358c = j3;
        this.f19359e = i11;
        this.f19360f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19356a) {
            case 0:
                int i10 = this.f19360f;
                long j3 = this.d;
                ((MediaDataController) this.f19361n).lambda$putMediaDatabase$140(this.f19357b, (ArrayList) this.f19362r, this.h, this.f19358c, this.f19359e, i10, j3);
                return;
            default:
                int i11 = this.f19360f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19361n).lambda$putMessages$238(this.f19357b, (TLRPC.messages_Messages) this.f19362r, this.f19358c, this.d, this.f19359e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19361n = messagesStorage;
        this.f19357b = i10;
        this.f19362r = messages_messages;
        this.f19358c = j3;
        this.d = j10;
        this.f19359e = i11;
        this.f19360f = i12;
        this.h = z10;
    }
}
