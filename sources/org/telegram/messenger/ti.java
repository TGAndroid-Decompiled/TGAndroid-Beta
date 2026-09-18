package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f17419a;
    public final SendMessagesHelper f17420b;
    public final long f17421c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17419a = i10;
        this.f17420b = sendMessagesHelper;
        this.f17421c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17419a) {
            case 0:
                SendMessagesHelper.u(this.f17420b, this.f17421c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17420b, this.f17421c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17420b, this.f17421c, this.d);
                return;
        }
    }
}
