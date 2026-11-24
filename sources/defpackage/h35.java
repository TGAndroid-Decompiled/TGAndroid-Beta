package defpackage;

import org.telegram.tgnet.TLRPC;
public final class h35 implements i35 {
    public final boolean[] a;
    public final rvc b;

    public h35(boolean[] zArr, rvc rvcVar) {
        this.a = zArr;
        this.b = rvcVar;
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
        rvc rvcVar = this.b;
        rvcVar.b.b(4, null, rvcVar.c);
    }

    public final void d(TLRPC.WidgetQueryType widgetQueryType) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        rvc rvcVar = this.b;
        vvc.w(rvcVar.a, rvcVar.b, rvcVar.c, widgetQueryType, rvcVar.d);
    }
}
