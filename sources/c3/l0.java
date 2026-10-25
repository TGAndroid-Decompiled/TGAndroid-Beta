package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class l0 implements com.google.android.gms.common.api.internal.r {
    public final String[] f6082a;

    public l0(h6.r rVar, String[] strArr) {
        this.f6082a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        h6.q qVar = new h6.q(1, (TaskCompletionSource) obj2);
        h6.i iVar = (h6.i) ((h6.s) obj).u();
        Parcel N0 = iVar.N0();
        com.google.android.gms.internal.cast.t.d(N0, qVar);
        N0.writeStringArray(this.f6082a);
        iVar.S0(N0, 6);
    }

    public l0(String[] strArr) {
        this.f6082a = strArr;
    }
}
