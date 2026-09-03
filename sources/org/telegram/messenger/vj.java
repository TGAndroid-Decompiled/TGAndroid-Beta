package org.telegram.messenger;

import java.util.List;
public final class vj implements Runnable {
    public final int f20364a;
    public final SendMessagesHelper f20365b;
    public final String f20366c;
    public final List d;

    public vj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f20364a = i10;
        this.f20365b = sendMessagesHelper;
        this.f20366c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f20364a) {
            case 0:
                SendMessagesHelper.M0(this.f20365b, this.f20366c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f20365b, this.f20366c, this.d);
                return;
        }
    }
}
