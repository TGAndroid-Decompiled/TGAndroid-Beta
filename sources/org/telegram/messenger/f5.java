package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f18340a;
    public final ImageLoader.HttpFileTask f18341b;
    public final long f18342c;
    public final long d;

    public f5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18340a = i10;
        this.f18341b = httpFileTask;
        this.f18342c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18340a) {
            case 0:
                this.f18341b.lambda$reportProgress$0(this.f18342c, this.d);
                return;
            default:
                this.f18341b.lambda$reportProgress$1(this.f18342c, this.d);
                return;
        }
    }
}
