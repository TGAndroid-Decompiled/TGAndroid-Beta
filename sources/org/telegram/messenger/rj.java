package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f17483a;
    public final SendMessagesHelper f17484b;
    public final String f17485c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17483a = i10;
        this.f17484b = sendMessagesHelper;
        this.f17485c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17483a) {
            case 0:
                SendMessagesHelper.M0(this.f17484b, this.f17485c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17484b, this.f17485c, this.d);
                return;
        }
    }
}
