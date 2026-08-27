package m3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class y implements com.google.android.gms.common.api.internal.s {

    public final String[] f17646a;

    public y(r5.s sVar, String[] strArr) {
        this.f17646a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        r5.r rVar = new r5.r(1, (TaskCompletionSource) obj2);
        r5.i iVar = (r5.i) ((r5.t) obj).u();
        Parcel parcelM0 = iVar.M0();
        com.google.android.gms.internal.cast.t.d(parcelM0, rVar);
        parcelM0.writeStringArray(this.f17646a);
        iVar.R0(parcelM0, 6);
    }

    public y(String[] strArr) {
        this.f17646a = strArr;
    }
}
