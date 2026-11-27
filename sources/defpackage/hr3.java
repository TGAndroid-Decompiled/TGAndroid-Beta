package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
public final class hr3 implements Comparator, Parcelable {
    public static final Parcelable.Creator<hr3> CREATOR = new g31((byte) 15);
    public final gr3[] a;
    public int b;
    public final String c;
    public final int d;

    public hr3(Parcel parcel) {
        this.c = parcel.readString();
        gr3[] gr3VarArr = (gr3[]) parcel.createTypedArray(gr3.CREATOR);
        String str = gcc.a;
        this.a = gr3VarArr;
        this.d = gr3VarArr.length;
    }

    public final hr3 a(String str) {
        if (Objects.equals(this.c, str)) {
            return this;
        }
        return new hr3(str, false, this.a);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        gr3 gr3Var = (gr3) obj;
        gr3 gr3Var2 = (gr3) obj2;
        UUID uuid = o51.b;
        if (uuid.equals(gr3Var.b)) {
            if (uuid.equals(gr3Var2.b)) {
                return 0;
            }
            return 1;
        }
        return gr3Var.b.compareTo(gr3Var2.b);
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
        if (obj != null && hr3.class == obj.getClass()) {
            hr3 hr3Var = (hr3) obj;
            if (Objects.equals(this.c, hr3Var.c) && Arrays.equals(this.a, hr3Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        if (i == 0) {
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.a);
            this.b = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public hr3(String str, boolean z, gr3... gr3VarArr) {
        this.c = str;
        gr3VarArr = z ? (gr3[]) gr3VarArr.clone() : gr3VarArr;
        this.a = gr3VarArr;
        this.d = gr3VarArr.length;
        Arrays.sort(gr3VarArr, this);
    }

    public hr3(String str, ArrayList arrayList) {
        this(str, false, (gr3[]) arrayList.toArray(new gr3[0]));
    }
}
