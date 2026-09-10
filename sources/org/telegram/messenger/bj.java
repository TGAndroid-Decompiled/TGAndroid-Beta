package org.telegram.messenger;

import java.util.ArrayList;
public final class bj implements Runnable {
    public final int f14808a;
    public final SendMessagesHelper f14809b;
    public final long f14810c;
    public final ArrayList d;

    public bj(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.f14808a = i10;
        this.f14809b = sendMessagesHelper;
        this.f14810c = j3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f14808a) {
            case 0:
                SendMessagesHelper.u(this.f14809b, this.f14810c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f14809b, this.f14810c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f14809b, this.f14810c, this.d);
                return;
        }
    }
}
