package org.telegram.messenger;
public final class jl implements Runnable {
    public final int f15563a;
    public final TranslateController f15564b;
    public final long f15565c;

    public jl(TranslateController translateController, long j3, int i10) {
        this.f15563a = i10;
        this.f15564b = translateController;
        this.f15565c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15563a) {
            case 0:
                TranslateController.G(this.f15564b, this.f15565c);
                return;
            default:
                TranslateController.p(this.f15564b, this.f15565c);
                return;
        }
    }
}
