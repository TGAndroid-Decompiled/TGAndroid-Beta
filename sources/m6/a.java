package m6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(29);
    public final Intent f19879a;

    public a(Intent intent) {
        this.f19879a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f19879a, i7);
        wb.s(parcel, r10);
    }
}
