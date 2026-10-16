package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f16986a;
    public final ImageLoader.HttpFileTask f16987b;
    public final long f16988c;
    public final long d;

    public g5(ImageLoader.HttpFileTask httpFileTask, long j10, long j11, int i10) {
        this.f16986a = i10;
        this.f16987b = httpFileTask;
        this.f16988c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f16986a) {
            case 0:
                this.f16987b.lambda$reportProgress$0(this.f16988c, this.d);
                return;
            default:
                this.f16987b.lambda$reportProgress$1(this.f16988c, this.d);
                return;
        }
    }
}
