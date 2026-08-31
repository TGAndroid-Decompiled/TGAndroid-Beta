package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import org.telegram.ui.yh;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(8);
    public final String f4301a;
    public final String f4302b;
    public final String f4303c;

    public f(String str, String str2, String str3) {
        this.f4301a = str;
        this.f4302b = str2;
        this.f4303c = str3;
    }

    public final String toString() {
        return android.support.v4.media.a.r(yh.m("DocumentId[packageName=", this.f4301a, ", corpusName=", this.f4302b, ", uri="), this.f4303c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f4301a);
        g5.l(parcel, 2, this.f4302b);
        g5.l(parcel, 3, this.f4303c);
        g5.r(parcel, q10);
    }
}
