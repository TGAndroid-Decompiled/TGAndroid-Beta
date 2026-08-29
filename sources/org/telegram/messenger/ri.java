package org.telegram.messenger;

import java.util.ArrayList;
public final class ri implements Runnable {
    public final int f21468a;
    public final SendMessagesHelper f21469b;
    public final long f21470c;
    public final ArrayList d;

    public ri(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.f21468a = i10;
        this.f21469b = sendMessagesHelper;
        this.f21470c = j10;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21468a) {
            case 0:
                SendMessagesHelper.u(this.f21469b, this.f21470c, this.d);
                return;
            case 1:
                SendMessagesHelper.k1(this.f21469b, this.f21470c, this.d);
                return;
            default:
                SendMessagesHelper.R0(this.f21469b, this.f21470c, this.d);
                return;
        }
    }
}
