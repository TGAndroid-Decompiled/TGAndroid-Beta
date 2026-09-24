package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class y1 implements Handler.Callback {
    public final int f18150a;
    public final Thread f18151b;

    public y1(Thread thread, int i10) {
        this.f18150a = i10;
        this.f18151b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f18150a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f18151b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f18151b, message);
        }
    }
}
