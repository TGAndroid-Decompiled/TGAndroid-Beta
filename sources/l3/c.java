package l3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class c implements Comparator, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new h5.h(13);
    public final b[] f16633a;
    public int f16634b;
    public final String f16635c;
    public final int d;

    public c(String str, ArrayList arrayList) {
        this(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public final c a(String str) {
        if (f0.a(this.f16635c, str)) {
            return this;
        }
        return new c(str, false, this.f16633a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        UUID uuid = h3.h.f9436a;
        if (uuid.equals(bVar.f16630b)) {
            if (uuid.equals(bVar2.f16630b)) {
                return 0;
            }
            return 1;
        }
        return bVar.f16630b.compareTo(bVar2.f16630b);
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
            if (f0.a(this.f16635c, cVar.f16635c) && Arrays.equals(this.f16633a, cVar.f16633a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16634b == 0) {
            String str = this.f16635c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16634b = (hashCode * 31) + Arrays.hashCode(this.f16633a);
        }
        return this.f16634b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f16635c);
        parcel.writeTypedArray(this.f16633a, 0);
    }

    public c(String str, boolean z10, b... bVarArr) {
        this.f16635c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f16633a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public c(Parcel parcel) {
        this.f16635c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i9 = f0.f4349a;
        this.f16633a = bVarArr;
        this.d = bVarArr.length;
    }
}
