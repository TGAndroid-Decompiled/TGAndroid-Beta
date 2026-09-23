package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class y1 implements Handler.Callback {
    public final int f17909a;
    public final Thread f17910b;

    public y1(Thread thread, int i10) {
        this.f17909a = i10;
        this.f17910b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f17909a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f17910b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f17910b, message);
        }
    }
}
