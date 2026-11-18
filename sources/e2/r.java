package e2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class r implements Comparator, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new p(0);
    public final q[] f10681a;
    public int f10682b;
    public final String f10683c;
    public final int d;

    public r(String str, ArrayList arrayList) {
        this(str, false, (q[]) arrayList.toArray(new q[0]));
    }

    public final r a(String str) {
        if (Objects.equals(this.f10683c, str)) {
            return this;
        }
        return new r(str, false, this.f10681a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        UUID uuid = l.f10490b;
        if (uuid.equals(qVar.f10632b)) {
            if (uuid.equals(qVar2.f10632b)) {
                return 0;
            }
            return 1;
        }
        return qVar.f10632b.compareTo(qVar2.f10632b);
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
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (Objects.equals(this.f10683c, rVar.f10683c) && Arrays.equals(this.f10681a, rVar.f10681a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10682b == 0) {
            String str = this.f10683c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10682b = (hashCode * 31) + Arrays.hashCode(this.f10681a);
        }
        return this.f10682b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10683c);
        parcel.writeTypedArray(this.f10681a, 0);
    }

    public r(String str, boolean z10, q... qVarArr) {
        this.f10683c = str;
        qVarArr = z10 ? (q[]) qVarArr.clone() : qVarArr;
        this.f10681a = qVarArr;
        this.d = qVarArr.length;
        Arrays.sort(qVarArr, this);
    }

    public r(Parcel parcel) {
        this.f10683c = parcel.readString();
        q[] qVarArr = (q[]) parcel.createTypedArray(q.CREATOR);
        String str = h2.l0.f13783a;
        this.f10681a = qVarArr;
        this.d = qVarArr.length;
    }
}
