package org.telegram.messenger;

import java.util.List;
public final class kj implements Runnable {
    public final int f18373a;
    public final SendMessagesHelper f18374b;
    public final String f18375c;
    public final List d;

    public kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18373a = i10;
        this.f18374b = sendMessagesHelper;
        this.f18375c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18373a) {
            case 0:
                this.f18374b.lambda$sendNotificationCallback$31(this.f18375c, this.d);
                return;
            default:
                this.f18374b.lambda$sendCallback$41(this.f18375c, this.d);
                return;
        }
    }
}
