package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class t7d extends ezc implements e8d {
    public final Bundle Z(String str, String str2, Bundle bundle) {
        Parcel X = X();
        X.writeInt(9);
        X.writeString(str);
        X.writeString(str2);
        int i = b9d.a;
        X.writeInt(1);
        bundle.writeToParcel(X, 0);
        Parcel Y = Y(X, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) b9d.a(Y);
        Y.recycle();
        return bundle2;
    }

    public final Bundle a0(String str, String str2, String str3) {
        Parcel X = X();
        X.writeInt(3);
        X.writeString(str);
        X.writeString(str2);
        X.writeString(str3);
        X.writeString(null);
        Parcel Y = Y(X, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) b9d.a(Y);
        Y.recycle();
        return bundle;
    }

    public final Bundle b0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel X = X();
        X.writeInt(i);
        X.writeString(str);
        X.writeString(str2);
        X.writeString(str3);
        X.writeString(null);
        int i2 = b9d.a;
        X.writeInt(1);
        bundle.writeToParcel(X, 0);
        Parcel Y = Y(X, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) b9d.a(Y);
        Y.recycle();
        return bundle2;
    }

    public final Bundle c0(String str, String str2, String str3) {
        Parcel X = X();
        X.writeInt(3);
        X.writeString(str);
        X.writeString(str2);
        X.writeString(str3);
        Parcel Y = Y(X, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) b9d.a(Y);
        Y.recycle();
        return bundle;
    }

    public final Bundle d0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel X = X();
        X.writeInt(i);
        X.writeString(str);
        X.writeString(str2);
        X.writeString(str3);
        int i2 = b9d.a;
        X.writeInt(1);
        bundle.writeToParcel(X, 0);
        Parcel Y = Y(X, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) b9d.a(Y);
        Y.recycle();
        return bundle2;
    }

    public final Bundle e0(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel X = X();
        X.writeInt(i);
        X.writeString(str);
        X.writeString(str2);
        int i2 = b9d.a;
        X.writeInt(1);
        bundle.writeToParcel(X, 0);
        X.writeInt(1);
        bundle2.writeToParcel(X, 0);
        Parcel Y = Y(X, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) b9d.a(Y);
        Y.recycle();
        return bundle3;
    }
}
