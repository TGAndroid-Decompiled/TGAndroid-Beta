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
    public final s[] f2274a;
    public int f2275b;
    public final String f2276c;
    public final int d;

    public t(String str, ArrayList arrayList) {
        this(str, false, (s[]) arrayList.toArray(new s[0]));
    }

    public final t a(String str) {
        if (Objects.equals(this.f2276c, str)) {
            return this;
        }
        return new t(str, false, this.f2274a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        UUID uuid = n.f2120b;
        if (uuid.equals(sVar.f2225b)) {
            if (uuid.equals(sVar2.f2225b)) {
                return 0;
            }
            return 1;
        }
        return sVar.f2225b.compareTo(sVar2.f2225b);
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
            if (Objects.equals(this.f2276c, tVar.f2276c) && Arrays.equals(this.f2274a, tVar.f2274a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2275b == 0) {
            String str = this.f2276c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2275b = (hashCode * 31) + Arrays.hashCode(this.f2274a);
        }
        return this.f2275b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2276c);
        parcel.writeTypedArray(this.f2274a, 0);
    }

    public t(String str, boolean z10, s... sVarArr) {
        this.f2276c = str;
        sVarArr = z10 ? (s[]) sVarArr.clone() : sVarArr;
        this.f2274a = sVarArr;
        this.d = sVarArr.length;
        Arrays.sort(sVarArr, this);
    }

    public t(Parcel parcel) {
        this.f2276c = parcel.readString();
        s[] sVarArr = (s[]) parcel.createTypedArray(s.CREATOR);
        String str = e2.l0.f6165a;
        this.f2274a = sVarArr;
        this.d = sVarArr.length;
    }
}
