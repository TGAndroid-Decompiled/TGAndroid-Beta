package d6;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import y5.l;

public final class g extends j {

    public static final com.google.android.gms.common.api.e f4867k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a6.b(3), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        l.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            l.i(nVar, "Requested API must not be null.");
        }
        a aVarB = a.b(Arrays.asList(nVarArr), false);
        if (aVarB.f4861a.isEmpty()) {
            return Tasks.forResult(new c6.a(0, true));
        }
        v vVarB = w.b();
        vVarB.d = new v5.c[]{v6.b.f48818c};
        vVarB.f3357a = 27301;
        vVarB.f3358b = false;
        vVarB.f3359c = new ga.c(this, aVarB, 10);
        return e(0, vVarB.b());
    }
}
