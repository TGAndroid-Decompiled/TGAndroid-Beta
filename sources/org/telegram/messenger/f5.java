package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16327a;
    public final ImageLoader.HttpImageTask f16328b;
    public final Boolean f16329c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16327a = i10;
        this.f16328b = httpImageTask;
        this.f16329c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16327a) {
            case 0:
                this.f16328b.lambda$onPostExecute$3(this.f16329c);
                return;
            default:
                this.f16328b.lambda$onPostExecute$4(this.f16329c);
                return;
        }
    }
}
