package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class l5 implements Runnable {
    public final int f20563a;
    public final ImageLoader.HttpImageTask f20564b;

    public l5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f20563a = i10;
        this.f20564b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f20563a) {
            case 0:
                this.f20564b.lambda$onCancelled$6();
                return;
            case 1:
                this.f20564b.lambda$onCancelled$8();
                return;
            case 2:
                this.f20564b.lambda$onPostExecute$5();
                return;
            default:
                this.f20564b.lambda$onCancelled$7();
                return;
        }
    }
}
