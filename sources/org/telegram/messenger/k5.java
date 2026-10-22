package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18750a;
    public final ImageLoader.HttpImageTask f18751b;

    public k5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18750a = i10;
        this.f18751b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18750a) {
            case 0:
                this.f18751b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18751b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18751b.lambda$onPostExecute$5();
                return;
            default:
                this.f18751b.lambda$onCancelled$7();
                return;
        }
    }
}
