package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f17445a;
    public final ImageLoader.HttpImageTask f17446b;

    public d5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17445a = i10;
        this.f17446b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17445a) {
            case 0:
                this.f17446b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17446b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17446b.lambda$onPostExecute$5();
                return;
            default:
                this.f17446b.lambda$onCancelled$7();
                return;
        }
    }
}
