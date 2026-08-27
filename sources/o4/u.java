package o4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h3.g1;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class u implements z3.b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);

    public final String f19288a;

    public final String f19289b;

    public final List f19290c;

    public u(String str, String str2, List list) {
        this.f19288a = str;
        this.f19289b = str2;
        this.f19290c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f19288a, uVar.f19288a) && TextUtils.equals(this.f19289b, uVar.f19289b) && this.f19290c.equals(uVar.f19290c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        String str = this.f19288a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19289b;
        return this.f19290c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f19288a;
        sb2.append(str != null ? a9.p.p(a9.p.r(" [", str, ", "), this.f19289b, "]") : "");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19288a);
        parcel.writeString(this.f19289b);
        List list = this.f19290c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public u(Parcel parcel) {
        this.f19288a = parcel.readString();
        this.f19289b = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f19290c = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
