package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f18931a;
    public final ImageLoader.HttpImageTask f18932b;
    public final long f18933c;
    public final long d;

    public l5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18931a = i10;
        this.f18932b = httpImageTask;
        this.f18933c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18931a) {
            case 0:
                this.f18932b.lambda$reportProgress$0(this.f18933c, this.d);
                return;
            default:
                this.f18932b.lambda$reportProgress$1(this.f18933c, this.d);
                return;
        }
    }
}
