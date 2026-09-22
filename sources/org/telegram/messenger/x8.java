package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f18088a = 0;
    public final int f18089b;
    public final long f18090c;
    public final long d;
    public final int e;
    public final int f18091f;
    public final boolean h;
    public final BaseController f18092n;
    public final Object f18093r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f18092n = mediaDataController;
        this.f18089b = i10;
        this.f18093r = arrayList;
        this.h = z10;
        this.f18090c = j3;
        this.e = i11;
        this.f18091f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18088a) {
            case 0:
                int i10 = this.f18091f;
                long j3 = this.d;
                ((MediaDataController) this.f18092n).lambda$putMediaDatabase$140(this.f18089b, (ArrayList) this.f18093r, this.h, this.f18090c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f18091f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f18092n).lambda$putMessages$238(this.f18089b, (TLRPC.messages_Messages) this.f18093r, this.f18090c, this.d, this.e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f18092n = messagesStorage;
        this.f18089b = i10;
        this.f18093r = messages_messages;
        this.f18090c = j3;
        this.d = j10;
        this.e = i11;
        this.f18091f = i12;
        this.h = z10;
    }
}
