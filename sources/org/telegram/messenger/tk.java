package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19100a;
    public final TopicsController f19101b;
    public final long f19102c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f19100a = i10;
        this.f19101b = topicsController;
        this.f19102c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19100a) {
            case 0:
                TopicsController.o(this.f19101b, this.f19102c);
                return;
            default:
                TopicsController.y(this.f19101b, this.f19102c);
                return;
        }
    }
}
