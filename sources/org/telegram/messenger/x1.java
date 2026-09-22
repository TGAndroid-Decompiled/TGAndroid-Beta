package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f18065a;
    public final Thread f18066b;

    public x1(Thread thread, int i10) {
        this.f18065a = i10;
        this.f18066b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f18065a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f18066b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f18066b, message);
        }
    }
}
