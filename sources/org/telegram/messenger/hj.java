package org.telegram.messenger;

import java.util.List;
public final class hj implements Runnable {
    public final int f18558a;
    public final SendMessagesHelper f18559b;
    public final String f18560c;
    public final List d;

    public hj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18558a = i10;
        this.f18559b = sendMessagesHelper;
        this.f18560c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18558a) {
            case 0:
                SendMessagesHelper.D(this.f18559b, this.f18560c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f18559b, this.f18560c, this.d);
                return;
        }
    }
}
