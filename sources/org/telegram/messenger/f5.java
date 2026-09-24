package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class f5 implements Runnable {
    public final int f16323a;
    public final ImageLoader.HttpImageTask f16324b;
    public final Boolean f16325c;

    public f5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f16323a = i10;
        this.f16324b = httpImageTask;
        this.f16325c = bool;
    }

    @Override
    public final void run() {
        switch (this.f16323a) {
            case 0:
                this.f16324b.lambda$onPostExecute$3(this.f16325c);
                return;
            default:
                this.f16324b.lambda$onPostExecute$4(this.f16325c);
                return;
        }
    }
}
