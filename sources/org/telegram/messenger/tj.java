package org.telegram.messenger;

import java.util.List;
public final class tj implements Runnable {
    public final int f17409a;
    public final SendMessagesHelper f17410b;
    public final String f17411c;
    public final List d;

    public tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17409a = i10;
        this.f17410b = sendMessagesHelper;
        this.f17411c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17409a) {
            case 0:
                SendMessagesHelper.M0(this.f17410b, this.f17411c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17410b, this.f17411c, this.d);
                return;
        }
    }
}
