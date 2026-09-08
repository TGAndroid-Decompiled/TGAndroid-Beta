package org.telegram.messenger;

import java.util.List;
public final class tj implements Runnable {
    public final int f19124a;
    public final SendMessagesHelper f19125b;
    public final String f19126c;
    public final List d;

    public tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f19124a = i10;
        this.f19125b = sendMessagesHelper;
        this.f19126c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                SendMessagesHelper.M0(this.f19125b, this.f19126c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f19125b, this.f19126c, this.d);
                return;
        }
    }
}
