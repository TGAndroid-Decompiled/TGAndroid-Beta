package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f18543a;
    public final ChatObject.Call f18544b;

    public u0(ChatObject.Call call, int i10) {
        this.f18543a = i10;
        this.f18544b = call;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                ChatObject.Call.j(this.f18544b);
                return;
            case 1:
                ChatObject.Call.a(this.f18544b);
                return;
            default:
                ChatObject.Call.c(this.f18544b);
                return;
        }
    }
}
