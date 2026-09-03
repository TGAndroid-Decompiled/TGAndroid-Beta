package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f18233a;
    public final MediaController f18234b;
    public final int f18235c;

    public b6(MediaController mediaController, int i10, int i11) {
        this.f18233a = i11;
        this.f18234b = mediaController;
        this.f18235c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18233a) {
            case 0:
                MediaController.o(this.f18234b, this.f18235c);
                return;
            default:
                MediaController.O(this.f18234b, this.f18235c);
                return;
        }
    }
}
