package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class m5 implements Runnable {
    public final int f19005a;
    public final ImageLoader.HttpImageTask f19006b;
    public final long f19007c;
    public final long d;

    public m5(ImageLoader.HttpImageTask httpImageTask, long j10, long j11, int i10) {
        this.f19005a = i10;
        this.f19006b = httpImageTask;
        this.f19007c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19005a) {
            case 0:
                this.f19006b.lambda$reportProgress$0(this.f19007c, this.d);
                return;
            default:
                this.f19006b.lambda$reportProgress$1(this.f19007c, this.d);
                return;
        }
    }
}
