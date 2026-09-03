package g6;

import b6.m;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f6975k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.j(7), new Object());

    public final Task f(n... nVarArr) {
        boolean z4;
        if (nVarArr.length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        m.a("Please provide at least one OptionalModuleApi.", z4);
        for (n nVar : nVarArr) {
            m.i(nVar, "Requested API must not be null.");
        }
        a e6 = a.e(Arrays.asList(nVarArr), false);
        if (e6.f6969a.isEmpty()) {
            return Tasks.forResult(new f6.a(0, true));
        }
        v e10 = w.e();
        e10.d = new y5.c[]{y6.b.f50829c};
        e10.f2822a = 27301;
        e10.f2823b = false;
        e10.f2824c = new y5.h(this, e6);
        return e(0, e10.e());
    }
}
