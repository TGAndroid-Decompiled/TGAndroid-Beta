package m3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class y implements com.google.android.gms.common.api.internal.s {
    public final String[] f17270a;

    public y(q5.s sVar, String[] strArr) {
        this.f17270a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        q5.r rVar = new q5.r(2, (TaskCompletionSource) obj2);
        q5.i iVar = (q5.i) ((q5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.u.d(M0, rVar);
        M0.writeStringArray(this.f17270a);
        iVar.R0(M0, 7);
    }

    public y(String[] strArr) {
        this.f17270a = strArr;
    }
}
