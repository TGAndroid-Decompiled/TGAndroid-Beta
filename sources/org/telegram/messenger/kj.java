package org.telegram.messenger;

import java.util.List;
public final class kj implements Runnable {
    public final int f20536a;
    public final SendMessagesHelper f20537b;
    public final String f20538c;
    public final List d;

    public kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f20536a = i10;
        this.f20537b = sendMessagesHelper;
        this.f20538c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f20536a) {
            case 0:
                SendMessagesHelper.D(this.f20537b, this.f20538c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f20537b, this.f20538c, this.d);
                return;
        }
    }
}
