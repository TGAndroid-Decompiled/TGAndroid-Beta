package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17546a;
    public final ImageLoader.HttpImageTask f17547b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17546a = i10;
        this.f17547b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17546a) {
            case 0:
                this.f17547b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17547b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17547b.lambda$onPostExecute$5();
                return;
            default:
                this.f17547b.lambda$onCancelled$7();
                return;
        }
    }
}
