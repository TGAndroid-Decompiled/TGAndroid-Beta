package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f26438a;
    public final mg f26439b;
    public final cd f26440c;

    public sc(mg mgVar, cd cdVar, int i7) {
        this.f26438a = i7;
        this.f26439b = mgVar;
        this.f26440c = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f26438a) {
            case 0:
                this.f26439b.run();
                this.f26440c.a();
                return;
            default:
                this.f26439b.run();
                this.f26440c.a();
                return;
        }
    }
}
