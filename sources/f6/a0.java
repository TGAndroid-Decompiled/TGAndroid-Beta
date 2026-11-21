package f6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.q {
    public final int f11380a = 0;
    public final e0 f11381b;
    public final String f11382c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f11381b = e0Var;
        this.d = fVar;
        this.f11382c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        j6.x xVar = (j6.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f11380a) {
            case 0:
                boolean z10 = true;
                if (this.f11381b.G == 1) {
                    z10 = false;
                }
                q6.m.j("Not active connection", z10);
                if (this.d != null) {
                    j6.f fVar = (j6.f) xVar.n();
                    Parcel p12 = fVar.p1();
                    p12.writeString(this.f11382c);
                    fVar.u1(p12, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f11381b.G == 1) {
                    z11 = false;
                }
                q6.m.j("Not active connection", z11);
                j6.f fVar2 = (j6.f) xVar.n();
                Parcel p13 = fVar2.p1();
                String str = this.f11382c;
                p13.writeString(str);
                fVar2.u1(p13, 12);
                if (this.d != null) {
                    j6.f fVar3 = (j6.f) xVar.n();
                    Parcel p14 = fVar3.p1();
                    p14.writeString(str);
                    fVar3.u1(p14, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, h6.h hVar) {
        this.f11381b = e0Var;
        this.f11382c = str;
        this.d = hVar;
    }
}
