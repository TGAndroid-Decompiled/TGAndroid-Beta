package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18236a;
    public final int f18237b;
    public final int f18238c;

    public kh(int i10, int i11, int i12) {
        this.f18236a = i12;
        this.f18237b = i10;
        this.f18238c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18236a) {
            case 0:
                PasskeysController.f(this.f18237b, this.f18238c);
                return;
            case 1:
                ConnectionsManager.A(this.f18237b, this.f18238c);
                return;
            case 2:
                ConnectionsManager.s(this.f18237b, this.f18238c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18237b).cancelRequest(this.f18238c, true);
                return;
        }
    }
}
