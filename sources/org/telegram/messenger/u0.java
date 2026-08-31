package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f20146a;
    public final ChatObject.Call f20147b;

    public u0(ChatObject.Call call, int i10) {
        this.f20146a = i10;
        this.f20147b = call;
    }

    @Override
    public final void run() {
        switch (this.f20146a) {
            case 0:
                ChatObject.Call.j(this.f20147b);
                return;
            case 1:
                ChatObject.Call.a(this.f20147b);
                return;
            default:
                ChatObject.Call.c(this.f20147b);
                return;
        }
    }
}
