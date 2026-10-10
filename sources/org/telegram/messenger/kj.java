package org.telegram.messenger;

import java.util.List;
public final class kj implements Runnable {
    public final int f18377a;
    public final SendMessagesHelper f18378b;
    public final String f18379c;
    public final List d;

    public kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18377a = i10;
        this.f18378b = sendMessagesHelper;
        this.f18379c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18377a) {
            case 0:
                this.f18378b.lambda$sendNotificationCallback$31(this.f18379c, this.d);
                return;
            default:
                this.f18378b.lambda$sendCallback$41(this.f18379c, this.d);
                return;
        }
    }
}
