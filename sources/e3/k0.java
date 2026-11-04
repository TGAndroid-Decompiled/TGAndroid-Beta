package e3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class k0 implements com.google.android.gms.common.api.internal.p {
    public final String[] f9491a;

    public k0(i6.r rVar, String[] strArr) {
        this.f9491a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        i6.q qVar = new i6.q(1, (TaskCompletionSource) obj2);
        i6.i iVar = (i6.i) ((i6.s) obj).m();
        Parcel P0 = iVar.P0();
        com.google.android.gms.internal.cast.u.d(P0, qVar);
        P0.writeStringArray(this.f9491a);
        iVar.U0(P0, 6);
    }

    public k0(String[] strArr) {
        this.f9491a = strArr;
    }
}
