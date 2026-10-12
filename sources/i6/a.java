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
    public static final e f11322j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f11323a;
    public final String f11324b;
    public final int f11325c;
    public final String d;
    public final int e;
    public final p1 f11326f;
    public final u0 f11327g;
    public final u6.a h;
    public final b2 f11328i;

    public a(Context context) {
        ?? jVar = new j(context, f11322j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f11326f = p1Var;
        this.f11323a = context;
        this.f11324b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f11325c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f11327g = jVar;
        this.h = u6.a.f46208a;
        this.f11326f = p1Var;
        this.f11328i = b2Var;
    }
}
