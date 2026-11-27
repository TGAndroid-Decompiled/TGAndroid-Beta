package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class nhf extends c4 {
    public static final Parcelable.Creator<nhf> CREATOR = new t4f((byte) 24);
    public final boolean a;
    public final ArrayList b;

    public nhf(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nhf.class == obj.getClass()) {
                nhf nhfVar = (nhf) obj;
                if (this.a == nhfVar.a) {
                    ArrayList arrayList = nhfVar.b;
                    ArrayList arrayList2 = this.b;
                    if (arrayList2 != arrayList) {
                        if (arrayList2 != null && arrayList2.equals(arrayList)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.n(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
