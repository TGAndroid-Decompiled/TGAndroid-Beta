package defpackage;

import java.io.File;
public final class r2c implements fn7 {
    public final String a;
    public final jn7 b;
    public final r47 c;

    public r2c(String str, jn7 jn7Var, r47 r47Var, rb2 rb2Var) {
        this.a = str;
        this.b = jn7Var;
        this.c = r47Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (!this.a.equals(objArr[0])) {
            return;
        }
        jn7 jn7Var = this.b;
        int i3 = jn7.Y1;
        jn7Var.n(this, i3);
        jn7Var.n(this, jn7.Z1);
        r47 r47Var = this.c;
        if (i == i3 && objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof File) {
                u2c.y(r47Var, ((File) obj).getAbsolutePath());
                return;
            }
        }
        u2c.n(r47Var);
    }
}
