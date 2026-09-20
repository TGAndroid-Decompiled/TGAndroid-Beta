package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f18050a;
    public final Thread f18051b;

    public x1(Thread thread, int i10) {
        this.f18050a = i10;
        this.f18051b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f18050a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f18051b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f18051b, message);
        }
    }
}
