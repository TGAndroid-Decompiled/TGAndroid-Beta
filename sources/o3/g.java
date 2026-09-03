package o3;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class g implements Comparator, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new l4.j(14);
    public final f[] f16403a;
    public int f16404b;
    public final String f16405c;
    public final int d;

    public g(String str, ArrayList arrayList) {
        this(str, false, (f[]) arrayList.toArray(new f[0]));
    }

    public final g a(String str) {
        if (d0.a(this.f16405c, str)) {
            return this;
        }
        return new g(str, false, this.f16403a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        UUID uuid = j3.h.f9162a;
        if (uuid.equals(fVar.f16400b)) {
            if (uuid.equals(fVar2.f16400b)) {
                return 0;
            }
            return 1;
        }
        return fVar.f16400b.compareTo(fVar2.f16400b);
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
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (d0.a(this.f16405c, gVar.f16405c) && Arrays.equals(this.f16403a, gVar.f16403a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16404b == 0) {
            String str = this.f16405c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16404b = (hashCode * 31) + Arrays.hashCode(this.f16403a);
        }
        return this.f16404b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16405c);
        parcel.writeTypedArray(this.f16403a, 0);
    }

    public g(String str, boolean z4, f... fVarArr) {
        this.f16405c = str;
        fVarArr = z4 ? (f[]) fVarArr.clone() : fVarArr;
        this.f16403a = fVarArr;
        this.d = fVarArr.length;
        Arrays.sort(fVarArr, this);
    }

    public g(Parcel parcel) {
        this.f16405c = parcel.readString();
        f[] fVarArr = (f[]) parcel.createTypedArray(f.CREATOR);
        int i10 = d0.f7237a;
        this.f16403a = fVarArr;
        this.d = fVarArr.length;
    }
}
