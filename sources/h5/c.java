package h5;
public final class c {
    public boolean f6933a;

    public synchronized void a() {
        boolean z4 = false;
        while (!this.f6933a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void b() {
        this.f6933a = false;
    }

    public synchronized boolean c() {
        if (this.f6933a) {
            return false;
        }
        this.f6933a = true;
        notifyAll();
        return true;
    }
}
