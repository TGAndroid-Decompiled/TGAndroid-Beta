package defpackage;

import org.telegram.tgnet.TLRPC;
public final class h55 implements i55 {
    public final boolean[] a;
    public final sxc b;

    public h55(boolean[] zArr, sxc sxcVar) {
        this.a = zArr;
        this.b = sxcVar;
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
        sxc sxcVar = this.b;
        sxcVar.b.b(4, null, sxcVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        sxc sxcVar = this.b;
        wxc.x(sxcVar.a, sxcVar.b, sxcVar.c, widgetQueryType, sxcVar.d);
    }
}
