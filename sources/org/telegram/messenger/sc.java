package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f26428a;
    public final mg f26429b;
    public final cd f26430c;

    public sc(mg mgVar, cd cdVar, int i7) {
        this.f26428a = i7;
        this.f26429b = mgVar;
        this.f26430c = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f26428a) {
            case 0:
                this.f26429b.run();
                this.f26430c.a();
                return;
            default:
                this.f26429b.run();
                this.f26430c.a();
                return;
        }
    }
}
