package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class y1 implements Handler.Callback {
    public final int f22209a;
    public final Thread f22210b;

    public y1(Thread thread, int i10) {
        this.f22209a = i10;
        this.f22210b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f22209a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f22210b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f22210b, message);
        }
    }
}
