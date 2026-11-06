package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new b(6);
    public final String f16565a;
    public final Bundle f16566b;

    public h(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f16565a = type;
        this.f16566b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.l(dest, 1, this.f16565a);
        wb.b(dest, 2, this.f16566b);
        wb.s(dest, r10);
    }
}
