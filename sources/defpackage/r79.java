package defpackage;

import android.os.Bundle;
import android.util.Log;
public final class r79 {
    public final s79 a;

    public r79(s79 s79Var) {
        this.a = s79Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        s79 s79Var = this.a;
        s79Var.g = string;
        s79Var.h = bundle.getString("transferableTitle");
    }
}
