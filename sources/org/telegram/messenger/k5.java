package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18767a;
    public final ImageLoader.HttpImageTask f18768b;
    public final long f18769c;
    public final long d;

    public k5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18767a = i10;
        this.f18768b = httpImageTask;
        this.f18769c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18767a) {
            case 0:
                this.f18768b.lambda$reportProgress$0(this.f18769c, this.d);
                return;
            default:
                this.f18768b.lambda$reportProgress$1(this.f18769c, this.d);
                return;
        }
    }
}
