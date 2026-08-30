package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17277a;
    public final ImageLoader.HttpImageTask f17278b;

    public g5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17277a = i10;
        this.f17278b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17277a) {
            case 0:
                this.f17278b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17278b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17278b.lambda$onPostExecute$5();
                return;
            default:
                this.f17278b.lambda$onCancelled$7();
                return;
        }
    }
}
