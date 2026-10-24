package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class a7 implements Runnable {
    public final int f17904a;
    public final MediaController.MediaLoader f17905b;

    public a7(MediaController.MediaLoader mediaLoader, int i10) {
        this.f17904a = i10;
        this.f17905b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                MediaController.MediaLoader.k(this.f17905b);
                return;
            case 1:
                MediaController.MediaLoader.h(this.f17905b);
                return;
            case 2:
                MediaController.MediaLoader.f(this.f17905b);
                return;
            case 3:
                MediaController.MediaLoader.d(this.f17905b);
                return;
            default:
                MediaController.MediaLoader.l(this.f17905b);
                return;
        }
    }
}
