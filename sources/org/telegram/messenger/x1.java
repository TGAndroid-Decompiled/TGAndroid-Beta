package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f17829a;
    public final Thread f17830b;

    public x1(Thread thread, int i10) {
        this.f17829a = i10;
        this.f17830b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17829a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f17830b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f17830b, message);
        }
    }
}
