package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16338a;
    public final ImageLoader.HttpImageTask f16339b;
    public final Boolean f16340c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16338a = i10;
        this.f16339b = httpImageTask;
        this.f16340c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16338a) {
            case 0:
                this.f16339b.lambda$onPostExecute$3(this.f16340c);
                return;
            default:
                this.f16339b.lambda$onPostExecute$4(this.f16340c);
                return;
        }
    }
}
