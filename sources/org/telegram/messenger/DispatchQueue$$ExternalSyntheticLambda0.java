package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

public final class DispatchQueue$$ExternalSyntheticLambda0 implements Handler.Callback {
    public final int $r8$classId;
    public final Thread f$0;

    public DispatchQueue$$ExternalSyntheticLambda0(Thread thread, int i) {
        this.$r8$classId = i;
        this.f$0 = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.$r8$classId) {
            case 0:
                return ((DispatchQueue) this.f$0).lambda$run$0(message);
            default:
                return ((DispatchQueueMainThreadSync) this.f$0).lambda$run$1(message);
        }
    }
}
