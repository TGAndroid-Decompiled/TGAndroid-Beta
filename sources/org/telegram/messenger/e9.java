package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f15068a = 0;
    public final int f15069b;
    public final long f15070c;
    public final long d;
    public final int e;
    public final int f15071f;
    public final boolean h;
    public final BaseController f15072n;
    public final Object f15073r;

    public e9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f15072n = mediaDataController;
        this.f15069b = i10;
        this.f15073r = arrayList;
        this.h = z10;
        this.f15070c = j3;
        this.e = i11;
        this.f15071f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15068a) {
            case 0:
                int i10 = this.f15071f;
                long j3 = this.d;
                ((MediaDataController) this.f15072n).lambda$putMediaDatabase$140(this.f15069b, (ArrayList) this.f15073r, this.h, this.f15070c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f15071f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f15072n).lambda$putMessages$238(this.f15069b, (TLRPC.messages_Messages) this.f15073r, this.f15070c, this.d, this.e, i11, z10);
                return;
        }
    }

    public e9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f15072n = messagesStorage;
        this.f15069b = i10;
        this.f15073r = messages_messages;
        this.f15070c = j3;
        this.d = j10;
        this.e = i11;
        this.f15071f = i12;
        this.h = z10;
    }
}
