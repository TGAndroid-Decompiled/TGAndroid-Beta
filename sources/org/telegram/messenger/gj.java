package org.telegram.messenger;

import java.util.List;
public final class gj implements Runnable {
    public final int f18485a;
    public final SendMessagesHelper f18486b;
    public final String f18487c;
    public final List d;

    public gj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f18485a = i10;
        this.f18486b = sendMessagesHelper;
        this.f18487c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f18485a) {
            case 0:
                SendMessagesHelper.D(this.f18486b, this.f18487c, this.d);
                return;
            default:
                SendMessagesHelper.a1(this.f18486b, this.f18487c, this.d);
                return;
        }
    }
}
