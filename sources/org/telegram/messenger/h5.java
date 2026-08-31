package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class h5 implements Runnable {
    public final int f18824a;
    public final ImageLoader.HttpImageTask f18825b;
    public final Boolean f18826c;

    public h5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18824a = i10;
        this.f18825b = httpImageTask;
        this.f18826c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18824a) {
            case 0:
                this.f18825b.lambda$onPostExecute$3(this.f18826c);
                return;
            default:
                this.f18825b.lambda$onPostExecute$4(this.f18826c);
                return;
        }
    }
}
