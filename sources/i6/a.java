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
    public static final e f11888j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f11889a;
    public final String f11890b;
    public final int f11891c;
    public final String d;
    public final int f11892e;
    public final p1 f11893f;
    public final u0 f11894g;
    public final u6.a h;
    public final b2 f11895i;

    public a(Context context) {
        ?? jVar = new j(context, f11888j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.f11892e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f11893f = p1Var;
        this.f11889a = context;
        this.f11890b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f11891c = i10;
        this.f11892e = -1;
        this.d = "VISION";
        this.f11894g = jVar;
        this.h = u6.a.f46979a;
        this.f11893f = p1Var;
        this.f11895i = b2Var;
    }
}
