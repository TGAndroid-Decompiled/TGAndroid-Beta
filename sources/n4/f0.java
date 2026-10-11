package n4;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e9.a1;
import e9.i0;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(9);
    public final int f16603a;
    public final long f16604b;
    public final long f16605c;
    public final float d;
    public final long f16606e;
    public final int f16607f;
    public final CharSequence h;
    public final long f16608n;
    public final AbstractCollection f16609r;
    public final long f16610s;
    public final Bundle v;
    public PlaybackState f16611w;

    public f0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16603a = i10;
        this.f16604b = j3;
        this.f16605c = j10;
        this.d = f7;
        this.f16606e = j11;
        this.f16607f = i11;
        this.h = charSequence;
        this.f16608n = j12;
        this.f16609r = new ArrayList(arrayList);
        this.f16610s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16603a);
        sb2.append(", position=");
        sb2.append(this.f16604b);
        sb2.append(", buffered position=");
        sb2.append(this.f16605c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16608n);
        sb2.append(", actions=");
        sb2.append(this.f16606e);
        sb2.append(", error code=");
        sb2.append(this.f16607f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16609r);
        sb2.append(", active item id=");
        return a1.g.s(sb2, this.f16610s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16603a);
        parcel.writeLong(this.f16604b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16608n);
        parcel.writeLong(this.f16605c);
        parcel.writeLong(this.f16606e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16609r);
        parcel.writeLong(this.f16610s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16607f);
    }

    public f0(Parcel parcel) {
        this.f16603a = parcel.readInt();
        this.f16604b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16608n = parcel.readLong();
        this.f16605c = parcel.readLong();
        this.f16606e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(e0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = i0.f8751b;
            createTypedArrayList = a1.f8714e;
        }
        this.f16609r = createTypedArrayList;
        this.f16610s = parcel.readLong();
        this.v = parcel.readBundle(x.class.getClassLoader());
        this.f16607f = parcel.readInt();
    }
}
