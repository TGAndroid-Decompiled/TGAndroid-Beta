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
    public final String f18941a;
    public final String f18942b;
    public final List f18943c;

    public u(String str, String str2, List list) {
        this.f18941a = str;
        this.f18942b = str2;
        this.f18943c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f18941a, uVar.f18941a) && TextUtils.equals(this.f18942b, uVar.f18942b) && this.f18943c.equals(uVar.f18943c)) {
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
        int i9;
        int i10 = 0;
        String str = this.f18941a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = i9 * 31;
        String str2 = this.f18942b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f18943c.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f18941a;
        if (str2 != null) {
            str = aa.d.r(aa.d.t(" [", str2, ", "), this.f18942b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f18941a);
        parcel.writeString(this.f18942b);
        List list = this.f18943c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }

    public u(Parcel parcel) {
        this.f18941a = parcel.readString();
        this.f18942b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f18943c = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
