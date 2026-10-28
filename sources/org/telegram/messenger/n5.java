package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class n5 implements Runnable {
    public final int f20737a;
    public final ImageLoader.HttpImageTask f20738b;
    public final Boolean f20739c;

    public n5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f20737a = i10;
        this.f20738b = httpImageTask;
        this.f20739c = bool;
    }

    @Override
    public final void run() {
        switch (this.f20737a) {
            case 0:
                this.f20738b.lambda$onPostExecute$3(this.f20739c);
                return;
            default:
                this.f20738b.lambda$onPostExecute$4(this.f20739c);
                return;
        }
    }
}
