package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new f4.e(23);

    public ArrayList f6725a;

    public String f6726b;

    public String f6727c;
    public ArrayList d;

    public boolean f6728e;

    public String f6729f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.h(parcel, 2, this.f6725a);
        r8.l(parcel, 4, this.f6726b);
        r8.l(parcel, 5, this.f6727c);
        r8.h(parcel, 6, this.d);
        boolean z10 = this.f6728e;
        r8.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.l(parcel, 8, this.f6729f);
        r8.r(parcel, iQ);
    }
}
