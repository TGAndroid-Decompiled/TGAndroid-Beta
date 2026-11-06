package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class l0 implements com.google.android.gms.common.api.internal.p {
    public final String[] f11060a;

    public l0(j6.r rVar, String[] strArr) {
        this.f11060a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j6.q qVar = new j6.q(2, (TaskCompletionSource) obj2);
        j6.i iVar = (j6.i) ((j6.s) obj).n();
        Parcel P0 = iVar.P0();
        com.google.android.gms.internal.cast.t.d(P0, qVar);
        P0.writeStringArray(this.f11060a);
        iVar.U0(P0, 7);
    }

    public l0(String[] strArr) {
        this.f11060a = strArr;
    }
}
