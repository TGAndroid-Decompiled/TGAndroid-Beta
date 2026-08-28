package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class y1 implements Handler.Callback {
    public final int f22189a;
    public final Thread f22190b;

    public y1(Thread thread, int i9) {
        this.f22189a = i9;
        this.f22190b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f22189a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f22190b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f22190b, message);
        }
    }
}
