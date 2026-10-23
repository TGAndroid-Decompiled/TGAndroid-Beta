package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class y0 implements Runnable {
    public final int f20180a;
    public final ChatObject.Call f20181b;

    public y0(ChatObject.Call call, int i10) {
        this.f20180a = i10;
        this.f20181b = call;
    }

    @Override
    public final void run() {
        switch (this.f20180a) {
            case 0:
                ChatObject.Call.j(this.f20181b);
                return;
            case 1:
                ChatObject.Call.a(this.f20181b);
                return;
            default:
                ChatObject.Call.c(this.f20181b);
                return;
        }
    }
}
