package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class n5 implements Handler.Callback {
    public final int f24130a;
    public final Thread f24131b;

    public n5(Thread thread, int i7) {
        this.f24130a = i7;
        this.f24131b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f24130a) {
            case 0:
                ((q5) this.f24131b).handleMessage(message);
                return true;
            default:
                ((p5) this.f24131b).getClass();
                return true;
        }
    }
}
