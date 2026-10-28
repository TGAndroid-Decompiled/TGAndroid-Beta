package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class m5 implements Runnable {
    public final int f20660a;
    public final ImageLoader.HttpImageTask f20661b;

    public m5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f20660a = i10;
        this.f20661b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f20660a) {
            case 0:
                this.f20661b.lambda$onCancelled$6();
                return;
            case 1:
                this.f20661b.lambda$onCancelled$8();
                return;
            case 2:
                this.f20661b.lambda$onPostExecute$5();
                return;
            default:
                this.f20661b.lambda$onCancelled$7();
                return;
        }
    }
}
