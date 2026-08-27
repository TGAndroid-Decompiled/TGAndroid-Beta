package c2;

import android.os.Bundle;
import android.util.Log;

public final class v0 {

    public final w0 f2353a;

    public v0(w0 w0Var) {
        this.f2353a = w0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        w0 w0Var = this.f2353a;
        w0Var.f2359g = string;
        w0Var.h = bundle.getString("transferableTitle");
    }
}
