package org.telegram.messenger;
public final class r6 implements Runnable {
    public final int f16200a;
    public final MediaController f16201b;
    public final boolean f16202c;

    public r6(MediaController mediaController, boolean z10, int i10) {
        this.f16200a = i10;
        this.f16201b = mediaController;
        this.f16202c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16200a) {
            case 0:
                this.f16201b.lambda$toggleRecordingPause$28(this.f16202c);
                return;
            default:
                this.f16201b.lambda$toggleRecordingPause$32(this.f16202c);
                return;
        }
    }
}
