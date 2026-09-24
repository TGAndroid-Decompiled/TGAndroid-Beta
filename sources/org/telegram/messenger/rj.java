package org.telegram.messenger;

import java.util.List;
public final class rj implements Runnable {
    public final int f17468a;
    public final SendMessagesHelper f17469b;
    public final String f17470c;
    public final List d;

    public rj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17468a = i10;
        this.f17469b = sendMessagesHelper;
        this.f17470c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17468a) {
            case 0:
                SendMessagesHelper.M0(this.f17469b, this.f17470c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17469b, this.f17470c, this.d);
                return;
        }
    }
}
