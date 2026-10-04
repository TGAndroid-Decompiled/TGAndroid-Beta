package i6;

import a8.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.q1;
import com.google.android.gms.internal.clearcut.v0;
public final class a {
    public static final e f11967j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f11968a;
    public final String f11969b;
    public final int f11970c;
    public final String d;
    public final int f11971e;
    public final q1 f11972f;
    public final v0 f11973g;
    public final u6.a h;
    public final c2 f11974i;

    public a(Context context) {
        ?? jVar = new j(context, f11967j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.f11971e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f11972f = q1Var;
        this.f11968a = context;
        this.f11969b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f11970c = i10;
        this.f11971e = -1;
        this.d = "VISION";
        this.f11973g = jVar;
        this.h = u6.a.f47550a;
        this.f11972f = q1Var;
        this.f11974i = c2Var;
    }
}
