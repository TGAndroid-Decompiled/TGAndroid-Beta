package o3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class y implements com.google.android.gms.common.api.internal.s {
    public final String[] f19129a;

    public y(s5.s sVar, String[] strArr) {
        this.f19129a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        s5.r rVar = new s5.r(2, (TaskCompletionSource) obj2);
        s5.i iVar = (s5.i) ((s5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.u.d(M0, rVar);
        M0.writeStringArray(this.f19129a);
        iVar.R0(M0, 7);
    }

    public y(String[] strArr) {
        this.f19129a = strArr;
    }
}
