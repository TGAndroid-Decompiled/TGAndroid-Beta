package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f18424a;
    public final ImageLoader.HttpFileTask f18425b;
    public final long f18426c;
    public final long d;

    public g5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f18424a = i10;
        this.f18425b = httpFileTask;
        this.f18426c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18424a) {
            case 0:
                this.f18425b.lambda$reportProgress$0(this.f18426c, this.d);
                return;
            default:
                this.f18425b.lambda$reportProgress$1(this.f18426c, this.d);
                return;
        }
    }
}
