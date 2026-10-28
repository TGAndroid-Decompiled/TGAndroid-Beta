package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f20701a;
    public final SendMessagesHelper f20702b;
    public final ArrayList f20703c;
    public final int d;
    public final int e;
    public final TLRPC.Message f20704f;
    public final int h;
    public final TLRPC.Message f20705n;
    public final MessageObject f20706r;
    public final int f20707s;

    public mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f20701a = i14;
        this.f20702b = sendMessagesHelper;
        this.f20703c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f20704f = message;
        this.h = i12;
        this.f20705n = message2;
        this.f20706r = messageObject;
        this.f20707s = i13;
    }

    @Override
    public final void run() {
        switch (this.f20701a) {
            case 0:
                this.f20702b.lambda$sendMessage$12(this.f20703c, this.d, this.e, this.f20704f, this.h, this.f20705n, this.f20706r, this.f20707s);
                return;
            default:
                this.f20702b.lambda$sendMessage$13(this.f20703c, this.d, this.e, this.f20704f, this.h, this.f20705n, this.f20706r, this.f20707s);
                return;
        }
    }
}
