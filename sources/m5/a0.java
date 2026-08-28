package m5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.s {
    public final int f17361a = 1;
    public final f0 f17362b;
    public final String f17363c;
    public final f d;

    public a0(f0 f0Var, String str, o5.h hVar) {
        this.f17362b = f0Var;
        this.f17363c = str;
        this.d = hVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        q5.x xVar = (q5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f17361a) {
            case 0:
                boolean z10 = true;
                if (this.f17362b.F == 1) {
                    z10 = false;
                }
                x5.l.j("Not active connection", z10);
                if (this.d != null) {
                    q5.f fVar = (q5.f) xVar.u();
                    Parcel M0 = fVar.M0();
                    M0.writeString(this.f17363c);
                    fVar.R0(M0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f17362b.F == 1) {
                    z11 = false;
                }
                x5.l.j("Not active connection", z11);
                q5.f fVar2 = (q5.f) xVar.u();
                Parcel M02 = fVar2.M0();
                String str = this.f17363c;
                M02.writeString(str);
                fVar2.R0(M02, 12);
                if (this.d != null) {
                    q5.f fVar3 = (q5.f) xVar.u();
                    Parcel M03 = fVar3.M0();
                    M03.writeString(str);
                    fVar3.R0(M03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(f0 f0Var, f fVar, String str) {
        this.f17362b = f0Var;
        this.d = fVar;
        this.f17363c = str;
    }
}
