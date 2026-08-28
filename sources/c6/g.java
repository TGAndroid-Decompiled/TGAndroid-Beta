package c6;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import k5.i;
import x5.l;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f2323k = new com.google.android.gms.common.api.e("ModuleInstall.API", new b7.d(1), new Object());

    public final Task f(n... nVarArr) {
        boolean z10;
        if (nVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.a("Please provide at least one OptionalModuleApi.", z10);
        for (n nVar : nVarArr) {
            l.i(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.f2317a.isEmpty()) {
            return Tasks.forResult(new b6.a(0, true));
        }
        v b11 = w.b();
        b11.d = new u5.c[]{u6.b.f48133c};
        b11.f2912a = 27301;
        b11.f2913b = false;
        b11.f2914c = new i(this, b10, 7);
        return e(0, b11.b());
    }
}
