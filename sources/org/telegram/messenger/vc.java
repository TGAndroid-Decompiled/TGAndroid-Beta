package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f18509a;
    public final cd f18510b;
    public final int f18511c;

    public vc(cd cdVar, int i10, int i11) {
        this.f18509a = i11;
        this.f18510b = cdVar;
        this.f18511c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18509a) {
            case 0:
                cd cdVar = this.f18510b;
                cdVar.P = false;
                cdVar.j(this.f18511c);
                return;
            case 1:
                cd cdVar2 = this.f18510b;
                cdVar2.P = false;
                cdVar2.j(this.f18511c);
                return;
            case 2:
                this.f18510b.W0(this.f18511c, null, true, null);
                return;
            default:
                this.f18510b.W0(this.f18511c, null, true, null);
                return;
        }
    }
}
