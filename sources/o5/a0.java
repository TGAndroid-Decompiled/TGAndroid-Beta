package o5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.s {
    public final int f19222a = 1;
    public final e0 f19223b;
    public final String f19224c;
    public final f d;

    public a0(e0 e0Var, String str, q5.h hVar) {
        this.f19223b = e0Var;
        this.f19224c = str;
        this.d = hVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f19222a) {
            case 0:
                boolean z10 = true;
                if (this.f19223b.F == 1) {
                    z10 = false;
                }
                z5.l.j("Not active connection", z10);
                if (this.d != null) {
                    s5.f fVar = (s5.f) xVar.u();
                    Parcel M0 = fVar.M0();
                    M0.writeString(this.f19224c);
                    fVar.R0(M0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f19223b.F == 1) {
                    z11 = false;
                }
                z5.l.j("Not active connection", z11);
                s5.f fVar2 = (s5.f) xVar.u();
                Parcel M02 = fVar2.M0();
                String str = this.f19224c;
                M02.writeString(str);
                fVar2.R0(M02, 12);
                if (this.d != null) {
                    s5.f fVar3 = (s5.f) xVar.u();
                    Parcel M03 = fVar3.M0();
                    M03.writeString(str);
                    fVar3.R0(M03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, f fVar, String str) {
        this.f19223b = e0Var;
        this.d = fVar;
        this.f19224c = str;
    }
}
