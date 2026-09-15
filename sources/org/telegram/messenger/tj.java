package org.telegram.messenger;

import java.util.List;
public final class tj implements Runnable {
    public final int f17413a;
    public final SendMessagesHelper f17414b;
    public final String f17415c;
    public final List d;

    public tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f17413a = i10;
        this.f17414b = sendMessagesHelper;
        this.f17415c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f17413a) {
            case 0:
                this.f17414b.lambda$sendNotificationCallback$28(this.f17415c, this.d);
                return;
            default:
                this.f17414b.lambda$sendCallback$38(this.f17415c, this.d);
                return;
        }
    }
}
