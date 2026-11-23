package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class o5 implements Handler.Callback {
    public final int f26054a;
    public final Thread f26055b;

    public o5(Thread thread, int i7) {
        this.f26054a = i7;
        this.f26055b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f26054a) {
            case 0:
                ((r5) this.f26055b).handleMessage(message);
                return true;
            default:
                ((q5) this.f26055b).getClass();
                return true;
        }
    }
}
