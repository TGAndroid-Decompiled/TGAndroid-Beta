package org.telegram.messenger;
public final class i6 implements Runnable {
    public final int f20309a;
    public final MediaController f20310b;
    public final int f20311c;

    public i6(MediaController mediaController, int i10, int i11) {
        this.f20309a = i11;
        this.f20310b = mediaController;
        this.f20311c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20309a) {
            case 0:
                this.f20310b.lambda$onAudioFocusChange$5(this.f20311c);
                return;
            default:
                this.f20310b.lambda$stopRecording$45(this.f20311c);
                return;
        }
    }
}
