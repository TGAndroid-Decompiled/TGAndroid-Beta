package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
public final class a13 extends c4 {
    public static final Parcelable.Creator<a13> CREATOR = new g31((byte) 11);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final ResultReceiver f;

    public a13(String str, Bundle bundle, Bundle bundle2, String str2, String str3, ResultReceiver resultReceiver) {
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
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.b(parcel, 2, this.b);
        bye.b(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.l(parcel, 5, this.e);
        bye.k(parcel, 6, this.f, i);
        bye.s(parcel, r);
    }
}
