package org.telegram.messenger;

import java.util.List;
public final class sj implements Runnable {
    public final int f17546a;
    public final SendMessagesHelper f17547b;
    public final String f17548c;
    public final List d;

    public sj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17546a = i10;
        this.f17547b = sendMessagesHelper;
        this.f17548c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17546a) {
            case 0:
                SendMessagesHelper.M0(this.f17547b, this.f17548c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17547b, this.f17548c, this.d);
                return;
        }
    }
}
