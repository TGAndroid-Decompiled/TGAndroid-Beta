package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
public final class uac {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static uac c;
    public final f8e a;

    public uac(f8e f8eVar) {
        this.a = f8eVar;
    }

    public final boolean a(gb0 gb0Var) {
        if (!TextUtils.isEmpty(gb0Var.c)) {
            this.a.getClass();
            if (gb0Var.f + gb0Var.e < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
