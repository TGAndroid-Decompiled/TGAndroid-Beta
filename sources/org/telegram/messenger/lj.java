package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f20878a;
    public final SendMessagesHelper f20879b;
    public final ArrayList f20880c;
    public final int d;
    public final int f20881e;
    public final TLRPC.Message f20882f;
    public final int h;
    public final TLRPC.Message f20883n;
    public final MessageObject f20884r;
    public final int f20885s;

    public lj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f20878a = i14;
        this.f20879b = sendMessagesHelper;
        this.f20880c = arrayList;
        this.d = i10;
        this.f20881e = i11;
        this.f20882f = message;
        this.h = i12;
        this.f20883n = message2;
        this.f20884r = messageObject;
        this.f20885s = i13;
    }

    @Override
    public final void run() {
        switch (this.f20878a) {
            case 0:
                this.f20879b.lambda$sendMessage$9(this.f20880c, this.d, this.f20881e, this.f20882f, this.h, this.f20883n, this.f20884r, this.f20885s);
                return;
            default:
                this.f20879b.lambda$sendMessage$10(this.f20880c, this.d, this.f20881e, this.f20882f, this.h, this.f20883n, this.f20884r, this.f20885s);
                return;
        }
    }
}
