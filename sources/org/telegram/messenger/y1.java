package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class y1 implements Handler.Callback {
    public final int f18165a;
    public final Thread f18166b;

    public y1(Thread thread, int i10) {
        this.f18165a = i10;
        this.f18166b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f18165a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f18166b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f18166b, message);
        }
    }
}
