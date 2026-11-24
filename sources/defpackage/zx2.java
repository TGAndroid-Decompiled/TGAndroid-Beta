package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
public final class zx2 {
    public final w53 a;
    public final mv6 b;

    public zx2(w53 w53Var, jb4 jb4Var) {
        this.a = w53Var;
        this.b = new mv6(jb4Var);
    }

    public final String a(String str) {
        String substring;
        mv6 mv6Var = this.b;
        synchronized (mv6Var) {
            if (Objects.equals((String) mv6Var.c, str)) {
                return (String) mv6Var.d;
            }
            yx2 yx2Var = mv6.n;
            File file = new File((File) ((jb4) mv6Var.b).d, str);
            file.mkdirs();
            List e = jb4.e(file.listFiles(yx2Var));
            if (e.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(e, mv6.r)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void b(String str) {
        mv6 mv6Var = this.b;
        synchronized (mv6Var) {
            if (!Objects.equals((String) mv6Var.c, str)) {
                mv6.a0((jb4) mv6Var.b, str, (String) mv6Var.d);
                mv6Var.c = str;
            }
        }
    }
}
