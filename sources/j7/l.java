package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new b(11);
    public final Bundle f16574a;

    public l(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f16574a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.b(dest, 1, this.f16574a);
        wb.s(dest, r10);
    }
}
