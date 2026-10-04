package c1;

import w0.i;
public final class a implements Runnable {
    public final int f3931a;
    public final e f3932b;
    public final i f3933c;

    public a(e eVar, i iVar, int i10) {
        this.f3931a = i10;
        this.f3932b = eVar;
        this.f3933c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f3931a) {
            case 0:
                this.f3932b.e().onError(this.f3933c);
                return;
            case 1:
                this.f3932b.e().onError(this.f3933c);
                return;
            default:
                this.f3932b.e().onError(this.f3933c);
                return;
        }
    }
}
