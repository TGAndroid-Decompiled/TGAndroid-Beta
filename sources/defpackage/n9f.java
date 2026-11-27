package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
public final class n9f extends c4 implements ie9 {
    public static final Parcelable.Creator<n9f> CREATOR = new t4f((byte) 12);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.p(parcel, 2, this.b);
        bye.m(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
