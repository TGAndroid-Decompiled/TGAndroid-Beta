package org.telegram.messenger;

import java.util.List;
public final class sj implements Runnable {
    public final int f19040a;
    public final SendMessagesHelper f19041b;
    public final String f19042c;
    public final List d;

    public sj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19040a = i10;
        this.f19041b = sendMessagesHelper;
        this.f19042c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19040a) {
            case 0:
                SendMessagesHelper.M0(this.f19041b, this.f19042c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f19041b, this.f19042c, this.d);
                return;
        }
    }
}
