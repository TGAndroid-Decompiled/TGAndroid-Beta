package org.telegram.messenger.video;

public final class p implements Runnable {

    public final int f21867a;

    public final long f21868b;

    public final Object f21869c;

    public p(Object obj, long j10, int i10) {
        this.f21867a = i10;
        this.f21869c = obj;
        this.f21868b = j10;
    }

    @Override
    public final void run() {
        switch (this.f21867a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f21869c).lambda$onError$0(this.f21868b);
                break;
            default:
                ((VideoPlayerHolderBase) this.f21869c).lambda$seekTo$11(this.f21868b);
                break;
        }
    }
}
