package b7;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import org.telegram.ui.th;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(17);
    public final String f1946a;
    public final String f1947b;
    public final String f1948c;

    public f(String str, String str2, String str3) {
        this.f1946a = str;
        this.f1947b = str2;
        this.f1948c = str3;
    }

    public final String toString() {
        return w.q(th.k("DocumentId[packageName=", this.f1946a, ", corpusName=", this.f1947b, ", uri="), this.f1948c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f1946a);
        o.l(parcel, 2, this.f1947b);
        o.l(parcel, 3, this.f1948c);
        o.r(parcel, q6);
    }
}
