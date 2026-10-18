package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18574a;
    public final ImageLoader.HttpImageTask f18575b;

    public i5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18574a = i10;
        this.f18575b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18574a) {
            case 0:
                this.f18575b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18575b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18575b.lambda$onPostExecute$5();
                return;
            default:
                this.f18575b.lambda$onCancelled$7();
                return;
        }
    }
}
