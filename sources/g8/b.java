package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h7.r8;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new f4.e(19);

    public String f6715a;

    public String f6716b;

    public String f6717c;
    public int d;

    public UserAddress f6718e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f6715a);
        r8.l(parcel, 2, this.f6716b);
        r8.l(parcel, 3, this.f6717c);
        int i11 = this.d;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.k(parcel, 5, this.f6718e, i10);
        r8.r(parcel, iQ);
    }
}
