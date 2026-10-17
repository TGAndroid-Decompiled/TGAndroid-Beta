package h2;
public final class k extends Thread {
    public final l f11638a;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f11638a = lVar;
    }

    @Override
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.f11638a.j());
    }
}
