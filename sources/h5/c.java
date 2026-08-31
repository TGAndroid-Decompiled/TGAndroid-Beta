package h5;
public final class c {
    public boolean f7233a;

    public synchronized void a() {
        boolean z4 = false;
        while (!this.f7233a) {
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
        this.f7233a = false;
    }

    public synchronized boolean c() {
        if (this.f7233a) {
            return false;
        }
        this.f7233a = true;
        notifyAll();
        return true;
    }
}
