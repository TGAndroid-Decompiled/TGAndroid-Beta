package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f18525a;
    public final ChatObject.Call f18526b;

    public u0(ChatObject.Call call, int i10) {
        this.f18525a = i10;
        this.f18526b = call;
    }

    @Override
    public final void run() {
        switch (this.f18525a) {
            case 0:
                ChatObject.Call.j(this.f18526b);
                return;
            case 1:
                ChatObject.Call.a(this.f18526b);
                return;
            default:
                ChatObject.Call.c(this.f18526b);
                return;
        }
    }
}
