package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f20203a;
    public final ImageLoader.HttpImageTask f20204b;

    public f5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f20203a = i10;
        this.f20204b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f20203a) {
            case 0:
                this.f20204b.lambda$onCancelled$6();
                return;
            case 1:
                this.f20204b.lambda$onCancelled$8();
                return;
            case 2:
                this.f20204b.lambda$onPostExecute$5();
                return;
            default:
                this.f20204b.lambda$onCancelled$7();
                return;
        }
    }
}
