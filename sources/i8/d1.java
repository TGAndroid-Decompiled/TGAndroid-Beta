package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d1 extends y5.a implements h8.n {
    public static final Parcelable.Creator<d1> CREATOR = new p0(9);
    public final int f10962a;
    public final String f10963b;
    public final String f10964c;
    public final String d;
    public final String f10965e;
    public final String f10966f;
    public final String h;
    public final byte f10967n;
    public final byte f10968r;
    public final byte f10969s;
    public final byte v;
    public final String f10970w;

    public d1(int i9, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f10962a = i9;
        this.f10963b = str;
        this.f10964c = str2;
        this.d = str3;
        this.f10965e = str4;
        this.f10966f = str5;
        this.h = str6;
        this.f10967n = b10;
        this.f10968r = b11;
        this.f10969s = b12;
        this.v = b13;
        this.f10970w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        String str = d1Var.f10970w;
        String str2 = d1Var.h;
        String str3 = d1Var.f10964c;
        if (this.f10962a != d1Var.f10962a || this.f10967n != d1Var.f10967n || this.f10968r != d1Var.f10968r || this.f10969s != d1Var.f10969s || this.v != d1Var.v || !this.f10963b.equals(d1Var.f10963b)) {
            return false;
        }
        String str4 = this.f10964c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(d1Var.d) || !this.f10965e.equals(d1Var.f10965e) || !this.f10966f.equals(d1Var.f10966f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f10970w;
        if (str6 != null) {
            return str6.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int f10 = j3.r0.f((this.f10962a + 31) * 31, 31, this.f10963b);
        int i11 = 0;
        String str = this.f10964c;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int f11 = j3.r0.f(j3.r0.f(j3.r0.f((f10 + i9) * 31, 31, this.d), 31, this.f10965e), 31, this.f10966f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((f11 + i10) * 31) + this.f10967n) * 31) + this.f10968r) * 31) + this.f10969s) * 31) + this.v) * 31;
        String str3 = this.f10970w;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f10962a);
        sb2.append(", appId='");
        sb2.append(this.f10963b);
        sb2.append("', dateTime='");
        sb2.append(this.f10964c);
        sb2.append("', eventId=");
        sb2.append((int) this.f10967n);
        sb2.append(", eventFlags=");
        j3.r0.y(sb2, this.f10968r, ", categoryId=", this.f10969s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f10970w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10962a);
        String str = this.f10963b;
        p8.l(parcel, 3, str);
        p8.l(parcel, 4, this.f10964c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.f10965e);
        p8.l(parcel, 7, this.f10966f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        p8.l(parcel, 8, str);
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.f10967n);
        p8.s(parcel, 10, 4);
        parcel.writeInt(this.f10968r);
        p8.s(parcel, 11, 4);
        parcel.writeInt(this.f10969s);
        p8.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        p8.l(parcel, 13, this.f10970w);
        p8.r(parcel, q10);
    }
}
