package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18577a;
    public final ImageLoader.HttpImageTask f18578b;

    public i5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18577a = i10;
        this.f18578b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18577a) {
            case 0:
                this.f18578b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18578b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18578b.lambda$onPostExecute$5();
                return;
            default:
                this.f18578b.lambda$onCancelled$7();
                return;
        }
    }
}
