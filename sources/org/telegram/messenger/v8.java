package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f21739a = 0;
    public final int f21740b;
    public final long f21741c;
    public final long d;
    public final int f21742e;
    public final int f21743f;
    public final boolean h;
    public final BaseController f21744n;
    public final Object f21745r;

    public v8(MediaDataController mediaDataController, int i9, ArrayList arrayList, boolean z10, long j10, int i10, int i11, long j11) {
        this.f21744n = mediaDataController;
        this.f21740b = i9;
        this.f21745r = arrayList;
        this.h = z10;
        this.f21741c = j10;
        this.f21742e = i10;
        this.f21743f = i11;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f21739a) {
            case 0:
                int i9 = this.f21743f;
                long j10 = this.d;
                ((MediaDataController) this.f21744n).lambda$putMediaDatabase$140(this.f21740b, (ArrayList) this.f21745r, this.h, this.f21741c, this.f21742e, i9, j10);
                return;
            default:
                int i10 = this.f21743f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f21744n).lambda$putMessages$238(this.f21740b, (TLRPC.messages_Messages) this.f21745r, this.f21741c, this.d, this.f21742e, i10, z10);
                return;
        }
    }

    public v8(MessagesStorage messagesStorage, int i9, TLRPC.messages_Messages messages_messages, long j10, long j11, int i10, int i11, boolean z10) {
        this.f21744n = messagesStorage;
        this.f21740b = i9;
        this.f21745r = messages_messages;
        this.f21741c = j10;
        this.d = j11;
        this.f21742e = i10;
        this.f21743f = i11;
        this.h = z10;
    }
}
