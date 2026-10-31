package org.telegram.messenger;
public final class tb implements Runnable {
    public final int f18039a;
    public final ub f18040b;

    public tb(ub ubVar, int i10) {
        this.f18039a = i10;
        this.f18040b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f18039a) {
            case 0:
                this.f18040b.e.T(true);
                return;
            default:
                this.f18040b.e.T(true);
                return;
        }
    }
}
