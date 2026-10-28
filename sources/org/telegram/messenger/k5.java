package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f20481a;
    public final ImageLoader.HttpFileTask f20482b;
    public final long f20483c;
    public final long d;

    public k5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f20481a = i10;
        this.f20482b = httpFileTask;
        this.f20483c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20481a) {
            case 0:
                this.f20482b.lambda$reportProgress$0(this.f20483c, this.d);
                return;
            default:
                this.f20482b.lambda$reportProgress$1(this.f20483c, this.d);
                return;
        }
    }
}
