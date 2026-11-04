package l6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(13);
    public final Intent f18051a;

    public a(Intent intent) {
        this.f18051a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f18051a, i3);
        j8.a.t(parcel, s6);
    }
}
