package defpackage;

import org.telegram.tgnet.TLRPC;
public final class et0 implements jm7 {
    public final long a;
    public final jm7[] b;
    public final int c;
    public final bt0 d;

    public et0(long j, jm7[] jm7VarArr, int i, bt0 bt0Var) {
        this.a = j;
        this.b = jm7VarArr;
        this.c = i;
        this.d = bt0Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vh6 vh6Var;
        int i3 = nm7.w0;
        if (i == i3 && (vh6Var = (vh6) objArr[0]) != null) {
            long j = this.a;
            if (vh6Var.d(j)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) vh6Var.f(j);
                jm7[] jm7VarArr = this.b;
                if (jm7VarArr[0] != null) {
                    nm7.f(this.c).n(jm7VarArr[0], i3);
                    jm7VarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
