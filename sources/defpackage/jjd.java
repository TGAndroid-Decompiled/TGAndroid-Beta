package defpackage;
public final class jjd implements Runnable {
    public final tod a;
    public final ymd b;

    public jjd(tod todVar, ymd ymdVar) {
        this.a = todVar;
        this.b = ymdVar;
    }

    @Override
    public final void run() {
        if (this.a.a == this) {
            ymd ymdVar = this.b;
            if (akd.h.f(this.a, this, tod.h(ymdVar))) {
                tod.j(this.a);
            }
        }
    }
}
