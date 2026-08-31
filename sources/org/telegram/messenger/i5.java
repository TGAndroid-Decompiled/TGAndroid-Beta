package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18924a;
    public final ImageLoader.HttpImageTask f18925b;
    public final long f18926c;
    public final long d;

    public i5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f18924a = i10;
        this.f18925b = httpImageTask;
        this.f18926c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f18924a) {
            case 0:
                this.f18925b.lambda$reportProgress$0(this.f18926c, this.d);
                return;
            default:
                this.f18925b.lambda$reportProgress$1(this.f18926c, this.d);
                return;
        }
    }
}
