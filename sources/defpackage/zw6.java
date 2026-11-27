package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
public final class zw6 {
    public static final Object c = new Object();
    public static final HashMap d = new HashMap();
    public final yx6 a;
    public vw6 b;

    public zw6(Context context, String str, dg8 dg8Var, j99 j99Var, j99 j99Var2, j99 j99Var3, sjf sjfVar, Bundle bundle, Bundle bundle2, xj0 xj0Var) {
        synchronized (c) {
            HashMap hashMap = d;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
        }
        this.a = new yx6(this, context, str, dg8Var, j99Var, j99Var2, j99Var3, sjfVar, bundle, bundle2, xj0Var);
    }
}
