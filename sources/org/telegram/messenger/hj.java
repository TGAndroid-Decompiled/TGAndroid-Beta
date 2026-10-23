package org.telegram.messenger;

import java.util.List;
public final class hj implements Runnable {
    public final int f18624a;
    public final SendMessagesHelper f18625b;
    public final String f18626c;
    public final List d;

    public hj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18624a = i10;
        this.f18625b = sendMessagesHelper;
        this.f18626c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18624a) {
            case 0:
                SendMessagesHelper.D(this.f18625b, this.f18626c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f18625b, this.f18626c, this.d);
                return;
        }
    }
}
