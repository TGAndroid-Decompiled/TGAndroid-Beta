package l6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b9.k0;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.o1;
import w7.s;
public final class a {
    public static final e f19311j = new e("ClearcutLogger.API", new a9.e(8), new Object());
    public final Context f19312a;
    public final String f19313b;
    public final int f19314c;
    public final String d;
    public final int f19315e;
    public final o1 f19316f;
    public final k0 f19317g;
    public final x6.a h;
    public final a2 f19318i;

    public a(Context context) {
        ?? jVar = new j(context, f19311j, (com.google.android.gms.common.api.a) null, new s(6));
        a2 a2Var = new a2(context);
        this.f19315e = -1;
        o1 o1Var = o1.DEFAULT;
        this.f19316f = o1Var;
        this.f19312a = context;
        this.f19313b = context.getPackageName();
        int i7 = 0;
        try {
            i7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.f19314c = i7;
        this.f19315e = -1;
        this.d = "VISION";
        this.f19317g = jVar;
        this.h = x6.a.f59824a;
        this.f19316f = o1Var;
        this.f19318i = a2Var;
    }
}
