package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f26781a;
    public final zf f26782b;
    public final cd f26783c;

    public sc(zf zfVar, cd cdVar, int i7) {
        this.f26781a = i7;
        this.f26782b = zfVar;
        this.f26783c = cdVar;
    }

    @Override
    public final void run() {
        switch (this.f26781a) {
            case 0:
                this.f26782b.run();
                this.f26783c.a();
                return;
            default:
                this.f26782b.run();
                this.f26783c.a();
                return;
        }
    }
}
