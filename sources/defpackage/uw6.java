package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
public final class uw6 {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public final tx6 a;
    public qw6 b;

    public uw6(Context context, String str, re8 re8Var, y79 y79Var, y79 y79Var2, y79 y79Var3, dhf dhfVar, Bundle bundle, Bundle bundle2, wk0 wk0Var) {
        synchronized (c) {
            HashMap hashMap = d;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
        }
        this.a = new tx6(this, context, str, re8Var, y79Var, y79Var2, y79Var3, dhfVar, bundle, bundle2, wk0Var);
    }
}
