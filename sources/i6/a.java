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
    public static final e f11862j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f11863a;
    public final String f11864b;
    public final int f11865c;
    public final String d;
    public final int f11866e;
    public final p1 f11867f;
    public final u0 f11868g;
    public final u6.a h;
    public final b2 f11869i;

    public a(Context context) {
        ?? jVar = new j(context, f11862j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.f11866e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f11867f = p1Var;
        this.f11863a = context;
        this.f11864b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f11865c = i10;
        this.f11866e = -1;
        this.d = "VISION";
        this.f11868g = jVar;
        this.h = u6.a.f46951a;
        this.f11867f = p1Var;
        this.f11869i = b2Var;
    }
}
