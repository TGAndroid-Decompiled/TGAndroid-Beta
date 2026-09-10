package org.telegram.messenger;
public final class f6 implements Runnable {
    public final int f15143a;
    public final MediaController f15144b;
    public final int f15145c;

    public f6(MediaController mediaController, int i10, int i11) {
        this.f15143a = i11;
        this.f15144b = mediaController;
        this.f15145c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15143a) {
            case 0:
                this.f15144b.lambda$onAudioFocusChange$5(this.f15145c);
                return;
            default:
                this.f15144b.lambda$stopRecording$42(this.f15145c);
                return;
        }
    }
}
