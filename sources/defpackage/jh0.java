package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
public abstract class jh0 extends BasePendingResult implements kh0 {
    public final xo o;
    public final zo p;

    public jh0(zo zoVar, z3d z3dVar) {
        super(z3dVar);
        ite.i(z3dVar, "GoogleApiClient must not be null");
        ite.i(zoVar, "Api must not be null");
        this.o = zoVar.b;
        this.p = zoVar;
    }

    public abstract void n(zz4 zz4Var);

    public final void o(Status status) {
        ite.a("Failed result must not be success", !status.b());
        a(d(status));
    }
}
