package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18500a;
    public final ImageLoader.HttpImageTask f18501b;

    public h5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18500a = i10;
        this.f18501b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18500a) {
            case 0:
                this.f18501b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18501b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18501b.lambda$onPostExecute$5();
                return;
            default:
                this.f18501b.lambda$onCancelled$7();
                return;
        }
    }
}
