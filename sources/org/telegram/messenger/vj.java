package org.telegram.messenger;

import java.util.List;
public final class vj implements Runnable {
    public final int f20362a;
    public final SendMessagesHelper f20363b;
    public final String f20364c;
    public final List d;

    public vj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f20362a = i10;
        this.f20363b = sendMessagesHelper;
        this.f20364c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f20362a) {
            case 0:
                SendMessagesHelper.M0(this.f20363b, this.f20364c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f20363b, this.f20364c, this.d);
                return;
        }
    }
}
