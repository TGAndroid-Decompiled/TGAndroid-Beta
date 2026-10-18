package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f18153a;
    public final MediaController f18154b;
    public final int f18155c;

    public d6(MediaController mediaController, int i10, int i11) {
        this.f18153a = i11;
        this.f18154b = mediaController;
        this.f18155c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18153a) {
            case 0:
                this.f18154b.lambda$onAudioFocusChange$5(this.f18155c);
                return;
            default:
                this.f18154b.lambda$stopRecording$43(this.f18155c);
                return;
        }
    }
}
