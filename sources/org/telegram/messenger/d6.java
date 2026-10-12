package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f17381a;
    public final MediaController f17382b;
    public final int f17383c;

    public d6(MediaController mediaController, int i10, int i11) {
        this.f17381a = i11;
        this.f17382b = mediaController;
        this.f17383c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17381a) {
            case 0:
                this.f17382b.lambda$onAudioFocusChange$5(this.f17383c);
                return;
            default:
                this.f17382b.lambda$stopRecording$43(this.f17383c);
                return;
        }
    }
}
