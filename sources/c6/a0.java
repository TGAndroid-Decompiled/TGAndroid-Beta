package c6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.r {
    public final int f4809a = 0;
    public final e0 f4810b;
    public final String f4811c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f4810b = e0Var;
        this.d = fVar;
        this.f4811c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f4809a) {
            case 0:
                boolean z10 = true;
                if (this.f4810b.F == 1) {
                    z10 = false;
                }
                n6.l.j("Not active connection", z10);
                if (this.d != null) {
                    g6.f fVar = (g6.f) wVar.u();
                    Parcel N0 = fVar.N0();
                    N0.writeString(this.f4811c);
                    fVar.S0(N0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f4810b.F == 1) {
                    z11 = false;
                }
                n6.l.j("Not active connection", z11);
                g6.f fVar2 = (g6.f) wVar.u();
                Parcel N02 = fVar2.N0();
                String str = this.f4811c;
                N02.writeString(str);
                fVar2.S0(N02, 12);
                if (this.d != null) {
                    g6.f fVar3 = (g6.f) wVar.u();
                    Parcel N03 = fVar3.N0();
                    N03.writeString(str);
                    fVar3.S0(N03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, e6.h hVar) {
        this.f4810b = e0Var;
        this.f4811c = str;
        this.d = hVar;
    }
}
