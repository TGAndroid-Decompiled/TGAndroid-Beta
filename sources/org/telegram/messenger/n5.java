package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class n5 implements Handler.Callback {
    public final int f24314a;
    public final Thread f24315b;

    public n5(Thread thread, int i3) {
        this.f24314a = i3;
        this.f24315b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f24314a) {
            case 0:
                ((q5) this.f24315b).handleMessage(message);
                return true;
            default:
                ((p5) this.f24315b).getClass();
                return true;
        }
    }
}
