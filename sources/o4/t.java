package o4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);
    public final int f18936a;
    public final int f18937b;
    public final String f18938c;
    public final String d;
    public final String f18939e;
    public final String f18940f;

    public t(int i9, String str, int i10, String str2, String str3, String str4) {
        this.f18936a = i9;
        this.f18937b = i10;
        this.f18938c = str;
        this.d = str2;
        this.f18939e = str3;
        this.f18940f = str4;
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
            if (this.f18936a == tVar.f18936a && this.f18937b == tVar.f18937b && TextUtils.equals(this.f18938c, tVar.f18938c) && TextUtils.equals(this.d, tVar.d) && TextUtils.equals(this.f18939e, tVar.f18939e) && TextUtils.equals(this.f18940f, tVar.f18940f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12 = ((this.f18936a * 31) + this.f18937b) * 31;
        int i13 = 0;
        String str = this.f18938c;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i12 + i9) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f18939e;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.f18940f;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f18936a);
        parcel.writeInt(this.f18937b);
        parcel.writeString(this.f18938c);
        parcel.writeString(this.d);
        parcel.writeString(this.f18939e);
        parcel.writeString(this.f18940f);
    }

    public t(Parcel parcel) {
        this.f18936a = parcel.readInt();
        this.f18937b = parcel.readInt();
        this.f18938c = parcel.readString();
        this.d = parcel.readString();
        this.f18939e = parcel.readString();
        this.f18940f = parcel.readString();
    }
}
