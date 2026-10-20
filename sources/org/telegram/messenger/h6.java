package org.telegram.messenger;
public final class h6 implements Runnable {
    public final int f18514a;
    public final MediaController f18515b;
    public final boolean f18516c;

    public h6(MediaController mediaController, boolean z10, int i10) {
        this.f18514a = i10;
        this.f18515b = mediaController;
        this.f18516c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18514a) {
            case 0:
                this.f18515b.lambda$toggleRecordingPause$29(this.f18516c);
                return;
            default:
                this.f18515b.lambda$toggleRecordingPause$33(this.f18516c);
                return;
        }
    }
}
