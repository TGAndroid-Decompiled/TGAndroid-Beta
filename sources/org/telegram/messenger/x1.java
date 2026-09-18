package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f18001a;
    public final Thread f18002b;

    public x1(Thread thread, int i10) {
        this.f18001a = i10;
        this.f18002b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f18001a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f18002b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f18002b, message);
        }
    }
}
