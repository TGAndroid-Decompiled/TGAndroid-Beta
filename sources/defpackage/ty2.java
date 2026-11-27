package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class ty2 {
    public final p63 a;
    public final rx6 b;

    public ty2(p63 p63Var, gd4 gd4Var) {
        this.a = p63Var;
        this.b = new rx6(gd4Var);
    }

    public final String a(String str) {
        String substring;
        rx6 rx6Var = this.b;
        synchronized (rx6Var) {
            if (Objects.equals((String) rx6Var.c, str)) {
                return (String) rx6Var.d;
            }
            sy2 sy2Var = rx6.n;
            File file = new File((File) ((gd4) rx6Var.b).d, str);
            file.mkdirs();
            List e = gd4.e(file.listFiles(sy2Var));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, rx6.r)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        rx6 rx6Var = this.b;
        synchronized (rx6Var) {
            if (!Objects.equals((String) rx6Var.c, str)) {
                rx6.d0((gd4) rx6Var.b, str, (String) rx6Var.d);
                rx6Var.c = str;
            }
        }
    }
}
