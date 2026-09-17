package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f19605a;
    public final Thread f19606b;

    public x1(Thread thread, int i10) {
        this.f19605a = i10;
        this.f19606b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19605a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19606b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f19606b, message);
        }
    }
}
