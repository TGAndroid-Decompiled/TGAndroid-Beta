package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f17259a;
    public final ImageLoader.HttpImageTask f17260b;

    public g5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17259a = i10;
        this.f17260b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17259a) {
            case 0:
                this.f17260b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17260b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17260b.lambda$onPostExecute$5();
                return;
            default:
                this.f17260b.lambda$onCancelled$7();
                return;
        }
    }
}
