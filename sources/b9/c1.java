package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f2978a;
    public final String f2979b;
    public final String f2980c;
    public final String d;
    public final String f2981e;
    public final String f2982f;
    public final String h;
    public final byte f2983n;
    public final byte f2984r;
    public final byte f2985s;
    public final byte f2986w;
    public final String f2987x;

    public c1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f2978a = i7;
        this.f2979b = str;
        this.f2980c = str2;
        this.d = str3;
        this.f2981e = str4;
        this.f2982f = str5;
        this.h = str6;
        this.f2983n = b10;
        this.f2984r = b11;
        this.f2985s = b12;
        this.f2986w = b13;
        this.f2987x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f2987x;
        String str2 = c1Var.h;
        String str3 = c1Var.f2980c;
        if (this.f2978a != c1Var.f2978a || this.f2983n != c1Var.f2983n || this.f2984r != c1Var.f2984r || this.f2985s != c1Var.f2985s || this.f2986w != c1Var.f2986w || !this.f2979b.equals(c1Var.f2979b)) {
            return false;
        }
        String str4 = this.f2980c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f2981e.equals(c1Var.f2981e) || !this.f2982f.equals(c1Var.f2982f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2987x;
        if (str6 != null) {
            return str6.equals(str);
        }
        if (str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10;
        int h = e2.h((this.f2978a + 31) * 31, 31, this.f2979b);
        int i11 = 0;
        String str = this.f2980c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = e2.h(e2.h(e2.h((h + i7) * 31, 31, this.d), 31, this.f2981e), 31, this.f2982f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f2983n) * 31) + this.f2984r) * 31) + this.f2985s) * 31) + this.f2986w) * 31;
        String str3 = this.f2987x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f2978a);
        sb2.append(", appId='");
        sb2.append(this.f2979b);
        sb2.append("', dateTime='");
        sb2.append(this.f2980c);
        sb2.append("', eventId=");
        sb2.append((int) this.f2983n);
        sb2.append(", eventFlags=");
        i5.c.y(sb2, this.f2984r, ", categoryId=", this.f2985s, ", categoryCount=");
        sb2.append((int) this.f2986w);
        sb2.append(", packageName='");
        sb2.append(this.f2987x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f2978a);
        String str = this.f2979b;
        yb.l(parcel, 3, str);
        yb.l(parcel, 4, this.f2980c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f2981e);
        yb.l(parcel, 7, this.f2982f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        yb.l(parcel, 8, str);
        yb.q(parcel, 9, 4);
        parcel.writeInt(this.f2983n);
        yb.q(parcel, 10, 4);
        parcel.writeInt(this.f2984r);
        yb.q(parcel, 11, 4);
        parcel.writeInt(this.f2985s);
        yb.q(parcel, 12, 4);
        parcel.writeInt(this.f2986w);
        yb.l(parcel, 13, this.f2987x);
        yb.s(parcel, r10);
    }
}
