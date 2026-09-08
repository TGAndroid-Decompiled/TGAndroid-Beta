package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f19568a;
    public final Thread f19569b;

    public x1(Thread thread, int i10) {
        this.f19568a = i10;
        this.f19569b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19568a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19569b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f19569b, message);
        }
    }
}
