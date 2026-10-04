package org.telegram.messenger;

import java.util.ArrayList;
public final class ti implements Runnable {
    public final int f19268a;
    public final SendMessagesHelper f19269b;
    public final long f19270c;
    public final ArrayList d;

    public ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f19268a = i10;
        this.f19269b = sendMessagesHelper;
        this.f19270c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19268a) {
            case 0:
                SendMessagesHelper.u(this.f19269b, this.f19270c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f19269b, this.f19270c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f19269b, this.f19270c, this.d);
                return;
        }
    }
}
