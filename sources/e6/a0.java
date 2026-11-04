package e6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.p {
    public final int f9663a = 0;
    public final e0 f9664b;
    public final String f9665c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f9664b = e0Var;
        this.d = fVar;
        this.f9665c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        i6.w wVar = (i6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f9663a) {
            case 0:
                boolean z10 = true;
                if (this.f9664b.G == 1) {
                    z10 = false;
                }
                p6.m.i("Not active connection", z10);
                if (this.d != null) {
                    i6.f fVar = (i6.f) wVar.m();
                    Parcel P0 = fVar.P0();
                    P0.writeString(this.f9665c);
                    fVar.U0(P0, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f9664b.G == 1) {
                    z11 = false;
                }
                p6.m.i("Not active connection", z11);
                i6.f fVar2 = (i6.f) wVar.m();
                Parcel P02 = fVar2.P0();
                String str = this.f9665c;
                P02.writeString(str);
                fVar2.U0(P02, 12);
                if (this.d != null) {
                    i6.f fVar3 = (i6.f) wVar.m();
                    Parcel P03 = fVar3.P0();
                    P03.writeString(str);
                    fVar3.U0(P03, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, g6.h hVar) {
        this.f9664b = e0Var;
        this.f9665c = str;
        this.d = hVar;
    }
}
