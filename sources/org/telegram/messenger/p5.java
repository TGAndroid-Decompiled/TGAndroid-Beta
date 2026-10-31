package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class p5 implements Handler.Callback {
    public final int f17411a;
    public final Thread f17412b;

    public p5(Thread thread, int i10) {
        this.f17411a = i10;
        this.f17412b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17411a) {
            case 0:
                ((s5) this.f17412b).handleMessage(message);
                return true;
            default:
                ((r5) this.f17412b).getClass();
                return true;
        }
    }
}
