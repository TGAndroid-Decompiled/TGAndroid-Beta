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
    public static final e f11000j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f11001a;
    public final String f11002b;
    public final int f11003c;
    public final String d;
    public final int e;
    public final q1 f11004f;
    public final v0 f11005g;
    public final u6.a h;
    public final c2 f11006i;

    public a(Context context) {
        ?? jVar = new j(context, f11000j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f11004f = q1Var;
        this.f11001a = context;
        this.f11002b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f11003c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f11005g = jVar;
        this.h = u6.a.f43947a;
        this.f11004f = q1Var;
        this.f11006i = c2Var;
    }
}
