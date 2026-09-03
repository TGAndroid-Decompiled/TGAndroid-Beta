package g6;

import b6.m;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import o5.i;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f6481k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.j(7), new Object());

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
        a e = a.e(Arrays.asList(nVarArr), false);
        if (e.f6475a.isEmpty()) {
            return Tasks.forResult(new f6.a(0, true));
        }
        v e6 = w.e();
        e6.d = new y5.c[]{y6.b.f47197c};
        e6.f2866a = 27301;
        e6.f2867b = false;
        e6.f2868c = new i(this, e);
        return e(0, e6.e());
    }
}
