package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class p5 implements Handler.Callback {
    public final int f17562a;
    public final Thread f17563b;

    public p5(Thread thread, int i10) {
        this.f17562a = i10;
        this.f17563b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17562a) {
            case 0:
                ((s5) this.f17563b).handleMessage(message);
                return true;
            default:
                ((r5) this.f17563b).getClass();
                return true;
        }
    }
}
