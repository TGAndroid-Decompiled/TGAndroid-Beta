package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class zy5 extends c4 {
    public static final Parcelable.Creator<zy5> CREATOR = new g3e((byte) 3);
    public String a;
    public String b;
    public ArrayList c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.p(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
