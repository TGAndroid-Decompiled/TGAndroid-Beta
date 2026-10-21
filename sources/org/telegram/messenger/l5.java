package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f18858a;
    public final ImageLoader.HttpImageTask f18859b;
    public final long f18860c;
    public final long d;

    public l5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18858a = i10;
        this.f18859b = httpImageTask;
        this.f18860c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18858a) {
            case 0:
                this.f18859b.lambda$reportProgress$0(this.f18860c, this.d);
                return;
            default:
                this.f18859b.lambda$reportProgress$1(this.f18860c, this.d);
                return;
        }
    }
}
