package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class m5 implements Runnable {
    public final int f20646a;
    public final ImageLoader.HttpImageTask f20647b;
    public final Boolean f20648c;

    public m5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f20646a = i10;
        this.f20647b = httpImageTask;
        this.f20648c = bool;
    }

    @Override
    public final void run() {
        switch (this.f20646a) {
            case 0:
                this.f20647b.lambda$onPostExecute$3(this.f20648c);
                return;
            default:
                this.f20647b.lambda$onPostExecute$4(this.f20648c);
                return;
        }
    }
}
