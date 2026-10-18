package org.telegram.messenger;

import java.util.List;
public final class gj implements Runnable {
    public final int f18469a;
    public final SendMessagesHelper f18470b;
    public final String f18471c;
    public final List d;

    public gj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18469a = i10;
        this.f18470b = sendMessagesHelper;
        this.f18471c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18469a) {
            case 0:
                SendMessagesHelper.D(this.f18470b, this.f18471c, this.d);
                return;
            default:
                SendMessagesHelper.Z0(this.f18470b, this.f18471c, this.d);
                return;
        }
    }
}
