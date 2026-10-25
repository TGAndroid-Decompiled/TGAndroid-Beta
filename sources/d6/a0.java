package d6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.r {
    public final int f8037a = 0;
    public final e0 f8038b;
    public final String f8039c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f8038b = e0Var;
        this.d = fVar;
        this.f8039c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        h6.w wVar = (h6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f8037a) {
            case 0:
                boolean z10 = true;
                if (this.f8038b.F == 1) {
                    z10 = false;
                }
                o6.l.j("Not active connection", z10);
                if (this.d != null) {
                    h6.f fVar = (h6.f) wVar.u();
                    Parcel N0 = fVar.N0();
                    N0.writeString(this.f8039c);
                    fVar.S0(N0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f8038b.F == 1) {
                    z11 = false;
                }
                o6.l.j("Not active connection", z11);
                h6.f fVar2 = (h6.f) wVar.u();
                Parcel N02 = fVar2.N0();
                String str = this.f8039c;
                N02.writeString(str);
                fVar2.S0(N02, 12);
                if (this.d != null) {
                    h6.f fVar3 = (h6.f) wVar.u();
                    Parcel N03 = fVar3.N0();
                    N03.writeString(str);
                    fVar3.S0(N03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, f6.h hVar) {
        this.f8038b = e0Var;
        this.f8039c = str;
        this.d = hVar;
    }
}
