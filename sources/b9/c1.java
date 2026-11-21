package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f2988a;
    public final String f2989b;
    public final String f2990c;
    public final String d;
    public final String f2991e;
    public final String f2992f;
    public final String h;
    public final byte f2993n;
    public final byte f2994r;
    public final byte f2995s;
    public final byte f2996w;
    public final String f2997x;

    public c1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f2988a = i7;
        this.f2989b = str;
        this.f2990c = str2;
        this.d = str3;
        this.f2991e = str4;
        this.f2992f = str5;
        this.h = str6;
        this.f2993n = b10;
        this.f2994r = b11;
        this.f2995s = b12;
        this.f2996w = b13;
        this.f2997x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f2997x;
        String str2 = c1Var.h;
        String str3 = c1Var.f2990c;
        if (this.f2988a != c1Var.f2988a || this.f2993n != c1Var.f2993n || this.f2994r != c1Var.f2994r || this.f2995s != c1Var.f2995s || this.f2996w != c1Var.f2996w || !this.f2989b.equals(c1Var.f2989b)) {
            return false;
        }
        String str4 = this.f2990c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f2991e.equals(c1Var.f2991e) || !this.f2992f.equals(c1Var.f2992f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2997x;
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
        int h = e2.h((this.f2988a + 31) * 31, 31, this.f2989b);
        int i11 = 0;
        String str = this.f2990c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = e2.h(e2.h(e2.h((h + i7) * 31, 31, this.d), 31, this.f2991e), 31, this.f2992f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f2993n) * 31) + this.f2994r) * 31) + this.f2995s) * 31) + this.f2996w) * 31;
        String str3 = this.f2997x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f2988a);
        sb2.append(", appId='");
        sb2.append(this.f2989b);
        sb2.append("', dateTime='");
        sb2.append(this.f2990c);
        sb2.append("', eventId=");
        sb2.append((int) this.f2993n);
        sb2.append(", eventFlags=");
        i5.c.z(sb2, this.f2994r, ", categoryId=", this.f2995s, ", categoryCount=");
        sb2.append((int) this.f2996w);
        sb2.append(", packageName='");
        sb2.append(this.f2997x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f2988a);
        String str = this.f2989b;
        bc.l(parcel, 3, str);
        bc.l(parcel, 4, this.f2990c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f2991e);
        bc.l(parcel, 7, this.f2992f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        bc.l(parcel, 8, str);
        bc.q(parcel, 9, 4);
        parcel.writeInt(this.f2993n);
        bc.q(parcel, 10, 4);
        parcel.writeInt(this.f2994r);
        bc.q(parcel, 11, 4);
        parcel.writeInt(this.f2995s);
        bc.q(parcel, 12, 4);
        parcel.writeInt(this.f2996w);
        bc.l(parcel, 13, this.f2997x);
        bc.s(parcel, r10);
    }
}
