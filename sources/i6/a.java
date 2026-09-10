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
    public static final e f10480j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f10481a;
    public final String f10482b;
    public final int f10483c;
    public final String d;
    public final int e;
    public final q1 f10484f;
    public final v0 f10485g;
    public final u6.a h;
    public final c2 f10486i;

    public a(Context context) {
        ?? jVar = new j(context, f10480j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f10484f = q1Var;
        this.f10481a = context;
        this.f10482b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f10483c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f10485g = jVar;
        this.h = u6.a.f42595a;
        this.f10484f = q1Var;
        this.f10486i = c2Var;
    }
}
