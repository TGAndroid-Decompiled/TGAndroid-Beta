package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f17503a;
    public final SendMessagesHelper f17504b;
    public final String f17505c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17503a = i10;
        this.f17504b = sendMessagesHelper;
        this.f17505c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17503a) {
            case 0:
                SendMessagesHelper.M0(this.f17504b, this.f17505c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17504b, this.f17505c, this.d);
                return;
        }
    }
}
