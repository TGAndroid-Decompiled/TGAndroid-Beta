package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class n5 implements Handler.Callback {
    public final int f24136a;
    public final Thread f24137b;

    public n5(Thread thread, int i7) {
        this.f24136a = i7;
        this.f24137b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f24136a) {
            case 0:
                ((q5) this.f24137b).handleMessage(message);
                return true;
            default:
                ((p5) this.f24137b).getClass();
                return true;
        }
    }
}
