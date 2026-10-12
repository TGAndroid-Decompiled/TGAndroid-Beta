package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f17382a;
    public final MediaController f17383b;
    public final int f17384c;

    public d6(MediaController mediaController, int i10, int i11) {
        this.f17382a = i11;
        this.f17383b = mediaController;
        this.f17384c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17382a) {
            case 0:
                this.f17383b.lambda$onAudioFocusChange$5(this.f17384c);
                return;
            default:
                this.f17383b.lambda$stopRecording$43(this.f17384c);
                return;
        }
    }
}
