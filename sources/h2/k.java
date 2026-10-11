package h2;
public final class k extends Thread {
    public final l f10988a;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10988a = lVar;
    }

    @Override
    public final void run() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (this.f10988a.j());
    }
}
