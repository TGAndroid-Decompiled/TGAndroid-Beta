package org.telegram.messenger;

import java.util.ArrayList;
public final class ki implements Runnable {
    public final int f20818a;
    public final SendMessagesHelper f20819b;
    public final long f20820c;
    public final ArrayList d;

    public ki(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i9) {
        this.f20818a = i9;
        this.f20819b = sendMessagesHelper;
        this.f20820c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20818a) {
            case 0:
                SendMessagesHelper.u(this.f20819b, this.f20820c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f20819b, this.f20820c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f20819b, this.f20820c, this.d);
                return;
        }
    }
}
