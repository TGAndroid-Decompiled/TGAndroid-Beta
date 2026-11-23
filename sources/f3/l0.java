package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class l0 implements com.google.android.gms.common.api.internal.q {
    public final String[] f11185a;

    public l0(j6.t tVar, String[] strArr) {
        this.f11185a = strArr;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j6.s sVar = new j6.s(2, (TaskCompletionSource) obj2);
        j6.i iVar = (j6.i) ((j6.u) obj).n();
        Parcel p12 = iVar.p1();
        com.google.android.gms.internal.cast.t.d(p12, sVar);
        p12.writeStringArray(this.f11185a);
        iVar.u1(p12, 7);
    }

    public l0(String[] strArr) {
        this.f11185a = strArr;
    }
}
