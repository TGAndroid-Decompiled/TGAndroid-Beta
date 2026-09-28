package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f17486a;
    public final SendMessagesHelper f17487b;
    public final String f17488c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17486a = i10;
        this.f17487b = sendMessagesHelper;
        this.f17488c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17486a) {
            case 0:
                SendMessagesHelper.M0(this.f17487b, this.f17488c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17487b, this.f17488c, this.d);
                return;
        }
    }
}
