package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wr0 implements gk7 {
    public final long a;
    public final gk7[] b;
    public final int c;
    public final tr0 d;

    public wr0(long j, gk7[] gk7VarArr, int i, tr0 tr0Var) {
        this.a = j;
        this.b = gk7VarArr;
        this.c = i;
        this.d = tr0Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vf6 vf6Var;
        int i3 = kk7.v0;
        if (i == i3 && (vf6Var = (vf6) objArr[0]) != null) {
            long j = this.a;
            if (vf6Var.d(j)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vf6Var.f(j);
                gk7[] gk7VarArr = this.b;
                if (gk7VarArr[0] != null) {
                    kk7.f(this.c).n(gk7VarArr[0], i3);
                    gk7VarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
