package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class a7 implements Runnable {
    public final int f19596a;
    public final MediaController.MediaLoader f19597b;
    public final int f19598c;

    public a7(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19596a = i11;
        this.f19597b = mediaLoader;
        this.f19598c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19596a) {
            case 0:
                MediaController.MediaLoader.g(this.f19597b, this.f19598c);
                return;
            case 1:
                MediaController.MediaLoader.i(this.f19597b, this.f19598c);
                return;
            case 2:
                MediaController.MediaLoader.j(this.f19597b, this.f19598c);
                return;
            default:
                MediaController.MediaLoader.e(this.f19597b, this.f19598c);
                return;
        }
    }
}
