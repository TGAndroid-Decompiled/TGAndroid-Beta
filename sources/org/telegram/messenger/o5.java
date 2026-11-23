package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class o5 implements Handler.Callback {
    public final int f26132a;
    public final Thread f26133b;

    public o5(Thread thread, int i7) {
        this.f26132a = i7;
        this.f26133b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f26132a) {
            case 0:
                ((r5) this.f26133b).handleMessage(message);
                return true;
            default:
                ((q5) this.f26133b).getClass();
                return true;
        }
    }
}
