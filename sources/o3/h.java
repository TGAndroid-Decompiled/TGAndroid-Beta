package o3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class h implements Comparator, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new l4.j(14);
    public final g[] f16245a;
    public int f16246b;
    public final String f16247c;
    public final int d;

    public h(String str, ArrayList arrayList) {
        this(str, false, (g[]) arrayList.toArray(new g[0]));
    }

    public final h a(String str) {
        if (h5.d0.a(this.f16247c, str)) {
            return this;
        }
        return new h(str, false, this.f16245a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        UUID uuid = j3.h.f8575a;
        if (uuid.equals(gVar.f16243b)) {
            if (uuid.equals(gVar2.f16243b)) {
                return 0;
            }
            return 1;
        }
        return gVar.f16243b.compareTo(gVar2.f16243b);
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
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (h5.d0.a(this.f16247c, hVar.f16247c) && Arrays.equals(this.f16245a, hVar.f16245a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16246b == 0) {
            String str = this.f16247c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16246b = (hashCode * 31) + Arrays.hashCode(this.f16245a);
        }
        return this.f16246b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16247c);
        parcel.writeTypedArray(this.f16245a, 0);
    }

    public h(String str, boolean z4, g... gVarArr) {
        this.f16247c = str;
        gVarArr = z4 ? (g[]) gVarArr.clone() : gVarArr;
        this.f16245a = gVarArr;
        this.d = gVarArr.length;
        Arrays.sort(gVarArr, this);
    }

    public h(Parcel parcel) {
        this.f16247c = parcel.readString();
        g[] gVarArr = (g[]) parcel.createTypedArray(g.CREATOR);
        int i10 = h5.d0.f6924a;
        this.f16245a = gVarArr;
        this.d = gVarArr.length;
    }
}
