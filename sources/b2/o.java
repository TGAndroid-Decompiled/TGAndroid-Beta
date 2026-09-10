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
    public final n[] f1860a;
    public int f1861b;
    public final String f1862c;
    public final int d;

    public o(String str, ArrayList arrayList) {
        this(str, false, (n[]) arrayList.toArray(new n[0]));
    }

    public final o a(String str) {
        if (Objects.equals(this.f1862c, str)) {
            return this;
        }
        return new o(str, false, this.f1860a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        UUID uuid = i.f1710a;
        if (uuid.equals(nVar.f1814b)) {
            if (uuid.equals(nVar2.f1814b)) {
                return 0;
            }
            return 1;
        }
        return nVar.f1814b.compareTo(nVar2.f1814b);
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
            if (Objects.equals(this.f1862c, oVar.f1862c) && Arrays.equals(this.f1860a, oVar.f1860a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1861b == 0) {
            String str = this.f1862c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f1861b = (hashCode * 31) + Arrays.hashCode(this.f1860a);
        }
        return this.f1861b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1862c);
        parcel.writeTypedArray(this.f1860a, 0);
    }

    public o(String str, boolean z10, n... nVarArr) {
        this.f1862c = str;
        nVarArr = z10 ? (n[]) nVarArr.clone() : nVarArr;
        this.f1860a = nVarArr;
        this.d = nVarArr.length;
        Arrays.sort(nVarArr, this);
    }

    public o(Parcel parcel) {
        this.f1862c = parcel.readString();
        n[] nVarArr = (n[]) parcel.createTypedArray(n.CREATOR);
        String str = e2.d0.f7188a;
        this.f1860a = nVarArr;
        this.d = nVarArr.length;
    }
}
