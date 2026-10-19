package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18676a;
    public final ImageLoader.HttpImageTask f18677b;
    public final long f18678c;
    public final long d;

    public j5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18676a = i10;
        this.f18677b = httpImageTask;
        this.f18678c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18676a) {
            case 0:
                this.f18677b.lambda$reportProgress$0(this.f18678c, this.d);
                return;
            default:
                this.f18677b.lambda$reportProgress$1(this.f18678c, this.d);
                return;
        }
    }
}
