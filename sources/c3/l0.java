package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class l0 implements com.google.android.gms.common.api.internal.r {
    public final String[] f4648a;

    public l0(g6.r rVar, String[] strArr) {
        this.f4648a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        g6.q qVar = new g6.q(2, (TaskCompletionSource) obj2);
        g6.i iVar = (g6.i) ((g6.s) obj).u();
        Parcel N0 = iVar.N0();
        com.google.android.gms.internal.cast.v.d(N0, qVar);
        N0.writeStringArray(this.f4648a);
        iVar.S0(N0, 7);
    }

    public l0(String[] strArr) {
        this.f4648a = strArr;
    }
}
