package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Runnable {
    public final int f19322a = 0;
    public final int f19323b;
    public final long f19324c;
    public final long d;
    public final int f19325e;
    public final int f19326f;
    public final boolean h;
    public final BaseController f19327n;
    public final Object f19328r;

    public u8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19327n = mediaDataController;
        this.f19323b = i10;
        this.f19328r = arrayList;
        this.h = z10;
        this.f19324c = j3;
        this.f19325e = i11;
        this.f19326f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19322a) {
            case 0:
                int i10 = this.f19326f;
                long j3 = this.d;
                ((MediaDataController) this.f19327n).lambda$putMediaDatabase$140(this.f19323b, (ArrayList) this.f19328r, this.h, this.f19324c, this.f19325e, i10, j3);
                return;
            default:
                int i11 = this.f19326f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19327n).lambda$putMessages$238(this.f19323b, (TLRPC.messages_Messages) this.f19328r, this.f19324c, this.d, this.f19325e, i11, z10);
                return;
        }
    }

    public u8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19327n = messagesStorage;
        this.f19323b = i10;
        this.f19328r = messages_messages;
        this.f19324c = j3;
        this.d = j10;
        this.f19325e = i11;
        this.f19326f = i12;
        this.h = z10;
    }
}
