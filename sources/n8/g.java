package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(7);
    public final String f18738a;

    public g(String str) {
        this.f18738a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f18738a);
        df.r(parcel, q5);
    }
}
