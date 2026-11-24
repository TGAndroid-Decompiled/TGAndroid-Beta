package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
public final class w4f extends b4 implements ua9 {
    public static final Parcelable.Creator<w4f> CREATOR = new c0f((byte) 12);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.p(parcel, 2, this.b);
        jte.m(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
