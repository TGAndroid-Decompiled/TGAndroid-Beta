package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
public final class t8c {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static t8c c;
    public final c6e a;

    public t8c(c6e c6eVar) {
        this.a = c6eVar;
    }

    public final boolean a(ga0 ga0Var) {
        if (!TextUtils.isEmpty(ga0Var.c)) {
            this.a.getClass();
            if (ga0Var.f + ga0Var.e < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
