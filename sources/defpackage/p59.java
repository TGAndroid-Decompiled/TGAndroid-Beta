package defpackage;

import android.os.Bundle;
import android.util.Log;
public final class p59 {
    public final q59 a;

    public p59(q59 q59Var) {
        this.a = q59Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        q59 q59Var = this.a;
        q59Var.g = string;
        q59Var.h = bundle.getString("transferableTitle");
    }
}
