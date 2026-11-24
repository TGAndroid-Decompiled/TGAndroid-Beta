package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
public final class y6f extends b4 implements uc9 {
    public static final Parcelable.Creator<y6f> CREATOR = new e2f((byte) 12);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.p(parcel, 2, this.b);
        mve.m(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
