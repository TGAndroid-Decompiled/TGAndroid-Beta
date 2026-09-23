package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f15996a;
    public final ImageLoader.HttpImageTask f15997b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f15996a = i10;
        this.f15997b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f15996a) {
            case 0:
                this.f15997b.lambda$onCancelled$6();
                return;
            case 1:
                this.f15997b.lambda$onCancelled$8();
                return;
            case 2:
                this.f15997b.lambda$onPostExecute$5();
                return;
            default:
                this.f15997b.lambda$onCancelled$7();
                return;
        }
    }
}
