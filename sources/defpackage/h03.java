package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
public final class h03 extends b4 {
    public static final Parcelable.Creator<h03> CREATOR = new x21((byte) 11);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final ResultReceiver f;

    public h03(String str, Bundle bundle, Bundle bundle2, String str2, String str3, ResultReceiver resultReceiver) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.b(parcel, 2, this.b);
        jte.b(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.l(parcel, 5, this.e);
        jte.k(parcel, 6, this.f, i);
        jte.s(parcel, r);
    }
}
