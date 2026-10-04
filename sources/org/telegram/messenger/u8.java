package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19316a = 0;
    public final int f19317b;
    public final long f19318c;
    public final long d;
    public final int f19319e;
    public final int f19320f;
    public final boolean h;
    public final BaseController f19321n;
    public final Object f19322r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19321n = mediaDataController;
        this.f19317b = i10;
        this.f19322r = arrayList;
        this.h = z10;
        this.f19318c = j3;
        this.f19319e = i11;
        this.f19320f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19316a) {
            case 0:
                int i10 = this.f19320f;
                long j3 = this.d;
                ((MediaDataController) this.f19321n).lambda$putMediaDatabase$140(this.f19317b, (ArrayList) this.f19322r, this.h, this.f19318c, this.f19319e, i10, j3);
                return;
            default:
                int i11 = this.f19320f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19321n).lambda$putMessages$238(this.f19317b, (TLRPC.messages_Messages) this.f19322r, this.f19318c, this.d, this.f19319e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19321n = messagesStorage;
        this.f19317b = i10;
        this.f19322r = messages_messages;
        this.f19318c = j3;
        this.d = j10;
        this.f19319e = i11;
        this.f19320f = i12;
        this.h = z10;
    }
}
