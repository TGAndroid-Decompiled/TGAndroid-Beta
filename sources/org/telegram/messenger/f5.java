package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18348a;
    public final ImageLoader.HttpFileTask f18349b;
    public final long f18350c;
    public final long d;

    public f5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18348a = i10;
        this.f18349b = httpFileTask;
        this.f18350c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                this.f18349b.lambda$reportProgress$0(this.f18350c, this.d);
                return;
            default:
                this.f18349b.lambda$reportProgress$1(this.f18350c, this.d);
                return;
        }
    }
}
