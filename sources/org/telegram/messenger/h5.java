package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18511a;
    public final ImageLoader.HttpFileTask f18512b;
    public final long f18513c;
    public final long d;

    public h5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18511a = i10;
        this.f18512b = httpFileTask;
        this.f18513c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18511a) {
            case 0:
                this.f18512b.lambda$reportProgress$0(this.f18513c, this.d);
                return;
            default:
                this.f18512b.lambda$reportProgress$1(this.f18513c, this.d);
                return;
        }
    }
}
