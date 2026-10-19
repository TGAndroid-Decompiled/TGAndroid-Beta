package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18659a;
    public final ImageLoader.HttpImageTask f18660b;
    public final Boolean f18661c;

    public j5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18659a = i10;
        this.f18660b = httpImageTask;
        this.f18661c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18659a) {
            case 0:
                this.f18660b.lambda$onPostExecute$3(this.f18661c);
                return;
            default:
                this.f18660b.lambda$onPostExecute$4(this.f18661c);
                return;
        }
    }
}
