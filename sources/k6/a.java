package k6;

import a9.j0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.o1;
public final class a {
    public static final e f16880j = new e("ClearcutLogger.API", new a6.b(6), new Object());
    public final Context f16881a;
    public final String f16882b;
    public final int f16883c;
    public final String d;
    public final int f16884e;
    public final o1 f16885f;
    public final j0 f16886g;
    public final w6.a h;
    public final a2 f16887i;

    public a(Context context) {
        ?? jVar = new j(context, f16880j, (com.google.android.gms.common.api.a) null, new mb.b(5));
        a2 a2Var = new a2(context);
        this.f16884e = -1;
        o1 o1Var = o1.DEFAULT;
        this.f16885f = o1Var;
        this.f16881a = context;
        this.f16882b = context.getPackageName();
        int i3 = 0;
        try {
            i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.f16883c = i3;
        this.f16884e = -1;
        this.d = "VISION";
        this.f16886g = jVar;
        this.h = w6.a.f57390a;
        this.f16885f = o1Var;
        this.f16887i = a2Var;
    }
}
