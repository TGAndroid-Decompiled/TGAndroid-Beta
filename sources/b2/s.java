package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class s implements Comparator, Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new q(0);
    public final r[] f3982a;
    public int f3983b;
    public final String f3984c;
    public final int d;

    public s(String str, ArrayList arrayList) {
        this(str, false, (r[]) arrayList.toArray(new r[0]));
    }

    public final s a(String str) {
        if (Objects.equals(this.f3984c, str)) {
            return this;
        }
        return new s(str, false, this.f3982a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        UUID uuid = m.f3829b;
        if (uuid.equals(rVar.f3933b)) {
            if (uuid.equals(rVar2.f3933b)) {
                return 0;
            }
            return 1;
        }
        return rVar.f3933b.compareTo(rVar2.f3933b);
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
            if (Objects.equals(this.f3984c, sVar.f3984c) && Arrays.equals(this.f3982a, sVar.f3982a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3983b == 0) {
            String str = this.f3984c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3983b = (hashCode * 31) + Arrays.hashCode(this.f3982a);
        }
        return this.f3983b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3984c);
        parcel.writeTypedArray(this.f3982a, 0);
    }

    public s(String str, boolean z10, r... rVarArr) {
        this.f3984c = str;
        rVarArr = z10 ? (r[]) rVarArr.clone() : rVarArr;
        this.f3982a = rVarArr;
        this.d = rVarArr.length;
        Arrays.sort(rVarArr, this);
    }

    public s(Parcel parcel) {
        this.f3984c = parcel.readString();
        r[] rVarArr = (r[]) parcel.createTypedArray(r.CREATOR);
        String str = e2.m0.f8254a;
        this.f3982a = rVarArr;
        this.d = rVarArr.length;
    }
}
