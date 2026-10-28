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
    public final s[] f3437a;
    public int f3438b;
    public final String f3439c;
    public final int d;

    public t(String str, ArrayList arrayList) {
        this(str, false, (s[]) arrayList.toArray(new s[0]));
    }

    public final t a(String str) {
        if (Objects.equals(this.f3439c, str)) {
            return this;
        }
        return new t(str, false, this.f3437a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        UUID uuid = n.f3284b;
        if (uuid.equals(sVar.f3388b)) {
            if (uuid.equals(sVar2.f3388b)) {
                return 0;
            }
            return 1;
        }
        return sVar.f3388b.compareTo(sVar2.f3388b);
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
            if (Objects.equals(this.f3439c, tVar.f3439c) && Arrays.equals(this.f3437a, tVar.f3437a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3438b == 0) {
            String str = this.f3439c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3438b = (hashCode * 31) + Arrays.hashCode(this.f3437a);
        }
        return this.f3438b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3439c);
        parcel.writeTypedArray(this.f3437a, 0);
    }

    public t(String str, boolean z10, s... sVarArr) {
        this.f3439c = str;
        sVarArr = z10 ? (s[]) sVarArr.clone() : sVarArr;
        this.f3437a = sVarArr;
        this.d = sVarArr.length;
        Arrays.sort(sVarArr, this);
    }

    public t(Parcel parcel) {
        this.f3439c = parcel.readString();
        s[] sVarArr = (s[]) parcel.createTypedArray(s.CREATOR);
        String str = e2.n0.f9691a;
        this.f3437a = sVarArr;
        this.d = sVarArr.length;
    }
}
