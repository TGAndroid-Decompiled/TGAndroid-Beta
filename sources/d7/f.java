package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.yh;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(8);
    public final String f4229a;
    public final String f4230b;
    public final String f4231c;

    public f(String str, String str2, String str3) {
        this.f4229a = str;
        this.f4230b = str2;
        this.f4231c = str3;
    }

    public final String toString() {
        return android.support.v4.media.a.r(yh.m("DocumentId[packageName=", this.f4229a, ", corpusName=", this.f4230b, ", uri="), this.f4231c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f4229a);
        f5.l(parcel, 2, this.f4230b);
        f5.l(parcel, 3, this.f4231c);
        f5.r(parcel, q10);
    }
}
