package org.telegram.messenger;

import java.util.ArrayList;
public final class vi implements Runnable {
    public final int f18681a;
    public final SendMessagesHelper f18682b;
    public final long f18683c;
    public final ArrayList d;

    public vi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f18681a = i10;
        this.f18682b = sendMessagesHelper;
        this.f18683c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18681a) {
            case 0:
                SendMessagesHelper.u(this.f18682b, this.f18683c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f18682b, this.f18683c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f18682b, this.f18683c, this.d);
                return;
        }
    }
}
