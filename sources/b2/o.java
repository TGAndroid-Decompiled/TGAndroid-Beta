package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class o implements Comparator, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m(0);
    public final n[] f2222a;
    public int f2223b;
    public final String f2224c;
    public final int d;

    public o(String str, ArrayList arrayList) {
        this(str, false, (n[]) arrayList.toArray(new n[0]));
    }

    public final o a(String str) {
        if (Objects.equals(this.f2224c, str)) {
            return this;
        }
        return new o(str, false, this.f2222a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        UUID uuid = i.f2060a;
        if (uuid.equals(nVar.f2174b)) {
            if (uuid.equals(nVar2.f2174b)) {
                return 0;
            }
            return 1;
        }
        return nVar.f2174b.compareTo(nVar2.f2174b);
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
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f2224c, oVar.f2224c) && Arrays.equals(this.f2222a, oVar.f2222a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2223b == 0) {
            String str = this.f2224c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2223b = (hashCode * 31) + Arrays.hashCode(this.f2222a);
        }
        return this.f2223b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2224c);
        parcel.writeTypedArray(this.f2222a, 0);
    }

    public o(String str, boolean z10, n... nVarArr) {
        this.f2224c = str;
        nVarArr = z10 ? (n[]) nVarArr.clone() : nVarArr;
        this.f2222a = nVarArr;
        this.d = nVarArr.length;
        Arrays.sort(nVarArr, this);
    }

    public o(Parcel parcel) {
        this.f2224c = parcel.readString();
        n[] nVarArr = (n[]) parcel.createTypedArray(n.CREATOR);
        String str = e2.d0.f8737a;
        this.f2222a = nVarArr;
        this.d = nVarArr.length;
    }
}
