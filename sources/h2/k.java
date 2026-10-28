package h2;
public final class k extends Thread {
    public final l f12572a;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f12572a = lVar;
    }

    @Override
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.f12572a.j());
    }
}
