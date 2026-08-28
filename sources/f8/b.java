package f8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import g7.p8;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new r(6);
    public String f5914a;
    public String f5915b;
    public String f5916c;
    public int d;
    public UserAddress f5917e;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f5914a);
        p8.l(parcel, 2, this.f5915b);
        p8.l(parcel, 3, this.f5916c);
        int i10 = this.d;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.k(parcel, 5, this.f5917e, i9);
        p8.r(parcel, q10);
    }
}
