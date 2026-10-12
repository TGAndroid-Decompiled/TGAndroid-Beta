package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f17053a;
    public final MediaController f17054b;
    public final int f17055c;

    public d6(MediaController mediaController, int i10, int i11) {
        this.f17053a = i11;
        this.f17054b = mediaController;
        this.f17055c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17053a) {
            case 0:
                this.f17054b.lambda$onAudioFocusChange$5(this.f17055c);
                return;
            default:
                this.f17054b.lambda$stopRecording$43(this.f17055c);
                return;
        }
    }
}
