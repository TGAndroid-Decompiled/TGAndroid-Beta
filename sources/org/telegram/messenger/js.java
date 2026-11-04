package org.telegram.messenger;
public final class js implements Runnable {
    public final int f23705a;
    public final us f23706b;
    public final long f23707c;
    public final long d;

    public js(us usVar, long j10, long j11, int i3) {
        this.f23705a = i3;
        this.f23706b = usVar;
        this.f23707c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f23705a) {
            case 0:
                us usVar = this.f23706b;
                usVar.G = this.f23707c;
                usVar.H = this.d;
                return;
            default:
                this.f23706b.o(this.f23707c, this.d);
                return;
        }
    }
}
