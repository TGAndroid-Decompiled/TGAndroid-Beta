package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f19716a = 0;
    public final int f19717b;
    public final long f19718c;
    public final long d;
    public final int e;
    public final int f19719f;
    public final boolean h;
    public final BaseController f19720n;
    public final Object f19721r;

    public v8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f19720n = mediaDataController;
        this.f19717b = i10;
        this.f19721r = arrayList;
        this.h = z10;
        this.f19718c = j10;
        this.e = i11;
        this.f19719f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19716a) {
            case 0:
                int i10 = this.f19719f;
                long j10 = this.d;
                ((MediaDataController) this.f19720n).lambda$putMediaDatabase$140(this.f19717b, (ArrayList) this.f19721r, this.h, this.f19718c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f19719f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19720n).lambda$putMessages$238(this.f19717b, (TLRPC.messages_Messages) this.f19721r, this.f19718c, this.d, this.e, i11, z10);
                return;
        }
    }

    public v8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f19720n = messagesStorage;
        this.f19717b = i10;
        this.f19721r = messages_messages;
        this.f19718c = j10;
        this.d = j11;
        this.e = i11;
        this.f19719f = i12;
        this.h = z10;
    }
}
