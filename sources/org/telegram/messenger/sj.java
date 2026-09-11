package org.telegram.messenger;

import java.util.List;
public final class sj implements Runnable {
    public final int f19013a;
    public final SendMessagesHelper f19014b;
    public final String f19015c;
    public final List d;

    public sj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19013a = i10;
        this.f19014b = sendMessagesHelper;
        this.f19015c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19013a) {
            case 0:
                this.f19014b.lambda$sendNotificationCallback$28(this.f19015c, this.d);
                return;
            default:
                this.f19014b.lambda$sendCallback$38(this.f19015c, this.d);
                return;
        }
    }
}
