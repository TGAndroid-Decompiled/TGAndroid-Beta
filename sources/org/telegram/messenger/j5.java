package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18740a;
    public final ImageLoader.HttpImageTask f18741b;

    public j5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18740a = i10;
        this.f18741b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18740a) {
            case 0:
                this.f18741b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18741b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18741b.lambda$onPostExecute$5();
                return;
            default:
                this.f18741b.lambda$onCancelled$7();
                return;
        }
    }
}
