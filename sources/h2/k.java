package h2;
public final class k extends Thread {
    public final l f10989a;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10989a = lVar;
    }

    @Override
    public final void run() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (this.f10989a.j());
    }
}
