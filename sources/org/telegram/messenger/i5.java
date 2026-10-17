package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class i5 implements Runnable {
    public final int f18567a;
    public final ImageLoader.HttpImageTask f18568b;
    public final Boolean f18569c;

    public i5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18567a = i10;
        this.f18568b = httpImageTask;
        this.f18569c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18567a) {
            case 0:
                this.f18568b.lambda$onPostExecute$3(this.f18569c);
                return;
            default:
                this.f18568b.lambda$onPostExecute$4(this.f18569c);
                return;
        }
    }
}
