package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f18408a;
    public final MediaController f18409b;
    public final int f18410c;

    public g6(MediaController mediaController, int i10, int i11) {
        this.f18408a = i11;
        this.f18409b = mediaController;
        this.f18410c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18408a) {
            case 0:
                this.f18409b.lambda$onAudioFocusChange$5(this.f18410c);
                return;
            default:
                this.f18409b.lambda$stopRecording$45(this.f18410c);
                return;
        }
    }
}
