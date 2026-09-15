package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f17820a;
    public final Thread f17821b;

    public x1(Thread thread, int i10) {
        this.f17820a = i10;
        this.f17821b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17820a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f17821b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f17821b, message);
        }
    }
}
