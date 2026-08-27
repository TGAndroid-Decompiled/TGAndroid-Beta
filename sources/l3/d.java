package l3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new h5.h(20);

    public final c[] f15390a;

    public int f15391b;

    public final String f15392c;
    public final int d;

    public d(String str, ArrayList arrayList) {
        this(str, false, (c[]) arrayList.toArray(new c[0]));
    }

    public final d a(String str) {
        return g0.a(this.f15392c, str) ? this : new d(str, false, this.f15390a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = h3.h.f7866a;
        if (uuid.equals(cVar.f15387b)) {
            return uuid.equals(cVar2.f15387b) ? 0 : 1;
        }
        return cVar.f15387b.compareTo(cVar2.f15387b);
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (g0.a(this.f15392c, dVar.f15392c) && Arrays.equals(this.f15390a, dVar.f15390a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15391b == 0) {
            String str = this.f15392c;
            this.f15391b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15390a);
        }
        return this.f15391b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15392c);
        parcel.writeTypedArray(this.f15390a, 0);
    }

    public d(String str, boolean z10, c... cVarArr) {
        this.f15392c = str;
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        this.f15390a = cVarArr;
        this.d = cVarArr.length;
        Arrays.sort(cVarArr, this);
    }

    public d(Parcel parcel) {
        this.f15392c = parcel.readString();
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        int i10 = g0.f4795a;
        this.f15390a = cVarArr;
        this.d = cVarArr.length;
    }
}
