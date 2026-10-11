package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19320a = 0;
    public final int f19321b;
    public final long f19322c;
    public final long d;
    public final int f19323e;
    public final int f19324f;
    public final boolean h;
    public final BaseController f19325n;
    public final Object f19326r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19325n = mediaDataController;
        this.f19321b = i10;
        this.f19326r = arrayList;
        this.h = z10;
        this.f19322c = j3;
        this.f19323e = i11;
        this.f19324f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19320a) {
            case 0:
                int i10 = this.f19324f;
                long j3 = this.d;
                ((MediaDataController) this.f19325n).lambda$putMediaDatabase$140(this.f19321b, (ArrayList) this.f19326r, this.h, this.f19322c, this.f19323e, i10, j3);
                return;
            default:
                int i11 = this.f19324f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19325n).lambda$putMessages$238(this.f19321b, (TLRPC.messages_Messages) this.f19326r, this.f19322c, this.d, this.f19323e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19325n = messagesStorage;
        this.f19321b = i10;
        this.f19326r = messages_messages;
        this.f19322c = j3;
        this.d = j10;
        this.f19323e = i11;
        this.f19324f = i12;
        this.h = z10;
    }
}
