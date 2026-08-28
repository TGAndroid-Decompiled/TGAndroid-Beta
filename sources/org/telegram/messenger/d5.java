package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f20048a;
    public final ImageLoader.HttpImageTask f20049b;

    public d5(ImageLoader.HttpImageTask httpImageTask, int i9) {
        this.f20048a = i9;
        this.f20049b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f20048a) {
            case 0:
                this.f20049b.lambda$onCancelled$6();
                return;
            case 1:
                this.f20049b.lambda$onCancelled$8();
                return;
            case 2:
                this.f20049b.lambda$onPostExecute$5();
                return;
            default:
                this.f20049b.lambda$onCancelled$7();
                return;
        }
    }
}
