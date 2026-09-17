package org.telegram.messenger;

import java.util.ArrayList;
public final class si implements Runnable {
    public final int f19010a;
    public final SendMessagesHelper f19011b;
    public final long f19012c;
    public final ArrayList d;

    public si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19010a = i10;
        this.f19011b = sendMessagesHelper;
        this.f19012c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19010a) {
            case 0:
                SendMessagesHelper.u(this.f19011b, this.f19012c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f19011b, this.f19012c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f19011b, this.f19012c, this.d);
                return;
        }
    }
}
