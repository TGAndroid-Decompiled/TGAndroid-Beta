package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class j5 implements Runnable {
    public final int f18656a;
    public final ImageLoader.HttpImageTask f18657b;
    public final Boolean f18658c;

    public j5(ImageLoader.HttpImageTask httpImageTask, Boolean bool, int i10) {
        this.f18656a = i10;
        this.f18657b = httpImageTask;
        this.f18658c = bool;
    }

    @Override
    public final void run() {
        switch (this.f18656a) {
            case 0:
                this.f18657b.lambda$onPostExecute$3(this.f18658c);
                return;
            default:
                this.f18657b.lambda$onPostExecute$4(this.f18658c);
                return;
        }
    }
}
