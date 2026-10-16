package org.telegram.messenger;

import java.util.List;
public final class nj implements Runnable {
    public final int f17669a;
    public final SendMessagesHelper f17670b;
    public final String f17671c;
    public final List d;

    public nj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17669a = i10;
        this.f17670b = sendMessagesHelper;
        this.f17671c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17669a) {
            case 0:
                this.f17670b.lambda$sendNotificationCallback$31(this.f17671c, this.d);
                return;
            default:
                this.f17670b.lambda$sendCallback$41(this.f17671c, this.d);
                return;
        }
    }
}
