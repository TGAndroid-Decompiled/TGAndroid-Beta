package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class y0 implements Runnable {
    public final int f19623a;
    public final ChatObject.Call f19624b;

    public y0(ChatObject.Call call, int i10) {
        this.f19623a = i10;
        this.f19624b = call;
    }

    @Override
    public final void run() {
        switch (this.f19623a) {
            case 0:
                ChatObject.Call.j(this.f19624b);
                return;
            case 1:
                ChatObject.Call.a(this.f19624b);
                return;
            default:
                ChatObject.Call.c(this.f19624b);
                return;
        }
    }
}
