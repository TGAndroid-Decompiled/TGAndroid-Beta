package n4;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e9.a1;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new m8.h(9);
    public final int f15172a;
    public final long f15173b;
    public final long f15174c;
    public final float d;
    public final long e;
    public final int f15175f;
    public final CharSequence h;
    public final long f15176n;
    public final AbstractCollection f15177r;
    public final long f15178s;
    public final Bundle v;
    public PlaybackState f15179w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f15172a = i10;
        this.f15173b = j3;
        this.f15174c = j10;
        this.d = f7;
        this.e = j11;
        this.f15175f = i11;
        this.h = charSequence;
        this.f15176n = j12;
        this.f15177r = new ArrayList(arrayList);
        this.f15178s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f15172a);
        sb2.append(", position=");
        sb2.append(this.f15173b);
        sb2.append(", buffered position=");
        sb2.append(this.f15174c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f15176n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f15175f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f15177r);
        sb2.append(", active item id=");
        return a4.a.s(sb2, this.f15178s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15172a);
        parcel.writeLong(this.f15173b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f15176n);
        parcel.writeLong(this.f15174c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f15177r);
        parcel.writeLong(this.f15178s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f15175f);
    }

    public h0(Parcel parcel) {
        this.f15172a = parcel.readInt();
        this.f15173b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f15176n = parcel.readLong();
        this.f15174c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8066b;
            createTypedArrayList = a1.e;
        }
        this.f15177r = createTypedArrayList;
        this.f15178s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f15175f = parcel.readInt();
    }
}
