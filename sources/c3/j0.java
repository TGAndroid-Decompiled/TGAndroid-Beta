package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 implements com.google.android.gms.common.api.internal.s {
    public final String[] f4302a;

    public j0(g6.r rVar, String[] strArr) {
        this.f4302a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        g6.q qVar = new g6.q(0, (TaskCompletionSource) obj2);
        g6.i iVar = (g6.i) ((g6.s) obj).u();
        Parcel O0 = iVar.O0();
        com.google.android.gms.internal.cast.v.d(O0, qVar);
        O0.writeStringArray(this.f4302a);
        iVar.T0(O0, 5);
    }

    public j0(String[] strArr) {
        this.f4302a = strArr;
    }
}
