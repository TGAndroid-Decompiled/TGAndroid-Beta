package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;
public final class d1 extends a6.a implements j8.n {
    public static final Parcelable.Creator<d1> CREATOR = new p0(9);
    public final int f13485a;
    public final String f13486b;
    public final String f13487c;
    public final String d;
    public final String f13488e;
    public final String f13489f;
    public final String h;
    public final byte f13490n;
    public final byte f13491r;
    public final byte f13492s;
    public final byte v;
    public final String f13493w;

    public d1(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f13485a = i10;
        this.f13486b = str;
        this.f13487c = str2;
        this.d = str3;
        this.f13488e = str4;
        this.f13489f = str5;
        this.h = str6;
        this.f13490n = b10;
        this.f13491r = b11;
        this.f13492s = b12;
        this.v = b13;
        this.f13493w = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        String str = d1Var.f13493w;
        String str2 = d1Var.h;
        String str3 = d1Var.f13487c;
        if (this.f13485a != d1Var.f13485a || this.f13490n != d1Var.f13490n || this.f13491r != d1Var.f13491r || this.f13492s != d1Var.f13492s || this.v != d1Var.v || !this.f13486b.equals(d1Var.f13486b)) {
            return false;
        }
        String str4 = this.f13487c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(d1Var.d) || !this.f13488e.equals(d1Var.f13488e) || !this.f13489f.equals(d1Var.f13489f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f13493w;
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
        int f9 = l1.f((this.f13485a + 31) * 31, 31, this.f13486b);
        int i12 = 0;
        String str = this.f13487c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = l1.f(l1.f(l1.f((f9 + i10) * 31, 31, this.d), 31, this.f13488e), 31, this.f13489f);
        String str2 = this.h;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (((((((((f10 + i11) * 31) + this.f13490n) * 31) + this.f13491r) * 31) + this.f13492s) * 31) + this.v) * 31;
        String str3 = this.f13493w;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f13485a);
        sb2.append(", appId='");
        sb2.append(this.f13486b);
        sb2.append("', dateTime='");
        sb2.append(this.f13487c);
        sb2.append("', eventId=");
        sb2.append((int) this.f13490n);
        sb2.append(", eventFlags=");
        l1.w(sb2, this.f13491r, ", categoryId=", this.f13492s, ", categoryCount=");
        sb2.append((int) this.v);
        sb2.append(", packageName='");
        sb2.append(this.f13493w);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13485a);
        String str = this.f13486b;
        com.google.android.gms.internal.cast.o.l(parcel, 3, str);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f13487c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f13488e);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.f13489f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        com.google.android.gms.internal.cast.o.l(parcel, 8, str);
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(this.f13490n);
        com.google.android.gms.internal.cast.o.s(parcel, 10, 4);
        parcel.writeInt(this.f13491r);
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(this.f13492s);
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        com.google.android.gms.internal.cast.o.l(parcel, 13, this.f13493w);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
