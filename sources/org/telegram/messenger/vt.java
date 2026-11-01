package org.telegram.messenger;
public final class vt implements Runnable {
    public final int f18900a;
    public final k20 f18901b;
    public final Exception f18902c;

    public vt(k20 k20Var, Exception exc, int i10) {
        this.f18900a = i10;
        this.f18901b = k20Var;
        this.f18902c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18900a) {
            case 0:
                this.f18901b.a(null, this.f18902c.getMessage());
                return;
            default:
                this.f18901b.a(null, this.f18902c.getMessage());
                return;
        }
    }
}
