package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class k5 implements Runnable {
    public final int f18816a;
    public final ImageLoader.HttpImageTask f18817b;
    public final Boolean f18818c;

    public k5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18816a = i10;
        this.f18817b = httpImageTask;
        this.f18818c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18816a) {
            case 0:
                this.f18817b.lambda$onPostExecute$3(this.f18818c);
                return;
            default:
                this.f18817b.lambda$onPostExecute$4(this.f18818c);
                return;
        }
    }
}
