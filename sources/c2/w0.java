package c2;

import android.os.Bundle;
import android.util.Log;
public final class w0 {
    public final x0 f2044a;

    public w0(x0 x0Var) {
        this.f2044a = x0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        x0 x0Var = this.f2044a;
        x0Var.f2046g = string;
        x0Var.h = bundle.getString("transferableTitle");
    }
}
