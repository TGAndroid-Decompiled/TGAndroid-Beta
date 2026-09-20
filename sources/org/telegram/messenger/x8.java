package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f18073a = 0;
    public final int f18074b;
    public final long f18075c;
    public final long d;
    public final int e;
    public final int f18076f;
    public final boolean h;
    public final BaseController f18077n;
    public final Object f18078r;

    public x8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f18077n = mediaDataController;
        this.f18074b = i10;
        this.f18078r = arrayList;
        this.h = z10;
        this.f18075c = j3;
        this.e = i11;
        this.f18076f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18073a) {
            case 0:
                int i10 = this.f18076f;
                long j3 = this.d;
                ((MediaDataController) this.f18077n).lambda$putMediaDatabase$140(this.f18074b, (ArrayList) this.f18078r, this.h, this.f18075c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f18076f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f18077n).lambda$putMessages$238(this.f18074b, (TLRPC.messages_Messages) this.f18078r, this.f18075c, this.d, this.e, i11, z10);
                return;
        }
    }

    public x8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f18077n = messagesStorage;
        this.f18074b = i10;
        this.f18078r = messages_messages;
        this.f18075c = j3;
        this.d = j10;
        this.e = i11;
        this.f18076f = i12;
        this.h = z10;
    }
}
