package c2;

import android.os.Bundle;
import android.util.Log;
public final class x0 {
    public final y0 f2919a;

    public x0(y0 y0Var) {
        this.f2919a = y0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        y0 y0Var = this.f2919a;
        y0Var.f2925g = string;
        y0Var.h = bundle.getString("transferableTitle");
    }
}
