package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18926a;
    public final ImageLoader.HttpImageTask f18927b;
    public final long f18928c;
    public final long d;

    public i5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18926a = i10;
        this.f18927b = httpImageTask;
        this.f18928c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18926a) {
            case 0:
                this.f18927b.lambda$reportProgress$0(this.f18928c, this.d);
                return;
            default:
                this.f18927b.lambda$reportProgress$1(this.f18928c, this.d);
                return;
        }
    }
}
