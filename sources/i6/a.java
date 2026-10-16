package i6;

import a8.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.p1;
import com.google.android.gms.internal.clearcut.u0;
public final class a {
    public static final e f11326j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f11327a;
    public final String f11328b;
    public final int f11329c;
    public final String d;
    public final int e;
    public final p1 f11330f;
    public final u0 f11331g;
    public final u6.a h;
    public final b2 f11332i;

    public a(Context context) {
        ?? jVar = new j(context, f11326j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f11330f = p1Var;
        this.f11327a = context;
        this.f11328b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f11329c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f11331g = jVar;
        this.h = u6.a.f46208a;
        this.f11330f = p1Var;
        this.f11332i = b2Var;
    }
}
