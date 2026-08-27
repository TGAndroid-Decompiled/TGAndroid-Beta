package org.telegram.messenger;

import java.util.List;

public final class oj implements Runnable {

    public final int f21195a;

    public final SendMessagesHelper f21196b;

    public final String f21197c;
    public final List d;

    public oj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f21195a = i10;
        this.f21196b = sendMessagesHelper;
        this.f21197c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f21195a) {
            case 0:
                this.f21196b.lambda$sendNotificationCallback$28(this.f21197c, this.d);
                break;
            default:
                this.f21196b.lambda$sendCallback$38(this.f21197c, this.d);
                break;
        }
    }
}
