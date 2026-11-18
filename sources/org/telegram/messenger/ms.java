package org.telegram.messenger;
public final class ms implements Runnable {
    public final int f25833a;
    public final xs f25834b;
    public final long f25835c;
    public final long d;

    public ms(xs xsVar, long j3, long j10, int i7) {
        this.f25833a = i7;
        this.f25834b = xsVar;
        this.f25835c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f25833a) {
            case 0:
                xs xsVar = this.f25834b;
                xsVar.G = this.f25835c;
                xsVar.H = this.d;
                return;
            default:
                this.f25834b.o(this.f25835c, this.d);
                return;
        }
    }
}
