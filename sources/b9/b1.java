package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class b1 extends r6.a {
    public static final Parcelable.Creator<b1> CREATOR = new n0(9);
    public final int f3020a;
    public final String f3021b;
    public final String f3022c;
    public final String d;
    public final String f3023e;
    public final String f3024f;
    public final String h;
    public final byte f3025n;
    public final byte f3026r;
    public final byte f3027s;
    public final byte f3028w;
    public final String f3029x;

    public b1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f3020a = i7;
        this.f3021b = str;
        this.f3022c = str2;
        this.d = str3;
        this.f3023e = str4;
        this.f3024f = str5;
        this.h = str6;
        this.f3025n = b10;
        this.f3026r = b11;
        this.f3027s = b12;
        this.f3028w = b13;
        this.f3029x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = b1Var.f3029x;
        String str2 = b1Var.h;
        String str3 = b1Var.f3022c;
        if (this.f3020a != b1Var.f3020a || this.f3025n != b1Var.f3025n || this.f3026r != b1Var.f3026r || this.f3027s != b1Var.f3027s || this.f3028w != b1Var.f3028w || !this.f3021b.equals(b1Var.f3021b)) {
            return false;
        }
        String str4 = this.f3022c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(b1Var.d) || !this.f3023e.equals(b1Var.f3023e) || !this.f3024f.equals(b1Var.f3024f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f3029x;
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
        int h = com.google.android.recaptcha.internal.a.h((this.f3020a + 31) * 31, 31, this.f3021b);
        int i11 = 0;
        String str = this.f3022c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h((h + i7) * 31, 31, this.d), 31, this.f3023e), 31, this.f3024f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f3025n) * 31) + this.f3026r) * 31) + this.f3027s) * 31) + this.f3028w) * 31;
        String str3 = this.f3029x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f3020a);
        sb2.append(", appId='");
        sb2.append(this.f3021b);
        sb2.append("', dateTime='");
        sb2.append(this.f3022c);
        sb2.append("', eventId=");
        sb2.append((int) this.f3025n);
        sb2.append(", eventFlags=");
        jg.g.x(sb2, this.f3026r, ", categoryId=", this.f3027s, ", categoryCount=");
        sb2.append((int) this.f3028w);
        sb2.append(", packageName='");
        sb2.append(this.f3029x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3020a);
        String str = this.f3021b;
        xb.l(parcel, 3, str);
        xb.l(parcel, 4, this.f3022c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.f3023e);
        xb.l(parcel, 7, this.f3024f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        xb.l(parcel, 8, str);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.f3025n);
        xb.q(parcel, 10, 4);
        parcel.writeInt(this.f3026r);
        xb.q(parcel, 11, 4);
        parcel.writeInt(this.f3027s);
        xb.q(parcel, 12, 4);
        parcel.writeInt(this.f3028w);
        xb.l(parcel, 13, this.f3029x);
        xb.s(parcel, r10);
    }
}
