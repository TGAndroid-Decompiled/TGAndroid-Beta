package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f17533a;
    public final SendMessagesHelper f17534b;
    public final long f17535c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f17533a = i10;
        this.f17534b = sendMessagesHelper;
        this.f17535c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17533a) {
            case 0:
                SendMessagesHelper.u(this.f17534b, this.f17535c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f17534b, this.f17535c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f17534b, this.f17535c, this.d);
                return;
        }
    }
}
