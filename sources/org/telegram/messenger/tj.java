package org.telegram.messenger;

import java.util.List;
public final class tj implements Runnable {
    public final int f17422a;
    public final SendMessagesHelper f17423b;
    public final String f17424c;
    public final List d;

    public tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17422a = i10;
        this.f17423b = sendMessagesHelper;
        this.f17424c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17422a) {
            case 0:
                SendMessagesHelper.M0(this.f17423b, this.f17424c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17423b, this.f17424c, this.d);
                return;
        }
    }
}
