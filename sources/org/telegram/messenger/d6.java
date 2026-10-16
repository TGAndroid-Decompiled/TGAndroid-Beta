package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f16750a;
    public final MediaController f16751b;
    public final int f16752c;

    public d6(MediaController mediaController, int i10, int i11) {
        this.f16750a = i11;
        this.f16751b = mediaController;
        this.f16752c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16750a) {
            case 0:
                this.f16751b.lambda$onAudioFocusChange$5(this.f16752c);
                return;
            default:
                this.f16751b.lambda$stopRecording$43(this.f16752c);
                return;
        }
    }
}
