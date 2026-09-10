package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class b2 implements Handler.Callback {
    public final int f14748a;
    public final Thread f14749b;

    public b2(Thread thread, int i10) {
        this.f14748a = i10;
        this.f14749b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f14748a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f14749b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f14749b, message);
        }
    }
}
