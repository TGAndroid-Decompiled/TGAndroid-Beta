package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class b2 implements Handler.Callback {
    public final int f17966a;
    public final Thread f17967b;

    public b2(Thread thread, int i10) {
        this.f17966a = i10;
        this.f17967b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17966a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f17967b, message);
            default:
                return DispatchQueue2.a((DispatchQueue2) this.f17967b, message);
        }
    }
}
