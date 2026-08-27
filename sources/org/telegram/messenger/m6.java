package org.telegram.messenger;

public final class m6 implements Runnable {

    public final int f20942a;

    public final MediaController f20943b;

    public final boolean f20944c;

    public m6(MediaController mediaController, boolean z10, int i10) {
        this.f20942a = i10;
        this.f20943b = mediaController;
        this.f20944c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20942a) {
            case 0:
                this.f20943b.lambda$toggleRecordingPause$28(this.f20944c);
                break;
            default:
                this.f20943b.lambda$toggleRecordingPause$32(this.f20944c);
                break;
        }
    }
}
