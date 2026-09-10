package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f15674a;
    public final ImageLoader.HttpImageTask f15675b;
    public final long f15676c;
    public final long d;

    public l5(ImageLoader.HttpImageTask httpImageTask, long j3, long j10, int i10) {
        this.f15674a = i10;
        this.f15675b = httpImageTask;
        this.f15676c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15674a) {
            case 0:
                this.f15675b.lambda$reportProgress$0(this.f15676c, this.d);
                return;
            default:
                this.f15675b.lambda$reportProgress$1(this.f15676c, this.d);
                return;
        }
    }
}
