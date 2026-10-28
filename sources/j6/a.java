package j6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b8.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.o1;
public final class a {
    public static final e f15515j = new e("ClearcutLogger.API", new d(5), new Object());
    public final Context f15516a;
    public final String f15517b;
    public final int f15518c;
    public final String d;
    public final int e;
    public final o1 f15519f;
    public final a6.a f15520g;
    public final v6.a h;
    public final a2 f15521i;

    public a(Context context) {
        ?? jVar = new j(context, f15515j, (com.google.android.gms.common.api.a) null, (s) new Object());
        a2 a2Var = new a2(context);
        this.e = -1;
        o1 o1Var = o1.DEFAULT;
        this.f15519f = o1Var;
        this.f15516a = context;
        this.f15517b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f15518c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f15520g = jVar;
        this.h = v6.a.f50108a;
        this.f15519f = o1Var;
        this.f15521i = a2Var;
    }
}
