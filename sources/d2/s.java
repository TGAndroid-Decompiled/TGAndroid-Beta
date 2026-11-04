package d2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class s implements Comparator, Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new q(0);
    public final r[] f8363a;
    public int f8364b;
    public final String f8365c;
    public final int d;

    public s(String str, ArrayList arrayList) {
        this(str, false, (r[]) arrayList.toArray(new r[0]));
    }

    public final s a(String str) {
        if (Objects.equals(this.f8365c, str)) {
            return this;
        }
        return new s(str, false, this.f8363a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        UUID uuid = m.f8183b;
        if (uuid.equals(rVar.f8337b)) {
            if (uuid.equals(rVar2.f8337b)) {
                return 0;
            }
            return 1;
        }
        return rVar.f8337b.compareTo(rVar2.f8337b);
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
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (Objects.equals(this.f8365c, sVar.f8365c) && Arrays.equals(this.f8363a, sVar.f8363a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f8364b == 0) {
            String str = this.f8365c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f8364b = (hashCode * 31) + Arrays.hashCode(this.f8363a);
        }
        return this.f8364b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f8365c);
        parcel.writeTypedArray(this.f8363a, 0);
    }

    public s(String str, boolean z10, r... rVarArr) {
        this.f8365c = str;
        rVarArr = z10 ? (r[]) rVarArr.clone() : rVarArr;
        this.f8363a = rVarArr;
        this.d = rVarArr.length;
        Arrays.sort(rVarArr, this);
    }

    public s(Parcel parcel) {
        this.f8365c = parcel.readString();
        r[] rVarArr = (r[]) parcel.createTypedArray(r.CREATOR);
        String str = g2.n0.f11873a;
        this.f8363a = rVarArr;
        this.d = rVarArr.length;
    }
}
