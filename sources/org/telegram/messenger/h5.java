package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18497a;
    public final ImageLoader.HttpImageTask f18498b;

    public h5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18497a = i10;
        this.f18498b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18497a) {
            case 0:
                this.f18498b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18498b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18498b.lambda$onPostExecute$5();
                return;
            default:
                this.f18498b.lambda$onCancelled$7();
                return;
        }
    }
}
