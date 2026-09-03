package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f16807a;
    public final MediaController f16808b;
    public final int f16809c;

    public b6(MediaController mediaController, int i10, int i11) {
        this.f16807a = i11;
        this.f16808b = mediaController;
        this.f16809c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16807a) {
            case 0:
                MediaController.o(this.f16808b, this.f16809c);
                return;
            default:
                MediaController.O(this.f16808b, this.f16809c);
                return;
        }
    }
}
