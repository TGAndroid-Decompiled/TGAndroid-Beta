package org.telegram.messenger;
public final class h6 implements Runnable {
    public final int f20229a;
    public final MediaController f20230b;
    public final int f20231c;

    public h6(MediaController mediaController, int i10, int i11) {
        this.f20229a = i11;
        this.f20230b = mediaController;
        this.f20231c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20229a) {
            case 0:
                this.f20230b.lambda$onAudioFocusChange$5(this.f20231c);
                return;
            default:
                this.f20230b.lambda$stopRecording$45(this.f20231c);
                return;
        }
    }
}
