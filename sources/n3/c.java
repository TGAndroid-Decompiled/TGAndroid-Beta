package n3;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class c implements Comparator, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new i4.g(26);
    public final b[] f17100a;
    public int f17101b;
    public final String f17102c;
    public final int d;

    public c(String str, ArrayList arrayList) {
        this(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public final c a(String str) {
        if (d0.a(this.f17102c, str)) {
            return this;
        }
        return new c(str, false, this.f17100a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        UUID uuid = j3.h.f10473a;
        if (uuid.equals(bVar.f17097b)) {
            if (uuid.equals(bVar2.f17097b)) {
                return 0;
            }
            return 1;
        }
        return bVar.f17097b.compareTo(bVar2.f17097b);
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
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (d0.a(this.f17102c, cVar.f17102c) && Arrays.equals(this.f17100a, cVar.f17100a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f17101b == 0) {
            String str = this.f17102c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f17101b = (hashCode * 31) + Arrays.hashCode(this.f17100a);
        }
        return this.f17101b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17102c);
        parcel.writeTypedArray(this.f17100a, 0);
    }

    public c(String str, boolean z10, b... bVarArr) {
        this.f17102c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f17100a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public c(Parcel parcel) {
        this.f17102c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i10 = d0.f6579a;
        this.f17100a = bVarArr;
        this.d = bVarArr.length;
    }
}
