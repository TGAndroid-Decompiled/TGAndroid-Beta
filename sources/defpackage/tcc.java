package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
public final class tcc {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static tcc c;
    public final sae a;

    public tcc(sae saeVar) {
        this.a = saeVar;
    }

    public final boolean a(ia0 ia0Var) {
        if (!TextUtils.isEmpty(ia0Var.c)) {
            this.a.getClass();
            if (ia0Var.f + ia0Var.e < (System.currentTimeMillis() / 1000) + 3600) {
                return true;
            }
            return false;
        }
        return true;
    }
}
