package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19961a = 0;
    public final int f19962b;
    public final long f19963c;
    public final long d;
    public final int e;
    public final int f19964f;
    public final boolean h;
    public final BaseController f19965n;
    public final Object f19966r;

    public w8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19965n = mediaDataController;
        this.f19962b = i10;
        this.f19966r = arrayList;
        this.h = z10;
        this.f19963c = j10;
        this.e = i11;
        this.f19964f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19961a) {
            case 0:
                int i10 = this.f19964f;
                long j10 = this.d;
                ((MediaDataController) this.f19965n).lambda$putMediaDatabase$140(this.f19962b, (ArrayList) this.f19966r, this.h, this.f19963c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f19964f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19965n).lambda$putMessages$238(this.f19962b, (TLRPC.messages_Messages) this.f19966r, this.f19963c, this.d, this.e, i11, z10);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19965n = messagesStorage;
        this.f19962b = i10;
        this.f19966r = messages_messages;
        this.f19963c = j10;
        this.d = j11;
        this.e = i11;
        this.f19964f = i12;
        this.h = z10;
    }
}
