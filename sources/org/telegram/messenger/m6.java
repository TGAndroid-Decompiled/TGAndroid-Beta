package org.telegram.messenger;
public final class m6 implements Runnable {
    public final int f18494a;
    public final MediaController f18495b;
    public final boolean f18496c;

    public m6(MediaController mediaController, boolean z10, int i10) {
        this.f18494a = i10;
        this.f18495b = mediaController;
        this.f18496c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18494a) {
            case 0:
                this.f18495b.lambda$toggleRecordingPause$28(this.f18496c);
                return;
            default:
                this.f18495b.lambda$toggleRecordingPause$32(this.f18496c);
                return;
        }
    }
}
