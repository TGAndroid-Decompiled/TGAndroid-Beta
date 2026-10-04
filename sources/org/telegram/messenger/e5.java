package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17720a;
    public final ImageLoader.HttpImageTask f17721b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17720a = i10;
        this.f17721b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17720a) {
            case 0:
                this.f17721b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17721b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17721b.lambda$onPostExecute$5();
                return;
            default:
                this.f17721b.lambda$onCancelled$7();
                return;
        }
    }
}
