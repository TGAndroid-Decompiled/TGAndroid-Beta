package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(24);
    public String f1629a;
    public String f1630b;
    public String f1631c;
    public String d;
    public String f1632e;
    public String f1633f;
    public String h;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f1629a);
        p8.l(parcel, 3, this.f1630b);
        p8.l(parcel, 4, this.f1631c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.f1632e);
        p8.l(parcel, 7, this.f1633f);
        p8.l(parcel, 8, this.h);
        p8.r(parcel, q10);
    }
}
