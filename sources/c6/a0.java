package c6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.s {
    public final int f3840a = 0;
    public final e0 f3841b;
    public final String f3842c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f3841b = e0Var;
        this.d = fVar;
        this.f3842c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f3840a) {
            case 0:
                boolean z10 = true;
                if (this.f3841b.F == 1) {
                    z10 = false;
                }
                n6.l.i("Not active connection", z10);
                if (this.d != null) {
                    g6.f fVar = (g6.f) wVar.v();
                    Parcel P0 = fVar.P0();
                    P0.writeString(this.f3842c);
                    fVar.U0(P0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f3841b.F == 1) {
                    z11 = false;
                }
                n6.l.i("Not active connection", z11);
                g6.f fVar2 = (g6.f) wVar.v();
                Parcel P02 = fVar2.P0();
                String str = this.f3842c;
                P02.writeString(str);
                fVar2.U0(P02, 12);
                if (this.d != null) {
                    g6.f fVar3 = (g6.f) wVar.v();
                    Parcel P03 = fVar3.P0();
                    P03.writeString(str);
                    fVar3.U0(P03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, e6.h hVar) {
        this.f3841b = e0Var;
        this.f3842c = str;
        this.d = hVar;
    }
}
