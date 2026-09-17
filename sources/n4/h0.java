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
    public final int f14954a;
    public final long f14955b;
    public final long f14956c;
    public final float d;
    public final long e;
    public final int f14957f;
    public final CharSequence h;
    public final long f14958n;
    public final AbstractCollection f14959r;
    public final long f14960s;
    public final Bundle v;
    public PlaybackState f14961w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f14954a = i10;
        this.f14955b = j3;
        this.f14956c = j10;
        this.d = f7;
        this.e = j11;
        this.f14957f = i11;
        this.h = charSequence;
        this.f14958n = j12;
        this.f14959r = new ArrayList(arrayList);
        this.f14960s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f14954a);
        sb2.append(", position=");
        sb2.append(this.f14955b);
        sb2.append(", buffered position=");
        sb2.append(this.f14956c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f14958n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f14957f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f14959r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.f14960s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14954a);
        parcel.writeLong(this.f14955b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f14958n);
        parcel.writeLong(this.f14956c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f14959r);
        parcel.writeLong(this.f14960s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f14957f);
    }

    public h0(Parcel parcel) {
        this.f14954a = parcel.readInt();
        this.f14955b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f14958n = parcel.readLong();
        this.f14956c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8084b;
            createTypedArrayList = a1.e;
        }
        this.f14959r = createTypedArrayList;
        this.f14960s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f14957f = parcel.readInt();
    }
}
