package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f19121a;
    public final SendMessagesHelper f19122b;
    public final long f19123c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19121a = i10;
        this.f19122b = sendMessagesHelper;
        this.f19123c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19121a) {
            case 0:
                SendMessagesHelper.u(this.f19122b, this.f19123c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f19122b, this.f19123c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f19122b, this.f19123c, this.d);
                return;
        }
    }
}
