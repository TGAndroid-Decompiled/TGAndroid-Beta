package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class c2 implements Handler.Callback {
    public final int f19750a;
    public final Thread f19751b;

    public c2(Thread thread, int i10) {
        this.f19750a = i10;
        this.f19751b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19750a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19751b, message);
            default:
                return DispatchQueue2.a((DispatchQueue2) this.f19751b, message);
        }
    }
}
