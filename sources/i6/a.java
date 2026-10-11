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
    public static final e f12016j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f12017a;
    public final String f12018b;
    public final int f12019c;
    public final String d;
    public final int f12020e;
    public final p1 f12021f;
    public final u0 f12022g;
    public final u6.a h;
    public final b2 f12023i;

    public a(Context context) {
        ?? jVar = new j(context, f12016j, (com.google.android.gms.common.api.a) null, (t) new Object());
        b2 b2Var = new b2(context);
        this.f12020e = -1;
        p1 p1Var = p1.DEFAULT;
        this.f12021f = p1Var;
        this.f12017a = context;
        this.f12018b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f12019c = i10;
        this.f12020e = -1;
        this.d = "VISION";
        this.f12022g = jVar;
        this.h = u6.a.f48939a;
        this.f12021f = p1Var;
        this.f12023i = b2Var;
    }
}
