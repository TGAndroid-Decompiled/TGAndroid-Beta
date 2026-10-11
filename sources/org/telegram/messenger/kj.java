package org.telegram.messenger;

import java.util.List;
public final class kj implements Runnable {
    public final int f18378a;
    public final SendMessagesHelper f18379b;
    public final String f18380c;
    public final List d;

    public kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18378a = i10;
        this.f18379b = sendMessagesHelper;
        this.f18380c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18378a) {
            case 0:
                this.f18379b.lambda$sendNotificationCallback$31(this.f18380c, this.d);
                return;
            default:
                this.f18379b.lambda$sendCallback$41(this.f18380c, this.d);
                return;
        }
    }
}
