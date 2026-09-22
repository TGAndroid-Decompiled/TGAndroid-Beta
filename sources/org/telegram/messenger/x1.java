package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f17819a;
    public final Thread f17820b;

    public x1(Thread thread, int i10) {
        this.f17819a = i10;
        this.f17820b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17819a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f17820b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f17820b, message);
        }
    }
}
