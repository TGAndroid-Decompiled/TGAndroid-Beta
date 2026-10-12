package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f17465a;
    public final ImageLoader.HttpImageTask f17466b;

    public i5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17465a = i10;
        this.f17466b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17465a) {
            case 0:
                this.f17466b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17466b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17466b.lambda$onPostExecute$5();
                return;
            default:
                this.f17466b.lambda$onCancelled$7();
                return;
        }
    }
}
