package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
public final class b1 extends r6.a {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f2943a;
    public final String f2944b;
    public final String f2945c;
    public final String d;
    public final String f2946e;
    public final String f2947f;
    public final String h;
    public final byte f2948n;
    public final byte f2949r;
    public final byte f2950s;
    public final byte f2951w;
    public final String f2952x;

    public b1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f2943a = i7;
        this.f2944b = str;
        this.f2945c = str2;
        this.d = str3;
        this.f2946e = str4;
        this.f2947f = str5;
        this.h = str6;
        this.f2948n = b10;
        this.f2949r = b11;
        this.f2950s = b12;
        this.f2951w = b13;
        this.f2952x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f2952x;
        String str2 = b1Var.h;
        String str3 = b1Var.f2945c;
        if (this.f2943a != b1Var.f2943a || this.f2948n != b1Var.f2948n || this.f2949r != b1Var.f2949r || this.f2950s != b1Var.f2950s || this.f2951w != b1Var.f2951w || !this.f2944b.equals(b1Var.f2944b)) {
            return false;
        }
        String str4 = this.f2945c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f2946e.equals(b1Var.f2946e) || !this.f2947f.equals(b1Var.f2947f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2952x;
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
        int h = e2.h((this.f2943a + 31) * 31, 31, this.f2944b);
        int i11 = 0;
        String str = this.f2945c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = e2.h(e2.h(e2.h((h + i7) * 31, 31, this.d), 31, this.f2946e), 31, this.f2947f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f2948n) * 31) + this.f2949r) * 31) + this.f2950s) * 31) + this.f2951w) * 31;
        String str3 = this.f2952x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f2943a);
        sb2.append(", appId='");
        sb2.append(this.f2944b);
        sb2.append("', dateTime='");
        sb2.append(this.f2945c);
        sb2.append("', eventId=");
        sb2.append((int) this.f2948n);
        sb2.append(", eventFlags=");
        i5.c.z(sb2, this.f2949r, ", categoryId=", this.f2950s, ", categoryCount=");
        sb2.append((int) this.f2951w);
        sb2.append(", packageName='");
        sb2.append(this.f2952x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2943a);
        String str = this.f2944b;
        cc.l(parcel, 3, str);
        cc.l(parcel, 4, this.f2945c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f2946e);
        cc.l(parcel, 7, this.f2947f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        cc.l(parcel, 8, str);
        cc.q(parcel, 9, 4);
        parcel.writeInt(this.f2948n);
        cc.q(parcel, 10, 4);
        parcel.writeInt(this.f2949r);
        cc.q(parcel, 11, 4);
        parcel.writeInt(this.f2950s);
        cc.q(parcel, 12, 4);
        parcel.writeInt(this.f2951w);
        cc.l(parcel, 13, this.f2952x);
        cc.s(parcel, r10);
    }
}
