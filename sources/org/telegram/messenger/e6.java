package org.telegram.messenger;
public final class e6 implements Runnable {
    public final int f18249a;
    public final MediaController f18250b;
    public final int f18251c;

    public e6(MediaController mediaController, int i10, int i11) {
        this.f18249a = i11;
        this.f18250b = mediaController;
        this.f18251c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18249a) {
            case 0:
                this.f18250b.lambda$onAudioFocusChange$5(this.f18251c);
                return;
            default:
                this.f18250b.lambda$stopRecording$43(this.f18251c);
                return;
        }
    }
}
