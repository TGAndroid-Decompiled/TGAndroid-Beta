package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new f8.o(16);
    public final String f8897b;
    public final String f8898c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f8897b = str;
        this.f8898c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (d0.a(this.f8898c, eVar.f8898c) && d0.a(this.f8897b, eVar.f8897b) && d0.a(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f8897b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f8898c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override
    public final String toString() {
        return this.f8906a + ": language=" + this.f8897b + ", description=" + this.f8898c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8906a);
        parcel.writeString(this.f8897b);
        parcel.writeString(this.d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f8897b = readString;
        this.f8898c = parcel.readString();
        this.d = parcel.readString();
    }
}
