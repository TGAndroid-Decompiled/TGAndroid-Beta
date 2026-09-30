package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f16274a;
    public final ImageLoader.HttpImageTask f16275b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f16274a = i10;
        this.f16275b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f16274a) {
            case 0:
                this.f16275b.lambda$onCancelled$6();
                return;
            case 1:
                this.f16275b.lambda$onCancelled$8();
                return;
            case 2:
                this.f16275b.lambda$onPostExecute$5();
                return;
            default:
                this.f16275b.lambda$onCancelled$7();
                return;
        }
    }
}
