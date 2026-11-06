package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q6.m;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(6);
    public final String f19938a;

    public e(String str) {
        m.h(str, "json must not be null");
        this.f19938a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f19938a);
        wb.s(parcel, r10);
    }
}
