package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19031a;
    public final dd f19032b;
    public final int f19033c;

    public wc(dd ddVar, int i10, int i11) {
        this.f19031a = i11;
        this.f19032b = ddVar;
        this.f19033c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19031a) {
            case 0:
                dd ddVar = this.f19032b;
                ddVar.P = false;
                ddVar.j(this.f19033c);
                return;
            case 1:
                dd ddVar2 = this.f19032b;
                ddVar2.P = false;
                ddVar2.j(this.f19033c);
                return;
            case 2:
                this.f19032b.W0(this.f19033c, null, true, null);
                return;
            default:
                this.f19032b.W0(this.f19033c, null, true, null);
                return;
        }
    }
}
