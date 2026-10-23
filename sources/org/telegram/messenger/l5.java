package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f18863a;
    public final ImageLoader.HttpImageTask f18864b;
    public final long f18865c;
    public final long d;

    public l5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18863a = i10;
        this.f18864b = httpImageTask;
        this.f18865c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18863a) {
            case 0:
                this.f18864b.lambda$reportProgress$0(this.f18865c, this.d);
                return;
            default:
                this.f18864b.lambda$reportProgress$1(this.f18865c, this.d);
                return;
        }
    }
}
