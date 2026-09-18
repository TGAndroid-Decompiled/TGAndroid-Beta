package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f16195a;
    public final ImageLoader.HttpImageTask f16196b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f16195a = i10;
        this.f16196b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f16195a) {
            case 0:
                this.f16196b.lambda$onCancelled$6();
                return;
            case 1:
                this.f16196b.lambda$onCancelled$8();
                return;
            case 2:
                this.f16196b.lambda$onPostExecute$5();
                return;
            default:
                this.f16196b.lambda$onCancelled$7();
                return;
        }
    }
}
