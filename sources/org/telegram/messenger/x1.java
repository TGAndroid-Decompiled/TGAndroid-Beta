package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f19578a;
    public final Thread f19579b;

    public x1(Thread thread, int i10) {
        this.f19578a = i10;
        this.f19579b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19578a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19579b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f19579b, message);
        }
    }
}
