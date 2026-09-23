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
    public final n[] f3159a;
    public int f3160b;
    public final String f3161c;
    public final int d;

    public o(String str, ArrayList arrayList) {
        this(str, false, (n[]) arrayList.toArray(new n[0]));
    }

    public final o a(String str) {
        if (Objects.equals(this.f3161c, str)) {
            return this;
        }
        return new o(str, false, this.f3159a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        UUID uuid = i.f3009a;
        if (uuid.equals(nVar.f3113b)) {
            if (uuid.equals(nVar2.f3113b)) {
                return 0;
            }
            return 1;
        }
        return nVar.f3113b.compareTo(nVar2.f3113b);
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
            if (Objects.equals(this.f3161c, oVar.f3161c) && Arrays.equals(this.f3159a, oVar.f3159a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3160b == 0) {
            String str = this.f3161c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3160b = (hashCode * 31) + Arrays.hashCode(this.f3159a);
        }
        return this.f3160b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3161c);
        parcel.writeTypedArray(this.f3159a, 0);
    }

    public o(String str, boolean z10, n... nVarArr) {
        this.f3161c = str;
        nVarArr = z10 ? (n[]) nVarArr.clone() : nVarArr;
        this.f3159a = nVarArr;
        this.d = nVarArr.length;
        Arrays.sort(nVarArr, this);
    }

    public o(Parcel parcel) {
        this.f3161c = parcel.readString();
        n[] nVarArr = (n[]) parcel.createTypedArray(n.CREATOR);
        String str = e2.d0.f7871a;
        this.f3159a = nVarArr;
        this.d = nVarArr.length;
    }
}
