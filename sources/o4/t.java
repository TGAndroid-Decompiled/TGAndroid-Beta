package o4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);

    public final int f19283a;

    public final int f19284b;

    public final String f19285c;
    public final String d;

    public final String f19286e;

    public final String f19287f;

    public t(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f19283a = i10;
        this.f19284b = i11;
        this.f19285c = str;
        this.d = str2;
        this.f19286e = str3;
        this.f19287f = str4;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f19283a == tVar.f19283a && this.f19284b == tVar.f19284b && TextUtils.equals(this.f19285c, tVar.f19285c) && TextUtils.equals(this.d, tVar.d) && TextUtils.equals(this.f19286e, tVar.f19286e) && TextUtils.equals(this.f19287f, tVar.f19287f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f19283a * 31) + this.f19284b) * 31;
        String str = this.f19285c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19286e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f19287f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19283a);
        parcel.writeInt(this.f19284b);
        parcel.writeString(this.f19285c);
        parcel.writeString(this.d);
        parcel.writeString(this.f19286e);
        parcel.writeString(this.f19287f);
    }

    public t(Parcel parcel) {
        this.f19283a = parcel.readInt();
        this.f19284b = parcel.readInt();
        this.f19285c = parcel.readString();
        this.d = parcel.readString();
        this.f19286e = parcel.readString();
        this.f19287f = parcel.readString();
    }
}
