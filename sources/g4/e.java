package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new d6.d(23);
    public final String f6996b;
    public final String f6997c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6996b = str;
        this.f6997c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (d0.a(this.f6997c, eVar.f6997c) && d0.a(this.f6996b, eVar.f6996b) && d0.a(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f6996b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f6997c;
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
        return this.f7006a + ": language=" + this.f6996b + ", description=" + this.f6997c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7006a);
        parcel.writeString(this.f6996b);
        parcel.writeString(this.d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f6996b = readString;
        this.f6997c = parcel.readString();
        this.d = parcel.readString();
    }
}
