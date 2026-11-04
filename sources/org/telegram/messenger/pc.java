package org.telegram.messenger;
public final class pc implements Runnable {
    public final int f24723a;
    public final bd f24724b;
    public final int f24725c;

    public pc(bd bdVar, int i3, int i10) {
        this.f24723a = i10;
        this.f24724b = bdVar;
        this.f24725c = i3;
    }

    @Override
    public final void run() {
        switch (this.f24723a) {
            case 0:
                bd bdVar = this.f24724b;
                bdVar.P = false;
                bdVar.j(this.f24725c);
                return;
            case 1:
                bd bdVar2 = this.f24724b;
                bdVar2.P = false;
                bdVar2.j(this.f24725c);
                return;
            case 2:
                this.f24724b.Z0(this.f24725c, null, true, null);
                return;
            default:
                this.f24724b.Z0(this.f24725c, null, true, null);
                return;
        }
    }
}
