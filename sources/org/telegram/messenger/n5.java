package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class n5 implements Handler.Callback {
    public final int f25155a;
    public final Thread f25156b;

    public n5(Thread thread, int i7) {
        this.f25155a = i7;
        this.f25156b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f25155a) {
            case 0:
                ((q5) this.f25156b).handleMessage(message);
                return true;
            default:
                ((p5) this.f25156b).getClass();
                return true;
        }
    }
}
