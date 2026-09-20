package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f16236a;
    public final ImageLoader.HttpImageTask f16237b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f16236a = i10;
        this.f16237b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f16236a) {
            case 0:
                this.f16237b.lambda$onCancelled$6();
                return;
            case 1:
                this.f16237b.lambda$onCancelled$8();
                return;
            case 2:
                this.f16237b.lambda$onPostExecute$5();
                return;
            default:
                this.f16237b.lambda$onCancelled$7();
                return;
        }
    }
}
