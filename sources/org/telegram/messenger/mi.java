package org.telegram.messenger;

import java.util.ArrayList;
public final class mi implements Runnable {
    public final int f20705a;
    public final SendMessagesHelper f20706b;
    public final long f20707c;
    public final ArrayList d;

    public mi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f20705a = i10;
        this.f20706b = sendMessagesHelper;
        this.f20707c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20705a) {
            case 0:
                SendMessagesHelper.h0(this.f20706b, this.f20707c, this.d);
                return;
            case 1:
                SendMessagesHelper.v(this.f20706b, this.f20707c, this.d);
                return;
            default:
                SendMessagesHelper.A1(this.f20706b, this.f20707c, this.d);
                return;
        }
    }
}
