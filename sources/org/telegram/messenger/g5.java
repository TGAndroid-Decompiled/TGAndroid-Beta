package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16195a;
    public final ImageLoader.HttpImageTask f16196b;
    public final long f16197c;
    public final long d;

    public g5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f16195a = i10;
        this.f16196b = httpImageTask;
        this.f16197c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16195a) {
            case 0:
                this.f16196b.lambda$reportProgress$0(this.f16197c, this.d);
                return;
            default:
                this.f16196b.lambda$reportProgress$1(this.f16197c, this.d);
                return;
        }
    }
}
