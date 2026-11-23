package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class o5 implements Handler.Callback {
    public final int f26090a;
    public final Thread f26091b;

    public o5(Thread thread, int i7) {
        this.f26090a = i7;
        this.f26091b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f26090a) {
            case 0:
                ((r5) this.f26091b).handleMessage(message);
                return true;
            default:
                ((q5) this.f26091b).getClass();
                return true;
        }
    }
}
