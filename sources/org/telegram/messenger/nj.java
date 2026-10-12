package org.telegram.messenger;

import java.util.List;
public final class nj implements Runnable {
    public final int f17974a;
    public final SendMessagesHelper f17975b;
    public final String f17976c;
    public final List d;

    public nj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17974a = i10;
        this.f17975b = sendMessagesHelper;
        this.f17976c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                this.f17975b.lambda$sendNotificationCallback$31(this.f17976c, this.d);
                return;
            default:
                this.f17975b.lambda$sendCallback$41(this.f17976c, this.d);
                return;
        }
    }
}
