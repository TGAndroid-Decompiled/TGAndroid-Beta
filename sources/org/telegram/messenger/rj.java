package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f17477a;
    public final SendMessagesHelper f17478b;
    public final String f17479c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17477a = i10;
        this.f17478b = sendMessagesHelper;
        this.f17479c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17477a) {
            case 0:
                SendMessagesHelper.M0(this.f17478b, this.f17479c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17478b, this.f17479c, this.d);
                return;
        }
    }
}
