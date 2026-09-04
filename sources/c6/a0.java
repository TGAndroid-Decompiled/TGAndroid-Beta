package c6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.s {
    public final int f4460a = 0;
    public final e0 f4461b;
    public final String f4462c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f4461b = e0Var;
        this.d = fVar;
        this.f4462c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f4460a) {
            case 0:
                boolean z10 = true;
                if (this.f4461b.F == 1) {
                    z10 = false;
                }
                n6.l.j("Not active connection", z10);
                if (this.d != null) {
                    g6.f fVar = (g6.f) wVar.u();
                    Parcel O0 = fVar.O0();
                    O0.writeString(this.f4462c);
                    fVar.T0(O0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f4461b.F == 1) {
                    z11 = false;
                }
                n6.l.j("Not active connection", z11);
                g6.f fVar2 = (g6.f) wVar.u();
                Parcel O02 = fVar2.O0();
                String str = this.f4462c;
                O02.writeString(str);
                fVar2.T0(O02, 12);
                if (this.d != null) {
                    g6.f fVar3 = (g6.f) wVar.u();
                    Parcel O03 = fVar3.O0();
                    O03.writeString(str);
                    fVar3.T0(O03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, e6.h hVar) {
        this.f4461b = e0Var;
        this.f4462c = str;
        this.d = hVar;
    }
}
