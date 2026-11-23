package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class k0 implements com.google.android.gms.common.api.internal.q {
    public final String[] f11213a;

    public k0(j6.s sVar, String[] strArr) {
        this.f11213a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j6.r rVar = new j6.r(0, (TaskCompletionSource) obj2);
        j6.i iVar = (j6.i) ((j6.t) obj).n();
        Parcel p12 = iVar.p1();
        com.google.android.gms.internal.cast.t.d(p12, rVar);
        p12.writeStringArray(this.f11213a);
        iVar.u1(p12, 5);
    }

    public k0(String[] strArr) {
        this.f11213a = strArr;
    }
}
