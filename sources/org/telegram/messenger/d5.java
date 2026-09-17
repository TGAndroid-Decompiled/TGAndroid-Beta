package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f17472a;
    public final ImageLoader.HttpImageTask f17473b;

    public d5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17472a = i10;
        this.f17473b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17472a) {
            case 0:
                this.f17473b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17473b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17473b.lambda$onPostExecute$5();
                return;
            default:
                this.f17473b.lambda$onCancelled$7();
                return;
        }
    }
}
