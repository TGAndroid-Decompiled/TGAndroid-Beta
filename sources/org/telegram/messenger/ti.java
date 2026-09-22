package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f17406a;
    public final SendMessagesHelper f17407b;
    public final long f17408c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17406a = i10;
        this.f17407b = sendMessagesHelper;
        this.f17408c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17406a) {
            case 0:
                SendMessagesHelper.u(this.f17407b, this.f17408c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17407b, this.f17408c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17407b, this.f17408c, this.d);
                return;
        }
    }
}
