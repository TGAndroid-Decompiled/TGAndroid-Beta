package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f18861a;
    public final ImageLoader.HttpImageTask f18862b;
    public final long f18863c;
    public final long d;

    public l5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18861a = i10;
        this.f18862b = httpImageTask;
        this.f18863c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18861a) {
            case 0:
                this.f18862b.lambda$reportProgress$0(this.f18863c, this.d);
                return;
            default:
                this.f18862b.lambda$reportProgress$1(this.f18863c, this.d);
                return;
        }
    }
}
