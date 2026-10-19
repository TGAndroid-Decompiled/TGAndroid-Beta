package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f18156a;
    public final MediaController f18157b;
    public final int f18158c;

    public d6(MediaController mediaController, int i10, int i11) {
        this.f18156a = i11;
        this.f18157b = mediaController;
        this.f18158c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18156a) {
            case 0:
                this.f18157b.lambda$onAudioFocusChange$5(this.f18158c);
                return;
            default:
                this.f18157b.lambda$stopRecording$43(this.f18158c);
                return;
        }
    }
}
