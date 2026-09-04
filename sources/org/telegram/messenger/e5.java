package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f17519a;
    public final ImageLoader.HttpImageTask f17520b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17519a = i10;
        this.f17520b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17519a) {
            case 0:
                this.f17520b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17520b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17520b.lambda$onPostExecute$5();
                return;
            default:
                this.f17520b.lambda$onCancelled$7();
                return;
        }
    }
}
