package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class ij implements Runnable {

    public final int f20598a;

    public final SendMessagesHelper f20599b;

    public final ArrayList f20600c;
    public final int d;

    public final int f20601e;

    public final TLRPC.Message f20602f;
    public final int h;

    public final TLRPC.Message f20603n;

    public final MessageObject f20604r;

    public final int f20605s;

    public ij(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.f20598a = i14;
        this.f20599b = sendMessagesHelper;
        this.f20600c = arrayList;
        this.d = i10;
        this.f20601e = i11;
        this.f20602f = message;
        this.h = i12;
        this.f20603n = message2;
        this.f20604r = messageObject;
        this.f20605s = i13;
    }

    @Override
    public final void run() {
        switch (this.f20598a) {
            case 0:
                this.f20599b.lambda$sendMessage$9(this.f20600c, this.d, this.f20601e, this.f20602f, this.h, this.f20603n, this.f20604r, this.f20605s);
                break;
            default:
                this.f20599b.lambda$sendMessage$10(this.f20600c, this.d, this.f20601e, this.f20602f, this.h, this.f20603n, this.f20604r, this.f20605s);
                break;
        }
    }
}
