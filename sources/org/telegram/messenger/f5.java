package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f17809a;
    public final ImageLoader.HttpImageTask f17810b;

    public f5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f17809a = i10;
        this.f17810b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f17809a) {
            case 0:
                this.f17810b.lambda$onCancelled$6();
                return;
            case 1:
                this.f17810b.lambda$onCancelled$8();
                return;
            case 2:
                this.f17810b.lambda$onPostExecute$5();
                return;
            default:
                this.f17810b.lambda$onCancelled$7();
                return;
        }
    }
}
