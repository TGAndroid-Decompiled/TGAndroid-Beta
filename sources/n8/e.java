package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new x(4);
    public final String f18735a;

    public e(String str) {
        this.f18735a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f18735a);
        df.r(parcel, q5);
    }
}
