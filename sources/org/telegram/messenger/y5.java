package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19734a;
    public final MediaController f19735b;
    public final int f19736c;

    public y5(MediaController mediaController, int i10, int i11) {
        this.f19734a = i11;
        this.f19735b = mediaController;
        this.f19736c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19734a) {
            case 0:
                this.f19735b.lambda$onAudioFocusChange$5(this.f19736c);
                return;
            default:
                this.f19735b.lambda$stopRecording$42(this.f19736c);
                return;
        }
    }
}
