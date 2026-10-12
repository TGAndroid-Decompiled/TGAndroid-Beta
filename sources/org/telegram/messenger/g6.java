package org.telegram.messenger;
public final class g6 implements Runnable {
    public final int f17655a;
    public final MediaController f17656b;
    public final boolean f17657c;

    public g6(MediaController mediaController, boolean z10, int i10) {
        this.f17655a = i10;
        this.f17656b = mediaController;
        this.f17657c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17655a) {
            case 0:
                this.f17656b.lambda$toggleRecordingPause$29(this.f17657c);
                return;
            default:
                this.f17656b.lambda$toggleRecordingPause$33(this.f17657c);
                return;
        }
    }
}
