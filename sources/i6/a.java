package i6;

import a8.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.q1;
import com.google.android.gms.internal.clearcut.v0;
public final class a {
    public static final e f12711j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f12712a;
    public final String f12713b;
    public final int f12714c;
    public final String d;
    public final int e;
    public final q1 f12715f;
    public final v0 f12716g;
    public final u6.a h;
    public final c2 f12717i;

    public a(Context context) {
        ?? jVar = new j(context, f12711j, (com.google.android.gms.common.api.a) null, (s) new Object());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f12715f = q1Var;
        this.f12712a = context;
        this.f12713b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f12714c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f12716g = jVar;
        this.h = u6.a.f47594a;
        this.f12715f = q1Var;
        this.f12717i = c2Var;
    }
}
