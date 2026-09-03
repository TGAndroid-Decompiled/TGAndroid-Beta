package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f18732a;
    public final ImageLoader.HttpImageTask f18733b;

    public g5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18732a = i10;
        this.f18733b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18732a) {
            case 0:
                this.f18733b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18733b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18733b.lambda$onPostExecute$5();
                return;
            default:
                this.f18733b.lambda$onCancelled$7();
                return;
        }
    }
}
