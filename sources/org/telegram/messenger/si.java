package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f17301a;
    public final SendMessagesHelper f17302b;
    public final long f17303c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17301a = i10;
        this.f17302b = sendMessagesHelper;
        this.f17303c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17301a) {
            case 0:
                SendMessagesHelper.u(this.f17302b, this.f17303c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17302b, this.f17303c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17302b, this.f17303c, this.d);
                return;
        }
    }
}
