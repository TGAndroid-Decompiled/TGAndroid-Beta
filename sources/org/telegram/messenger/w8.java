package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f19491a = 0;
    public final int f19492b;
    public final long f19493c;
    public final long d;
    public final int f19494e;
    public final int f19495f;
    public final boolean h;
    public final BaseController f19496n;
    public final Object f19497r;

    public w8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f19496n = mediaDataController;
        this.f19492b = i10;
        this.f19497r = arrayList;
        this.h = z10;
        this.f19493c = j3;
        this.f19494e = i11;
        this.f19495f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19491a) {
            case 0:
                int i10 = this.f19495f;
                long j3 = this.d;
                ((MediaDataController) this.f19496n).lambda$putMediaDatabase$140(this.f19492b, (ArrayList) this.f19497r, this.h, this.f19493c, this.f19494e, i10, j3);
                return;
            default:
                int i11 = this.f19495f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f19496n).lambda$putMessages$238(this.f19492b, (TLRPC.messages_Messages) this.f19497r, this.f19493c, this.d, this.f19494e, i11, z10);
                return;
        }
    }

    public w8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f19496n = messagesStorage;
        this.f19492b = i10;
        this.f19497r = messages_messages;
        this.f19493c = j3;
        this.d = j10;
        this.f19494e = i11;
        this.f19495f = i12;
        this.h = z10;
    }
}
