package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f26745a;
    public final zf f26746b;
    public final cd f26747c;

    public sc(zf zfVar, cd cdVar, int i7) {
        this.f26745a = i7;
        this.f26746b = zfVar;
        this.f26747c = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f26745a) {
            case 0:
                this.f26746b.run();
                this.f26747c.a();
                return;
            default:
                this.f26746b.run();
                this.f26747c.a();
                return;
        }
    }
}
