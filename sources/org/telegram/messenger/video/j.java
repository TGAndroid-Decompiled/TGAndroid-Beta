package org.telegram.messenger.video;

public final class j implements Runnable {

    public final int f21849a;

    public final VideoPlayerHolderBase f21850b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f21849a = i10;
        this.f21850b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f21849a) {
            case 0:
                this.f21850b.lambda$new$13();
                break;
            case 1:
                this.f21850b.lambda$start$1();
                break;
            case 2:
                this.f21850b.lambda$new$14();
                break;
            case 3:
                this.f21850b.lambda$play$6();
                break;
            case 4:
                this.f21850b.lambda$pause$4();
                break;
            default:
                this.f21850b.lambda$loopBack$9();
                break;
        }
    }
}
