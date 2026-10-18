package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f18421a;
    public final ImageLoader.HttpFileTask f18422b;
    public final long f18423c;
    public final long d;

    public g5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18421a = i10;
        this.f18422b = httpFileTask;
        this.f18423c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18421a) {
            case 0:
                this.f18422b.lambda$reportProgress$0(this.f18423c, this.d);
                return;
            default:
                this.f18422b.lambda$reportProgress$1(this.f18423c, this.d);
                return;
        }
    }
}
