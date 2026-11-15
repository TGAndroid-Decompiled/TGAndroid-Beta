package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f2981a;
    public final String f2982b;
    public final String f2983c;
    public final String d;
    public final String f2984e;
    public final String f2985f;
    public final String h;
    public final byte f2986n;
    public final byte f2987r;
    public final byte f2988s;
    public final byte f2989w;
    public final String f2990x;

    public c1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f2981a = i7;
        this.f2982b = str;
        this.f2983c = str2;
        this.d = str3;
        this.f2984e = str4;
        this.f2985f = str5;
        this.h = str6;
        this.f2986n = b10;
        this.f2987r = b11;
        this.f2988s = b12;
        this.f2989w = b13;
        this.f2990x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f2990x;
        String str2 = c1Var.h;
        String str3 = c1Var.f2983c;
        if (this.f2981a != c1Var.f2981a || this.f2986n != c1Var.f2986n || this.f2987r != c1Var.f2987r || this.f2988s != c1Var.f2988s || this.f2989w != c1Var.f2989w || !this.f2982b.equals(c1Var.f2982b)) {
            return false;
        }
        String str4 = this.f2983c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f2984e.equals(c1Var.f2984e) || !this.f2985f.equals(c1Var.f2985f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2990x;
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
        int h = e2.h((this.f2981a + 31) * 31, 31, this.f2982b);
        int i11 = 0;
        String str = this.f2983c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = e2.h(e2.h(e2.h((h + i7) * 31, 31, this.d), 31, this.f2984e), 31, this.f2985f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f2986n) * 31) + this.f2987r) * 31) + this.f2988s) * 31) + this.f2989w) * 31;
        String str3 = this.f2990x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f2981a);
        sb2.append(", appId='");
        sb2.append(this.f2982b);
        sb2.append("', dateTime='");
        sb2.append(this.f2983c);
        sb2.append("', eventId=");
        sb2.append((int) this.f2986n);
        sb2.append(", eventFlags=");
        i5.c.y(sb2, this.f2987r, ", categoryId=", this.f2988s, ", categoryCount=");
        sb2.append((int) this.f2989w);
        sb2.append(", packageName='");
        sb2.append(this.f2990x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f2981a);
        String str = this.f2982b;
        yb.l(parcel, 3, str);
        yb.l(parcel, 4, this.f2983c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.f2984e);
        yb.l(parcel, 7, this.f2985f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        yb.l(parcel, 8, str);
        yb.q(parcel, 9, 4);
        parcel.writeInt(this.f2986n);
        yb.q(parcel, 10, 4);
        parcel.writeInt(this.f2987r);
        yb.q(parcel, 11, 4);
        parcel.writeInt(this.f2988s);
        yb.q(parcel, 12, 4);
        parcel.writeInt(this.f2989w);
        yb.l(parcel, 13, this.f2990x);
        yb.s(parcel, r10);
    }
}
