package defpackage;
public abstract class vkd implements Cloneable {
    public final xkd a;
    public xkd b;
    public boolean c = false;

    public vkd(xkd xkdVar) {
        this.a = xkdVar;
        this.b = (xkd) xkdVar.a(4);
    }

    public final void a(xkd xkdVar) {
        b();
        xkd xkdVar2 = this.b;
        wvd wvdVar = wvd.c;
        wvdVar.getClass();
        wvdVar.a(xkdVar2.getClass()).d(xkdVar2, xkdVar);
    }

    public final void b() {
        if (this.c) {
            xkd xkdVar = (xkd) this.b.a(4);
            xkd xkdVar2 = this.b;
            wvd wvdVar = wvd.c;
            wvdVar.getClass();
            wvdVar.a(xkdVar.getClass()).d(xkdVar, xkdVar2);
            this.b = xkdVar;
            this.c = false;
        }
    }

    public final xkd c() {
        boolean z = this.c;
        xkd xkdVar = this.b;
        if (z) {
            return xkdVar;
        }
        wvd wvdVar = wvd.c;
        wvdVar.getClass();
        wvdVar.a(xkdVar.getClass()).b(xkdVar);
        this.c = true;
        return this.b;
    }

    public final Object clone() {
        vkd vkdVar = (vkd) this.a.a(5);
        vkdVar.a(c());
        return vkdVar;
    }
}
