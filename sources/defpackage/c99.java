package defpackage;

import android.os.Bundle;
import android.util.Log;
public final class c99 {
    public final d99 a;

    public c99(d99 d99Var) {
        this.a = d99Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        d99 d99Var = this.a;
        d99Var.g = string;
        d99Var.h = bundle.getString("transferableTitle");
    }
}
