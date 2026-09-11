package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17233a;
    public final MediaDataController f17234b;
    public final boolean f17235c;

    public b8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f17233a = i10;
        this.f17234b = mediaDataController;
        this.f17235c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17233a) {
            case 0:
                MediaDataController.S2(this.f17234b, this.f17235c);
                return;
            default:
                MediaDataController.N1(this.f17234b, this.f17235c);
                return;
        }
    }
}
