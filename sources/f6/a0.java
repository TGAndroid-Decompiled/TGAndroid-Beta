package f6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.q {
    public final int f11354a = 0;
    public final e0 f11355b;
    public final String f11356c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f11355b = e0Var;
        this.d = fVar;
        this.f11356c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        j6.x xVar = (j6.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f11354a) {
            case 0:
                boolean z10 = true;
                if (this.f11355b.G == 1) {
                    z10 = false;
                }
                q6.m.j("Not active connection", z10);
                if (this.d != null) {
                    j6.f fVar = (j6.f) xVar.n();
                    Parcel p12 = fVar.p1();
                    p12.writeString(this.f11356c);
                    fVar.u1(p12, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z11 = true;
                if (this.f11355b.G == 1) {
                    z11 = false;
                }
                q6.m.j("Not active connection", z11);
                j6.f fVar2 = (j6.f) xVar.n();
                Parcel p13 = fVar2.p1();
                String str = this.f11356c;
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
        this.f11355b = e0Var;
        this.f11356c = str;
        this.d = hVar;
    }
}
