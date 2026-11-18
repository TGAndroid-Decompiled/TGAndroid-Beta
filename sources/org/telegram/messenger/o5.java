package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class o5 implements Handler.Callback {
    public final int f26038a;
    public final Thread f26039b;

    public o5(Thread thread, int i7) {
        this.f26038a = i7;
        this.f26039b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f26038a) {
            case 0:
                ((r5) this.f26039b).handleMessage(message);
                return true;
            default:
                ((q5) this.f26039b).getClass();
                return true;
        }
    }
}
