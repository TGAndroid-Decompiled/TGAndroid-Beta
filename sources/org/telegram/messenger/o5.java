package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class o5 implements Handler.Callback {
    public final int f26036a;
    public final Thread f26037b;

    public o5(Thread thread, int i7) {
        this.f26036a = i7;
        this.f26037b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f26036a) {
            case 0:
                ((r5) this.f26037b).handleMessage(message);
                return true;
            default:
                ((q5) this.f26037b).getClass();
                return true;
        }
    }
}
