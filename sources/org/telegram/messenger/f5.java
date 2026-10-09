package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17806a;
    public final ImageLoader.HttpImageTask f17807b;

    public f5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17806a = i10;
        this.f17807b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17806a) {
            case 0:
                this.f17807b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17807b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17807b.lambda$onPostExecute$5();
                return;
            default:
                this.f17807b.lambda$onCancelled$7();
                return;
        }
    }
}
