package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f17487a;
    public final SendMessagesHelper f17488b;
    public final String f17489c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17487a = i10;
        this.f17488b = sendMessagesHelper;
        this.f17489c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17487a) {
            case 0:
                SendMessagesHelper.M0(this.f17488b, this.f17489c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17488b, this.f17489c, this.d);
                return;
        }
    }
}
