package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class o5 implements Handler.Callback {
    public final int f26064a;
    public final Thread f26065b;

    public o5(Thread thread, int i7) {
        this.f26064a = i7;
        this.f26065b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f26064a) {
            case 0:
                ((r5) this.f26065b).handleMessage(message);
                return true;
            default:
                ((q5) this.f26065b).getClass();
                return true;
        }
    }
}
