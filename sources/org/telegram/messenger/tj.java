package org.telegram.messenger;

import java.util.List;
public final class tj implements Runnable {
    public final int f17595a;
    public final SendMessagesHelper f17596b;
    public final String f17597c;
    public final List d;

    public tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17595a = i10;
        this.f17596b = sendMessagesHelper;
        this.f17597c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17595a) {
            case 0:
                SendMessagesHelper.M0(this.f17596b, this.f17597c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f17596b, this.f17597c, this.d);
                return;
        }
    }
}
