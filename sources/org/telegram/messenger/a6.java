package org.telegram.messenger;

public final class a6 implements Runnable {

    public final int f19678a;

    public final MediaController f19679b;

    public final int f19680c;

    public a6(MediaController mediaController, int i10, int i11) {
        this.f19678a = i11;
        this.f19679b = mediaController;
        this.f19680c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19678a) {
            case 0:
                this.f19679b.lambda$onAudioFocusChange$5(this.f19680c);
                break;
            default:
                this.f19679b.lambda$stopRecording$42(this.f19680c);
                break;
        }
    }
}
