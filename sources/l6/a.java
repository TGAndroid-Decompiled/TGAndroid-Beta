package l6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b9.j0;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.p1;
import sa.d;
public final class a {
    public static final e f18178j = new e("ClearcutLogger.API", new a9.e(8), new Object());
    public final Context f18179a;
    public final String f18180b;
    public final int f18181c;
    public final String d;
    public final int f18182e;
    public final p1 f18183f;
    public final j0 f18184g;
    public final x6.a h;
    public final b2 f18185i;

    public a(Context context) {
        ?? jVar = new j(context, f18178j, (com.google.android.gms.common.api.a) null, new d(6));
        b2 b2Var = new b2(context);
        this.f18182e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f18183f = p1Var;
        this.f18179a = context;
        this.f18180b = context.getPackageName();
        int i7 = 0;
        try {
            i7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.f18181c = i7;
        this.f18182e = -1;
        this.d = "VISION";
        this.f18184g = jVar;
        this.h = x6.a.f58643a;
        this.f18183f = p1Var;
        this.f18185i = b2Var;
    }
}
