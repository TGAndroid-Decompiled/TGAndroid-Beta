package d5;

public final class c {

    public boolean f4779a;

    public synchronized void a() {
        boolean z10 = false;
        while (!this.f4779a) {
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
        this.f4779a = false;
    }

    public synchronized boolean c() {
        if (this.f4779a) {
            return false;
        }
        this.f4779a = true;
        notifyAll();
        return true;
    }
}
