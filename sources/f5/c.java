package f5;
public final class c {
    public boolean f6575a;

    public synchronized void a() {
        boolean z10 = false;
        while (!this.f6575a) {
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
        this.f6575a = false;
    }

    public synchronized boolean c() {
        if (this.f6575a) {
            return false;
        }
        this.f6575a = true;
        notifyAll();
        return true;
    }
}
