package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f17175a;
    public final boolean[] f17176b;
    public final Runnable[] f17177c;

    public bd(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17175a = i10;
        this.f17176b = zArr;
        this.f17177c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17175a) {
            case 0:
                MessagesController.P7(this.f17176b, this.f17177c);
                return;
            default:
                PasskeysController.j(this.f17176b, this.f17177c);
                return;
        }
    }
}
