package m5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class b0 implements com.google.android.gms.common.api.internal.s {

    public final int f17745a = 1;

    public final f0 f17746b;

    public final String f17747c;
    public final f d;

    public b0(f0 f0Var, String str, o5.h hVar) {
        this.f17746b = f0Var;
        this.f17747c = str;
        this.d = hVar;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        r5.x xVar = (r5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f17745a) {
            case 0:
                y5.l.j("Not active connection", this.f17746b.F != 1);
                if (this.d != null) {
                    r5.f fVar = (r5.f) xVar.u();
                    Parcel parcelM0 = fVar.M0();
                    parcelM0.writeString(this.f17747c);
                    fVar.R0(parcelM0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                y5.l.j("Not active connection", this.f17746b.F != 1);
                r5.f fVar2 = (r5.f) xVar.u();
                Parcel parcelM1 = fVar2.M0();
                String str = this.f17747c;
                parcelM1.writeString(str);
                fVar2.R0(parcelM1, 12);
                if (this.d != null) {
                    r5.f fVar3 = (r5.f) xVar.u();
                    Parcel parcelM2 = fVar3.M0();
                    parcelM2.writeString(str);
                    fVar3.R0(parcelM2, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public b0(f0 f0Var, f fVar, String str) {
        this.f17746b = f0Var;
        this.d = fVar;
        this.f17747c = str;
    }
}
