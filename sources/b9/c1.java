package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f2946a;
    public final String f2947b;
    public final String f2948c;
    public final String d;
    public final String f2949e;
    public final String f2950f;
    public final String h;
    public final byte f2951n;
    public final byte f2952r;
    public final byte f2953s;
    public final byte f2954w;
    public final String f2955x;

    public c1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f2946a = i7;
        this.f2947b = str;
        this.f2948c = str2;
        this.d = str3;
        this.f2949e = str4;
        this.f2950f = str5;
        this.h = str6;
        this.f2951n = b10;
        this.f2952r = b11;
        this.f2953s = b12;
        this.f2954w = b13;
        this.f2955x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f2955x;
        String str2 = c1Var.h;
        String str3 = c1Var.f2948c;
        if (this.f2946a != c1Var.f2946a || this.f2951n != c1Var.f2951n || this.f2952r != c1Var.f2952r || this.f2953s != c1Var.f2953s || this.f2954w != c1Var.f2954w || !this.f2947b.equals(c1Var.f2947b)) {
            return false;
        }
        String str4 = this.f2948c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f2949e.equals(c1Var.f2949e) || !this.f2950f.equals(c1Var.f2950f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2955x;
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
        int h = e2.h((this.f2946a + 31) * 31, 31, this.f2947b);
        int i11 = 0;
        String str = this.f2948c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = e2.h(e2.h(e2.h((h + i7) * 31, 31, this.d), 31, this.f2949e), 31, this.f2950f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f2951n) * 31) + this.f2952r) * 31) + this.f2953s) * 31) + this.f2954w) * 31;
        String str3 = this.f2955x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f2946a);
        sb2.append(", appId='");
        sb2.append(this.f2947b);
        sb2.append("', dateTime='");
        sb2.append(this.f2948c);
        sb2.append("', eventId=");
        sb2.append((int) this.f2951n);
        sb2.append(", eventFlags=");
        i5.c.z(sb2, this.f2952r, ", categoryId=", this.f2953s, ", categoryCount=");
        sb2.append((int) this.f2954w);
        sb2.append(", packageName='");
        sb2.append(this.f2955x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2946a);
        String str = this.f2947b;
        cc.l(parcel, 3, str);
        cc.l(parcel, 4, this.f2948c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f2949e);
        cc.l(parcel, 7, this.f2950f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        cc.l(parcel, 8, str);
        cc.q(parcel, 9, 4);
        parcel.writeInt(this.f2951n);
        cc.q(parcel, 10, 4);
        parcel.writeInt(this.f2952r);
        cc.q(parcel, 11, 4);
        parcel.writeInt(this.f2953s);
        cc.q(parcel, 12, 4);
        parcel.writeInt(this.f2954w);
        cc.l(parcel, 13, this.f2955x);
        cc.s(parcel, r10);
    }
}
