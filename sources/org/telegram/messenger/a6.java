package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f19674a;
    public final MediaController f19675b;
    public final int f19676c;

    public a6(MediaController mediaController, int i10, int i11) {
        this.f19674a = i11;
        this.f19675b = mediaController;
        this.f19676c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19674a) {
            case 0:
                MediaController.o(this.f19675b, this.f19676c);
                return;
            default:
                MediaController.O(this.f19675b, this.f19676c);
                return;
        }
    }
}
