package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f18231a;
    public final MediaController f18232b;
    public final int f18233c;

    public b6(MediaController mediaController, int i10, int i11) {
        this.f18231a = i11;
        this.f18232b = mediaController;
        this.f18233c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18231a) {
            case 0:
                MediaController.o(this.f18232b, this.f18233c);
                return;
            default:
                MediaController.O(this.f18232b, this.f18233c);
                return;
        }
    }
}
