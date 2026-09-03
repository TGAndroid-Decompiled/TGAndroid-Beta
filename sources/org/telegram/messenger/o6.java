package org.telegram.messenger;
public final class o6 implements Runnable {
    public final int f17968a;
    public final MediaController f17969b;
    public final boolean f17970c;

    public o6(MediaController mediaController, boolean z4, int i10) {
        this.f17968a = i10;
        this.f17969b = mediaController;
        this.f17970c = z4;
    }

    @Override
    public final void run() {
        switch (this.f17968a) {
            case 0:
                this.f17969b.lambda$toggleRecordingPause$28(this.f17970c);
                return;
            default:
                this.f17969b.lambda$toggleRecordingPause$32(this.f17970c);
                return;
        }
    }
}
