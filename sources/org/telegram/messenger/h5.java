package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18508a;
    public final ImageLoader.HttpFileTask f18509b;
    public final long f18510c;
    public final long d;

    public h5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18508a = i10;
        this.f18509b = httpFileTask;
        this.f18510c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18508a) {
            case 0:
                this.f18509b.lambda$reportProgress$0(this.f18510c, this.d);
                return;
            default:
                this.f18509b.lambda$reportProgress$1(this.f18510c, this.d);
                return;
        }
    }
}
