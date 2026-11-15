package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class n5 implements Handler.Callback {
    public final int f25152a;
    public final Thread f25153b;

    public n5(Thread thread, int i7) {
        this.f25152a = i7;
        this.f25153b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f25152a) {
            case 0:
                ((q5) this.f25153b).handleMessage(message);
                return true;
            default:
                ((p5) this.f25153b).getClass();
                return true;
        }
    }
}
