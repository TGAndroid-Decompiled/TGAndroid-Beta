package org.telegram.messenger;

import java.util.List;
public final class sj implements Runnable {
    public final int f17561a;
    public final SendMessagesHelper f17562b;
    public final String f17563c;
    public final List d;

    public sj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17561a = i10;
        this.f17562b = sendMessagesHelper;
        this.f17563c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17561a) {
            case 0:
                SendMessagesHelper.M0(this.f17562b, this.f17563c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17562b, this.f17563c, this.d);
                return;
        }
    }
}
