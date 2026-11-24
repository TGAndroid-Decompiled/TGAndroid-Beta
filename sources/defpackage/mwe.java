package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mwe extends b4 {
    public static final Parcelable.Creator<mwe> CREATOR = new c0f((byte) 0);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String h;
    public final byte n;
    public final byte r;
    public final byte s;
    public final byte w;
    public final String x;

    public mwe(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str6;
        this.n = b;
        this.r = b2;
        this.s = b3;
        this.w = b4;
        this.x = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mwe.class != obj.getClass()) {
            return false;
        }
        mwe mweVar = (mwe) obj;
        if (this.a != mweVar.a || this.n != mweVar.n || this.r != mweVar.r || this.s != mweVar.s || this.w != mweVar.w || !this.b.equals(mweVar.b)) {
            return false;
        }
        String str = mweVar.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!this.d.equals(mweVar.d) || !this.e.equals(mweVar.e) || !this.f.equals(mweVar.f)) {
            return false;
        }
        String str3 = mweVar.h;
        String str4 = this.h;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = mweVar.x;
        String str6 = this.x;
        if (str6 != null) {
            return str6.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int j = ir2.j((this.a + 31) * 31, 31, this.b);
        int i3 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int j2 = ir2.j(ir2.j(ir2.j((j + i) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.h;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (((((((((j2 + i2) * 31) + this.n) * 31) + this.r) * 31) + this.s) * 31) + this.w) * 31;
        String str3 = this.x;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AncsNotificationParcelable{, id=");
        sb.append(this.a);
        sb.append(", appId='");
        sb.append(this.b);
        sb.append("', dateTime='");
        sb.append(this.c);
        sb.append("', eventId=");
        sb.append((int) this.n);
        sb.append(", eventFlags=");
        ir2.w(sb, this.r, ", categoryId=", this.s, ", categoryCount=");
        sb.append((int) this.w);
        sb.append(", packageName='");
        sb.append(this.x);
        sb.append("'}");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        String str = this.b;
        jte.l(parcel, 3, str);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.l(parcel, 7, this.f);
        String str2 = this.h;
        if (str2 != null) {
            str = str2;
        }
        jte.l(parcel, 8, str);
        jte.q(parcel, 9, 4);
        parcel.writeInt(this.n);
        jte.q(parcel, 10, 4);
        parcel.writeInt(this.r);
        jte.q(parcel, 11, 4);
        parcel.writeInt(this.s);
        jte.q(parcel, 12, 4);
        parcel.writeInt(this.w);
        jte.l(parcel, 13, this.x);
        jte.s(parcel, r);
    }
}
