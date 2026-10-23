package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18510a;
    public final ImageLoader.HttpFileTask f18511b;
    public final long f18512c;
    public final long d;

    public h5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18510a = i10;
        this.f18511b = httpFileTask;
        this.f18512c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18510a) {
            case 0:
                this.f18511b.lambda$reportProgress$0(this.f18512c, this.d);
                return;
            default:
                this.f18511b.lambda$reportProgress$1(this.f18512c, this.d);
                return;
        }
    }
}
