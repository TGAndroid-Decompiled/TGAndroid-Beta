package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.ai;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(8);
    public final String f4210a;
    public final String f4211b;
    public final String f4212c;

    public f(String str, String str2, String str3) {
        this.f4210a = str;
        this.f4211b = str2;
        this.f4212c = str3;
    }

    public final String toString() {
        return android.support.v4.media.a.r(ai.l("DocumentId[packageName=", this.f4210a, ", corpusName=", this.f4211b, ", uri="), this.f4212c, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f4210a);
        f5.l(parcel, 2, this.f4211b);
        f5.l(parcel, 3, this.f4212c);
        f5.r(parcel, q10);
    }
}
