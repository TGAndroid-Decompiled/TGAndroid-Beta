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
    public static final e f12015j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f12016a;
    public final String f12017b;
    public final int f12018c;
    public final String d;
    public final int f12019e;
    public final p1 f12020f;
    public final u0 f12021g;
    public final u6.a h;
    public final b2 f12022i;

    public a(Context context) {
        ?? jVar = new j(context, f12015j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.f12019e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f12020f = p1Var;
        this.f12016a = context;
        this.f12017b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f12018c = i10;
        this.f12019e = -1;
        this.d = "VISION";
        this.f12021g = jVar;
        this.h = u6.a.f49088a;
        this.f12020f = p1Var;
        this.f12022i = b2Var;
    }
}
