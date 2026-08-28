package d5;
public final class c {
    public boolean f4335a;

    public synchronized void a() {
        boolean z10 = false;
        while (!this.f4335a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void b() {
        this.f4335a = false;
    }

    public synchronized boolean c() {
        if (this.f4335a) {
            return false;
        }
        this.f4335a = true;
        notifyAll();
        return true;
    }
}
