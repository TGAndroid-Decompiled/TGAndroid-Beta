package h5;
public final class c {
    public boolean f6920a;

    public synchronized void a() {
        boolean z4 = false;
        while (!this.f6920a) {
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
        this.f6920a = false;
    }

    public synchronized boolean c() {
        if (this.f6920a) {
            return false;
        }
        this.f6920a = true;
        notifyAll();
        return true;
    }
}
