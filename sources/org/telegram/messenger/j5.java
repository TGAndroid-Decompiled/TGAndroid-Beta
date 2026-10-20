package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18666a;
    public final ImageLoader.HttpImageTask f18667b;

    public j5(ImageLoader.HttpImageTask httpImageTask, int i10) {
        this.f18666a = i10;
        this.f18667b = httpImageTask;
    }

    @Override
    public final void run() {
        switch (this.f18666a) {
            case 0:
                this.f18667b.lambda$onCancelled$6();
                return;
            case 1:
                this.f18667b.lambda$onCancelled$8();
                return;
            case 2:
                this.f18667b.lambda$onPostExecute$5();
                return;
            default:
                this.f18667b.lambda$onCancelled$7();
                return;
        }
    }
}
