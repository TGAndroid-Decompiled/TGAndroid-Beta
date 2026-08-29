package e6;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import m5.i;
import z5.l;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f5835k = new com.google.android.gms.common.api.e("ModuleInstall.API", new b6.b(3), new Object());

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
        if (b10.f5829a.isEmpty()) {
            return Tasks.forResult(new d6.a(0, true));
        }
        v b11 = w.b();
        b11.d = new w5.c[]{w6.b.f49793c};
        b11.f3926a = 27301;
        b11.f3927b = false;
        b11.f3928c = new i(this, b10);
        return e(0, b11.b());
    }
}
