package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
public final class uu6 {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public final tv6 a;
    public qu6 b;

    public uu6(Context context, String str, oc8 oc8Var, w59 w59Var, w59 w59Var2, w59 w59Var3, cff cffVar, Bundle bundle, Bundle bundle2, wj0 wj0Var) {
        synchronized (c) {
            HashMap hashMap = d;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
        }
        this.a = new tv6(this, context, str, oc8Var, w59Var, w59Var2, w59Var3, cffVar, bundle, bundle2, wj0Var);
    }
}
