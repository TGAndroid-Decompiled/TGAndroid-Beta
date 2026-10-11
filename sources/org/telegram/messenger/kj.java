package org.telegram.messenger;

import java.util.List;
public final class kj implements Runnable {
    public final int f18414a;
    public final SendMessagesHelper f18415b;
    public final String f18416c;
    public final List d;

    public kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18414a = i10;
        this.f18415b = sendMessagesHelper;
        this.f18416c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18414a) {
            case 0:
                this.f18415b.lambda$sendNotificationCallback$31(this.f18416c, this.d);
                return;
            default:
                this.f18415b.lambda$sendCallback$41(this.f18416c, this.d);
                return;
        }
    }
}
