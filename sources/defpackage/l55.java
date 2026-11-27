package defpackage;

import org.telegram.tgnet.TLRPC;
public final class l55 implements m55 {
    public final boolean[] a;
    public final g0d b;

    public l55(boolean[] zArr, g0d g0dVar) {
        this.a = zArr;
        this.b = g0dVar;
    }

    @Override
    public final void a() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.a();
    }

    @Override
    public final void b() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.b.b();
    }

    public final void c() {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        g0d g0dVar = this.b;
        g0dVar.b.b(4, null, g0dVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        g0d g0dVar = this.b;
        k0d.x(g0dVar.a, g0dVar.b, g0dVar.c, widgetQueryType, g0dVar.d);
    }
}
