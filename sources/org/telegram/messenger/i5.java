package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f17844a;
    public final ImageLoader.HttpImageTask f17845b;

    public i5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17844a = i10;
        this.f17845b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17844a) {
            case 0:
                this.f17845b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17845b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17845b.lambda$onPostExecute$5();
                return;
            default:
                this.f17845b.lambda$onCancelled$7();
                return;
        }
    }
}
