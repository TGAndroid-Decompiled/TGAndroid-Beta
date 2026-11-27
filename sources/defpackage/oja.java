package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
public final class oja {
    public final w73 a;
    public final pja b;
    public final Context c;
    public final String d;
    public final tgb e;
    public final LinkedHashSet f;

    public oja(Context context, String str, Set set, w73 w73Var, pja pjaVar) {
        LinkedHashSet linkedHashSet;
        set.getClass();
        yj8 yj8Var = new yj8((byte) 1, context, str);
        this.a = w73Var;
        this.b = pjaVar;
        this.c = context;
        this.d = str;
        this.e = new tgb(yj8Var);
        if (set == rja.a) {
            linkedHashSet = null;
        } else {
            linkedHashSet = new LinkedHashSet(set);
        }
        this.f = linkedHashSet;
    }

    public final java.lang.Object a(java.lang.Object r5, defpackage.ax2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oja.a(java.lang.Object, ax2):java.lang.Object");
    }
}
