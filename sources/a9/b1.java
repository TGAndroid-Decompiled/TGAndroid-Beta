package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class b1 extends q6.a {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f167a;
    public final String f168b;
    public final String f169c;
    public final String d;
    public final String f170e;
    public final String f171f;
    public final String h;
    public final byte f172n;
    public final byte f173r;
    public final byte f174s;
    public final byte f175w;
    public final String f176x;

    public b1(int i3, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f167a = i3;
        this.f168b = str;
        this.f169c = str2;
        this.d = str3;
        this.f170e = str4;
        this.f171f = str5;
        this.h = str6;
        this.f172n = b10;
        this.f173r = b11;
        this.f174s = b12;
        this.f175w = b13;
        this.f176x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f176x;
        String str2 = b1Var.h;
        String str3 = b1Var.f169c;
        if (this.f167a != b1Var.f167a || this.f172n != b1Var.f172n || this.f173r != b1Var.f173r || this.f174s != b1Var.f174s || this.f175w != b1Var.f175w || !this.f168b.equals(b1Var.f168b)) {
            return false;
        }
        String str4 = this.f169c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f170e.equals(b1Var.f170e) || !this.f171f.equals(b1Var.f171f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f176x;
        if (str6 != null) {
            return str6.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int g7 = com.google.android.recaptcha.internal.a.g((this.f167a + 31) * 31, 31, this.f168b);
        int i11 = 0;
        String str = this.f169c;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int g10 = com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g((g7 + i3) * 31, 31, this.d), 31, this.f170e), 31, this.f171f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((g10 + i10) * 31) + this.f172n) * 31) + this.f173r) * 31) + this.f174s) * 31) + this.f175w) * 31;
        String str3 = this.f176x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f167a);
        sb2.append(", appId='");
        sb2.append(this.f168b);
        sb2.append("', dateTime='");
        sb2.append(this.f169c);
        sb2.append("', eventId=");
        sb2.append((int) this.f172n);
        sb2.append(", eventFlags=");
        com.google.android.recaptcha.internal.a.r(sb2, this.f173r, ", categoryId=", this.f174s, ", categoryCount=");
        sb2.append((int) this.f175w);
        sb2.append(", packageName='");
        sb2.append(this.f176x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f167a);
        String str = this.f168b;
        j8.a.m(parcel, 3, str);
        j8.a.m(parcel, 4, this.f169c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.f170e);
        j8.a.m(parcel, 7, this.f171f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        j8.a.m(parcel, 8, str);
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.f172n);
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(this.f173r);
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(this.f174s);
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(this.f175w);
        j8.a.m(parcel, 13, this.f176x);
        j8.a.t(parcel, s6);
    }
}
