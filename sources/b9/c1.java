package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new o0(9);
    public final int f2995a;
    public final String f2996b;
    public final String f2997c;
    public final String d;
    public final String f2998e;
    public final String f2999f;
    public final String h;
    public final byte f3000n;
    public final byte f3001r;
    public final byte f3002s;
    public final byte f3003w;
    public final String f3004x;

    public c1(int i7, String str, String str2, String str3, String str4, String str5, String str6, byte b10, byte b11, byte b12, byte b13, String str7) {
        this.f2995a = i7;
        this.f2996b = str;
        this.f2997c = str2;
        this.d = str3;
        this.f2998e = str4;
        this.f2999f = str5;
        this.h = str6;
        this.f3000n = b10;
        this.f3001r = b11;
        this.f3002s = b12;
        this.f3003w = b13;
        this.f3004x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        String str = c1Var.f3004x;
        String str2 = c1Var.h;
        String str3 = c1Var.f2997c;
        if (this.f2995a != c1Var.f2995a || this.f3000n != c1Var.f3000n || this.f3001r != c1Var.f3001r || this.f3002s != c1Var.f3002s || this.f3003w != c1Var.f3003w || !this.f2996b.equals(c1Var.f2996b)) {
            return false;
        }
        String str4 = this.f2997c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.d.equals(c1Var.d) || !this.f2998e.equals(c1Var.f2998e) || !this.f2999f.equals(c1Var.f2999f)) {
            return false;
        }
        String str5 = this.h;
        if (str5 == null ? str2 != null : !str5.equals(str2)) {
            return false;
        }
        String str6 = this.f3004x;
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
        int h = e2.h((this.f2995a + 31) * 31, 31, this.f2996b);
        int i11 = 0;
        String str = this.f2997c;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int h7 = e2.h(e2.h(e2.h((h + i7) * 31, 31, this.d), 31, this.f2998e), 31, this.f2999f);
        String str2 = this.h;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (((((((((h7 + i10) * 31) + this.f3000n) * 31) + this.f3001r) * 31) + this.f3002s) * 31) + this.f3003w) * 31;
        String str3 = this.f3004x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AncsNotificationParcelable{, id=");
        sb2.append(this.f2995a);
        sb2.append(", appId='");
        sb2.append(this.f2996b);
        sb2.append("', dateTime='");
        sb2.append(this.f2997c);
        sb2.append("', eventId=");
        sb2.append((int) this.f3000n);
        sb2.append(", eventFlags=");
        i5.c.z(sb2, this.f3001r, ", categoryId=", this.f3002s, ", categoryCount=");
        sb2.append((int) this.f3003w);
        sb2.append(", packageName='");
        sb2.append(this.f3004x);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f2995a);
        String str = this.f2996b;
        bc.l(parcel, 3, str);
        bc.l(parcel, 4, this.f2997c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f2998e);
        bc.l(parcel, 7, this.f2999f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        bc.l(parcel, 8, str);
        bc.q(parcel, 9, 4);
        parcel.writeInt(this.f3000n);
        bc.q(parcel, 10, 4);
        parcel.writeInt(this.f3001r);
        bc.q(parcel, 11, 4);
        parcel.writeInt(this.f3002s);
        bc.q(parcel, 12, 4);
        parcel.writeInt(this.f3003w);
        bc.l(parcel, 13, this.f3004x);
        bc.s(parcel, r10);
    }
}
