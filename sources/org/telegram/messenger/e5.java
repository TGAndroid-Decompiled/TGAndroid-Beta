package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f18538a;
    public final ImageLoader.HttpFileTask f18539b;
    public final long f18540c;
    public final long d;

    public e5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18538a = i10;
        this.f18539b = httpFileTask;
        this.f18540c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18538a) {
            case 0:
                this.f18539b.lambda$reportProgress$0(this.f18540c, this.d);
                return;
            default:
                this.f18539b.lambda$reportProgress$1(this.f18540c, this.d);
                return;
        }
    }
}
