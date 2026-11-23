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
    public final q[] f10676a;
    public int f10677b;
    public final String f10678c;
    public final int d;

    public r(String str, ArrayList arrayList) {
        this(str, false, (q[]) arrayList.toArray(new q[0]));
    }

    public final r a(String str) {
        if (Objects.equals(this.f10678c, str)) {
            return this;
        }
        return new r(str, false, this.f10676a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        UUID uuid = l.f10485b;
        if (uuid.equals(qVar.f10627b)) {
            if (uuid.equals(qVar2.f10627b)) {
                return 0;
            }
            return 1;
        }
        return qVar.f10627b.compareTo(qVar2.f10627b);
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
            if (Objects.equals(this.f10678c, rVar.f10678c) && Arrays.equals(this.f10676a, rVar.f10676a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10677b == 0) {
            String str = this.f10678c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10677b = (hashCode * 31) + Arrays.hashCode(this.f10676a);
        }
        return this.f10677b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10678c);
        parcel.writeTypedArray(this.f10676a, 0);
    }

    public r(String str, boolean z10, q... qVarArr) {
        this.f10678c = str;
        qVarArr = z10 ? (q[]) qVarArr.clone() : qVarArr;
        this.f10676a = qVarArr;
        this.d = qVarArr.length;
        Arrays.sort(qVarArr, this);
    }

    public r(Parcel parcel) {
        this.f10678c = parcel.readString();
        q[] qVarArr = (q[]) parcel.createTypedArray(q.CREATOR);
        String str = h2.l0.f13778a;
        this.f10676a = qVarArr;
        this.d = qVarArr.length;
    }
}
