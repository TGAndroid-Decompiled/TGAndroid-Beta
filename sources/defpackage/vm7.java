package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vm7 extends c4 {
    public static final Parcelable.Creator<vm7> CREATOR = new nkf((byte) 9);
    public final String a;
    public final int b;
    public final String c;

    public vm7(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.l(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
