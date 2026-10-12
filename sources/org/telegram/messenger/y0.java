package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class y0 implements Runnable {
    public final int f19624a;
    public final ChatObject.Call f19625b;

    public y0(ChatObject.Call call, int i10) {
        this.f19624a = i10;
        this.f19625b = call;
    }

    @Override
    public final void run() {
        switch (this.f19624a) {
            case 0:
                ChatObject.Call.j(this.f19625b);
                return;
            case 1:
                ChatObject.Call.a(this.f19625b);
                return;
            default:
                ChatObject.Call.c(this.f19625b);
                return;
        }
    }
}
