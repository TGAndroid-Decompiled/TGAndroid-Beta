package org.telegram.messenger;

import java.util.List;
public final class gj implements Runnable {
    public final int f18478a;
    public final SendMessagesHelper f18479b;
    public final String f18480c;
    public final List d;

    public gj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18478a = i10;
        this.f18479b = sendMessagesHelper;
        this.f18480c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18478a) {
            case 0:
                SendMessagesHelper.D(this.f18479b, this.f18480c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f18479b, this.f18480c, this.d);
                return;
        }
    }
}
