package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f17568a;
    public final SendMessagesHelper f17569b;
    public final long f17570c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17568a = i10;
        this.f17569b = sendMessagesHelper;
        this.f17570c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17568a) {
            case 0:
                SendMessagesHelper.u(this.f17569b, this.f17570c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17569b, this.f17570c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17569b, this.f17570c, this.d);
                return;
        }
    }
}
