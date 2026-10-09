package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19318a = 0;
    public final int f19319b;
    public final long f19320c;
    public final long d;
    public final int f19321e;
    public final int f19322f;
    public final boolean h;
    public final BaseController f19323n;
    public final Object f19324r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19323n = mediaDataController;
        this.f19319b = i10;
        this.f19324r = arrayList;
        this.h = z10;
        this.f19320c = j3;
        this.f19321e = i11;
        this.f19322f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19318a) {
            case 0:
                int i10 = this.f19322f;
                long j3 = this.d;
                ((MediaDataController) this.f19323n).lambda$putMediaDatabase$140(this.f19319b, (ArrayList) this.f19324r, this.h, this.f19320c, this.f19321e, i10, j3);
                return;
            default:
                int i11 = this.f19322f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19323n).lambda$putMessages$238(this.f19319b, (TLRPC.messages_Messages) this.f19324r, this.f19320c, this.d, this.f19321e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19323n = messagesStorage;
        this.f19319b = i10;
        this.f19324r = messages_messages;
        this.f19320c = j3;
        this.d = j10;
        this.f19321e = i11;
        this.f19322f = i12;
        this.h = z10;
    }
}
