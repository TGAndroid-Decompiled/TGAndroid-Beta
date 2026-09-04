package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class x1 implements Handler.Callback {
    public final int f19541a;
    public final Thread f19542b;

    public x1(Thread thread, int i10) {
        this.f19541a = i10;
        this.f19542b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19541a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19542b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f19542b, message);
        }
    }
}
