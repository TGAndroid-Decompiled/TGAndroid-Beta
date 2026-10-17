package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18501a;
    public final ImageLoader.HttpImageTask f18502b;

    public h5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18501a = i10;
        this.f18502b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18501a) {
            case 0:
                this.f18502b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18502b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18502b.lambda$onPostExecute$5();
                return;
            default:
                this.f18502b.lambda$onCancelled$7();
                return;
        }
    }
}
