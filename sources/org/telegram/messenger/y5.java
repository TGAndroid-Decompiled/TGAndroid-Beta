package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19707a;
    public final MediaController f19708b;
    public final int f19709c;

    public y5(MediaController mediaController, int i10, int i11) {
        this.f19707a = i11;
        this.f19708b = mediaController;
        this.f19709c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19707a) {
            case 0:
                this.f19708b.lambda$onAudioFocusChange$5(this.f19709c);
                return;
            default:
                this.f19708b.lambda$stopRecording$42(this.f19709c);
                return;
        }
    }
}
