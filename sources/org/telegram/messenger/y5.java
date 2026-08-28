package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f22210a;
    public final MediaController f22211b;
    public final int f22212c;

    public y5(MediaController mediaController, int i9, int i10) {
        this.f22210a = i10;
        this.f22211b = mediaController;
        this.f22212c = i9;
    }

    @Override
    public final void run() {
        switch (this.f22210a) {
            case 0:
                this.f22211b.lambda$onAudioFocusChange$5(this.f22212c);
                return;
            default:
                this.f22211b.lambda$stopRecording$42(this.f22212c);
                return;
        }
    }
}
