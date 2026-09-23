package org.telegram.messenger;

import java.util.List;
public final class sj implements Runnable {
    public final int f17304a;
    public final SendMessagesHelper f17305b;
    public final String f17306c;
    public final List d;

    public sj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17304a = i10;
        this.f17305b = sendMessagesHelper;
        this.f17306c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                SendMessagesHelper.M0(this.f17305b, this.f17306c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17305b, this.f17306c, this.d);
                return;
        }
    }
}
