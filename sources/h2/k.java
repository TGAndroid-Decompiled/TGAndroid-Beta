package h2;
public final class k extends Thread {
    public final l f11640a;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f11640a = lVar;
    }

    @Override
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.f11640a.j());
    }
}
