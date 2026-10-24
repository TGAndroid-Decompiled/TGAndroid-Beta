package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f18474a;
    public final MediaController f18475b;
    public final int f18476c;

    public g6(MediaController mediaController, int i10, int i11) {
        this.f18474a = i11;
        this.f18475b = mediaController;
        this.f18476c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18474a) {
            case 0:
                this.f18475b.lambda$onAudioFocusChange$5(this.f18476c);
                return;
            default:
                this.f18475b.lambda$stopRecording$45(this.f18476c);
                return;
        }
    }
}
