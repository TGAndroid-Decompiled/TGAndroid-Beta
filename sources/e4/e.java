package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new c.c(10);
    public final String f4840b;
    public final String f4841c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f4840b = str;
        this.f4841c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (f0.a(this.f4841c, eVar.f4841c) && f0.a(this.f4840b, eVar.f4840b) && f0.a(this.d, eVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f4840b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.f4841c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override
    public final String toString() {
        return this.f4850a + ": language=" + this.f4840b + ", description=" + this.f4841c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4850a);
        parcel.writeString(this.f4840b);
        parcel.writeString(this.d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4840b = readString;
        this.f4841c = parcel.readString();
        this.d = parcel.readString();
    }
}
