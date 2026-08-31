package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);
    public final String f147a;

    public f(String str) {
        this.f147a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f147a);
        g5.r(parcel, q10);
    }
}
