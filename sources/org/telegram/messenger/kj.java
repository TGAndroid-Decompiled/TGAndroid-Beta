package org.telegram.messenger;

import java.util.List;
public final class kj implements Runnable {
    public final int f20821a;
    public final SendMessagesHelper f20822b;
    public final String f20823c;
    public final List d;

    public kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i9) {
        this.f20821a = i9;
        this.f20822b = sendMessagesHelper;
        this.f20823c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f20821a) {
            case 0:
                this.f20822b.lambda$sendNotificationCallback$28(this.f20823c, this.d);
                return;
            default:
                this.f20822b.lambda$sendCallback$38(this.f20823c, this.d);
                return;
        }
    }
}
