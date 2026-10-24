package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18649a;
    public final ImageLoader.HttpFileTask f18650b;
    public final long f18651c;
    public final long d;

    public i5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18649a = i10;
        this.f18650b = httpFileTask;
        this.f18651c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18649a) {
            case 0:
                this.f18650b.lambda$reportProgress$0(this.f18651c, this.d);
                return;
            default:
                this.f18650b.lambda$reportProgress$1(this.f18651c, this.d);
                return;
        }
    }
}
