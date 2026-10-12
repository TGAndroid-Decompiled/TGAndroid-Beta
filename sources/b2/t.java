package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class t implements Comparator, Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new r(0);
    public final s[] f2370a;
    public int f2371b;
    public final String f2372c;
    public final int d;

    public t(String str, ArrayList arrayList) {
        this(str, false, (s[]) arrayList.toArray(new s[0]));
    }

    public final t a(String str) {
        if (Objects.equals(this.f2372c, str)) {
            return this;
        }
        return new t(str, false, this.f2370a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        UUID uuid = n.f2217b;
        if (uuid.equals(sVar.f2321b)) {
            if (uuid.equals(sVar2.f2321b)) {
                return 0;
            }
            return 1;
        }
        return sVar.f2321b.compareTo(sVar2.f2321b);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (Objects.equals(this.f2372c, tVar.f2372c) && Arrays.equals(this.f2370a, tVar.f2370a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2371b == 0) {
            String str = this.f2372c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2371b = (hashCode * 31) + Arrays.hashCode(this.f2370a);
        }
        return this.f2371b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2372c);
        parcel.writeTypedArray(this.f2370a, 0);
    }

    public t(String str, boolean z10, s... sVarArr) {
        this.f2372c = str;
        sVarArr = z10 ? (s[]) sVarArr.clone() : sVarArr;
        this.f2370a = sVarArr;
        this.d = sVarArr.length;
        Arrays.sort(sVarArr, this);
    }

    public t(Parcel parcel) {
        this.f2372c = parcel.readString();
        s[] sVarArr = (s[]) parcel.createTypedArray(s.CREATOR);
        String str = e2.m0.f8372a;
        this.f2370a = sVarArr;
        this.d = sVarArr.length;
    }
}
