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
    public static final e f12743j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f12744a;
    public final String f12745b;
    public final int f12746c;
    public final String d;
    public final int e;
    public final q1 f12747f;
    public final v0 f12748g;
    public final u6.a h;
    public final c2 f12749i;

    public a(Context context) {
        ?? jVar = new j(context, f12743j, (com.google.android.gms.common.api.a) null, (s) new Object());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f12747f = q1Var;
        this.f12744a = context;
        this.f12745b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f12746c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f12748g = jVar;
        this.h = u6.a.f48045a;
        this.f12747f = q1Var;
        this.f12749i = c2Var;
    }
}
