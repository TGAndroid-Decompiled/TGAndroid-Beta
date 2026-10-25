package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f20605a;
    public final SendMessagesHelper f20606b;
    public final ArrayList f20607c;
    public final int d;
    public final int e;
    public final TLRPC.Message f20608f;
    public final int h;
    public final TLRPC.Message f20609n;
    public final MessageObject f20610r;
    public final int f20611s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f20605a = i14;
        this.f20606b = sendMessagesHelper;
        this.f20607c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f20608f = message;
        this.h = i12;
        this.f20609n = message2;
        this.f20610r = messageObject;
        this.f20611s = i13;
    }

    @Override
    public final void run() {
        switch (this.f20605a) {
            case 0:
                this.f20606b.lambda$sendMessage$12(this.f20607c, this.d, this.e, this.f20608f, this.h, this.f20609n, this.f20610r, this.f20611s);
                return;
            default:
                this.f20606b.lambda$sendMessage$13(this.f20607c, this.d, this.e, this.f20608f, this.h, this.f20609n, this.f20610r, this.f20611s);
                return;
        }
    }
}
