package f6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a0 implements com.google.android.gms.common.api.internal.p {
    public final int f11220a = 0;
    public final e0 f11221b;
    public final String f11222c;
    public final f d;

    public a0(e0 e0Var, f fVar, String str) {
        this.f11221b = e0Var;
        this.d = fVar;
        this.f11222c = str;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f11220a) {
            case 0:
                boolean z9 = true;
                if (this.f11221b.G == 1) {
                    z9 = false;
                }
                q6.m.i("Not active connection", z9);
                if (this.d != null) {
                    j6.f fVar = (j6.f) wVar.n();
                    Parcel p12 = fVar.p1();
                    p12.writeString(this.f11222c);
                    fVar.u1(p12, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                boolean z10 = true;
                if (this.f11221b.G == 1) {
                    z10 = false;
                }
                q6.m.i("Not active connection", z10);
                j6.f fVar2 = (j6.f) wVar.n();
                Parcel p13 = fVar2.p1();
                String str = this.f11222c;
                p13.writeString(str);
                fVar2.u1(p13, 12);
                if (this.d != null) {
                    j6.f fVar3 = (j6.f) wVar.n();
                    Parcel p14 = fVar3.p1();
                    p14.writeString(str);
                    fVar3.u1(p14, 11);
                }
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public a0(e0 e0Var, String str, h6.h hVar) {
        this.f11221b = e0Var;
        this.f11222c = str;
        this.d = hVar;
    }
}
