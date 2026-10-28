package org.telegram.messenger;

import java.util.List;
public final class lj implements Runnable {
    public final int f20625a;
    public final SendMessagesHelper f20626b;
    public final String f20627c;
    public final List d;

    public lj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f20625a = i10;
        this.f20626b = sendMessagesHelper;
        this.f20627c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f20625a) {
            case 0:
                SendMessagesHelper.D(this.f20626b, this.f20627c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f20626b, this.f20627c, this.d);
                return;
        }
    }
}
