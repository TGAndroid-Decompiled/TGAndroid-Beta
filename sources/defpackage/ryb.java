package defpackage;

import java.io.File;
public final class ryb implements gk7 {
    public final String a;
    public final kk7 b;
    public final k27 c;

    public ryb(String str, kk7 kk7Var, k27 k27Var, bb2 bb2Var) {
        this.a = str;
        this.b = kk7Var;
        this.c = k27Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (!this.a.equals(objArr[0])) {
            return;
        }
        kk7 kk7Var = this.b;
        int i3 = kk7.X1;
        kk7Var.n(this, i3);
        kk7Var.n(this, kk7.Y1);
        k27 k27Var = this.c;
        if (i == i3 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                uyb.y(k27Var, ((File) obj).getAbsolutePath());
                return;
            }
        }
        uyb.n(k27Var);
    }
}
