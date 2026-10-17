package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18673a;
    public final ImageLoader.HttpImageTask f18674b;
    public final long f18675c;
    public final long d;

    public j5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18673a = i10;
        this.f18674b = httpImageTask;
        this.f18675c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18673a) {
            case 0:
                this.f18674b.lambda$reportProgress$0(this.f18675c, this.d);
                return;
            default:
                this.f18674b.lambda$reportProgress$1(this.f18675c, this.d);
                return;
        }
    }
}
