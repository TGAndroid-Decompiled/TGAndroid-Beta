package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class g5 implements Runnable {
    public final int f18730a;
    public final ImageLoader.HttpImageTask f18731b;

    public g5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18730a = i10;
        this.f18731b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18730a) {
            case 0:
                this.f18731b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18731b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18731b.lambda$onPostExecute$5();
                return;
            default:
                this.f18731b.lambda$onCancelled$7();
                return;
        }
    }
}
