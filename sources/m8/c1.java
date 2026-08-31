package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class c1 extends c6.a implements l8.n {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f13496a;
    public final String f13497b;
    public final String f13498c;
    public final String d;
    public final String f13499e;
    public final String f13500f;
    public final String h;
    public final byte f13501n;
    public final byte f13502r;
    public final byte f13503s;
    public final byte v;
    public final String f13504w;

    public c1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f13496a = i10;
        this.f13497b = str;
        this.f13498c = str2;
        this.d = str3;
        this.f13499e = str4;
        this.f13500f = str5;
        this.h = str6;
        this.f13501n = b10;
        this.f13502r = b11;
        this.f13503s = b12;
        this.v = b13;
        this.f13504w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f13504w;
        String str2 = c1Var.h;
        String str3 = c1Var.f13498c;
        if (this.f13496a != c1Var.f13496a || this.f13501n != c1Var.f13501n || this.f13502r != c1Var.f13502r || this.f13503s != c1Var.f13503s || this.v != c1Var.v || !this.f13497b.equals(c1Var.f13497b)) {
            return false;
        }
        String str4 = this.f13498c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f13499e.equals(c1Var.f13499e) || !this.f13500f.equals(c1Var.f13500f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f13504w;
        if (str6 != null) {
            return str6.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int e6 = l.d.e((this.f13496a + 31) * 31, 31, this.f13497b);
        int i12 = 0;
        String str = this.f13498c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int e10 = l.d.e(l.d.e(l.d.e((e6 + i10) * 31, 31, this.d), 31, this.f13499e), 31, this.f13500f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((e10 + i11) * 31) + this.f13501n) * 31) + this.f13502r) * 31) + this.f13503s) * 31) + this.v) * 31;
        String str3 = this.f13504w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AncsNotificationParcelable{, id=");
        sb.append(this.f13496a);
        sb.append(", appId='");
        sb.append(this.f13497b);
        sb.append("', dateTime='");
        sb.append(this.f13498c);
        sb.append("', eventId=");
        sb.append((int) this.f13501n);
        sb.append(", eventFlags=");
        l.d.w(sb, this.f13502r, ", categoryId=", this.f13503s, ", categoryCount=");
        sb.append((int) this.v);
        sb.append(", packageName='");
        sb.append(this.f13504w);
        sb.append("'}");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13496a);
        String str = this.f13497b;
        g5.l(parcel, 3, str);
        g5.l(parcel, 4, this.f13498c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f13499e);
        g5.l(parcel, 7, this.f13500f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        g5.l(parcel, 8, str);
        g5.s(parcel, 9, 4);
        parcel.writeInt(this.f13501n);
        g5.s(parcel, 10, 4);
        parcel.writeInt(this.f13502r);
        g5.s(parcel, 11, 4);
        parcel.writeInt(this.f13503s);
        g5.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        g5.l(parcel, 13, this.f13504w);
        g5.r(parcel, q10);
    }
}
