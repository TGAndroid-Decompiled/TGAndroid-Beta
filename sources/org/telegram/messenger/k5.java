package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18035a;
    public final ImageLoader.HttpImageTask f18036b;
    public final long f18037c;
    public final long d;

    public k5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f18035a = i10;
        this.f18036b = httpImageTask;
        this.f18037c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18035a) {
            case 0:
                this.f18036b.lambda$reportProgress$0(this.f18037c, this.d);
                return;
            default:
                this.f18036b.lambda$reportProgress$1(this.f18037c, this.d);
                return;
        }
    }
}
