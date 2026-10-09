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
    public static final e f12017j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f12018a;
    public final String f12019b;
    public final int f12020c;
    public final String d;
    public final int f12021e;
    public final p1 f12022f;
    public final u0 f12023g;
    public final u6.a h;
    public final b2 f12024i;

    public a(Context context) {
        ?? jVar = new j(context, f12017j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.f12021e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f12022f = p1Var;
        this.f12018a = context;
        this.f12019b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f12020c = i10;
        this.f12021e = -1;
        this.d = "VISION";
        this.f12023g = jVar;
        this.h = u6.a.f48852a;
        this.f12022f = p1Var;
        this.f12024i = b2Var;
    }
}
