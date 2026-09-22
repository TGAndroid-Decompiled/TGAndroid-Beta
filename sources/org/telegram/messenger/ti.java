package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f17638a;
    public final SendMessagesHelper f17639b;
    public final long f17640c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17638a = i10;
        this.f17639b = sendMessagesHelper;
        this.f17640c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17638a) {
            case 0:
                SendMessagesHelper.u(this.f17639b, this.f17640c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17639b, this.f17640c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17639b, this.f17640c, this.d);
                return;
        }
    }
}
