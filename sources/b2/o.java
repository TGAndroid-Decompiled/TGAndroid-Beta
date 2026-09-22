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
    public final n[] f3166a;
    public int f3167b;
    public final String f3168c;
    public final int d;

    public o(String str, ArrayList arrayList) {
        this(str, false, (n[]) arrayList.toArray(new n[0]));
    }

    public final o a(String str) {
        if (Objects.equals(this.f3168c, str)) {
            return this;
        }
        return new o(str, false, this.f3166a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        UUID uuid = i.f3016a;
        if (uuid.equals(nVar.f3120b)) {
            if (uuid.equals(nVar2.f3120b)) {
                return 0;
            }
            return 1;
        }
        return nVar.f3120b.compareTo(nVar2.f3120b);
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
            if (Objects.equals(this.f3168c, oVar.f3168c) && Arrays.equals(this.f3166a, oVar.f3166a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3167b == 0) {
            String str = this.f3168c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3167b = (hashCode * 31) + Arrays.hashCode(this.f3166a);
        }
        return this.f3167b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3168c);
        parcel.writeTypedArray(this.f3166a, 0);
    }

    public o(String str, boolean z10, n... nVarArr) {
        this.f3168c = str;
        nVarArr = z10 ? (n[]) nVarArr.clone() : nVarArr;
        this.f3166a = nVarArr;
        this.d = nVarArr.length;
        Arrays.sort(nVarArr, this);
    }

    public o(Parcel parcel) {
        this.f3168c = parcel.readString();
        n[] nVarArr = (n[]) parcel.createTypedArray(n.CREATOR);
        String str = e2.d0.f7887a;
        this.f3166a = nVarArr;
        this.d = nVarArr.length;
    }
}
