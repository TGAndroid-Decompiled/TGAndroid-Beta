package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class e5 implements Runnable {
    public final int f16235a;
    public final ImageLoader.HttpImageTask f16236b;

    public e5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f16235a = i10;
        this.f16236b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f16235a) {
            case 0:
                this.f16236b.lambda$onCancelled$6();
                return;
            case 1:
                this.f16236b.lambda$onCancelled$8();
                return;
            case 2:
                this.f16236b.lambda$onPostExecute$5();
                return;
            default:
                this.f16236b.lambda$onCancelled$7();
                return;
        }
    }
}
