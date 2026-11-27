package defpackage;

import org.telegram.tgnet.TLRPC;
public final class es0 implements fn7 {
    public final long a;
    public final fn7[] b;
    public final int c;
    public final bs0 d;

    public es0(long j, fn7[] fn7VarArr, int i, bs0 bs0Var) {
        this.a = j;
        this.b = fn7VarArr;
        this.c = i;
        this.d = bs0Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        zh6 zh6Var;
        int i3 = jn7.w0;
        if (i == i3 && (zh6Var = (zh6) objArr[0]) != null) {
            long j = this.a;
            if (zh6Var.d(j)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) zh6Var.f(j);
                fn7[] fn7VarArr = this.b;
                if (fn7VarArr[0] != null) {
                    jn7.f(this.c).n(fn7VarArr[0], i3);
                    fn7VarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
