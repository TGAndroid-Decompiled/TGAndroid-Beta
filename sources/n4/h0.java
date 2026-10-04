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
    public final int f16585a;
    public final long f16586b;
    public final long f16587c;
    public final float d;
    public final long f16588e;
    public final int f16589f;
    public final CharSequence h;
    public final long f16590n;
    public final AbstractCollection f16591r;
    public final long f16592s;
    public final Bundle v;
    public PlaybackState f16593w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16585a = i10;
        this.f16586b = j3;
        this.f16587c = j10;
        this.d = f7;
        this.f16588e = j11;
        this.f16589f = i11;
        this.h = charSequence;
        this.f16590n = j12;
        this.f16591r = new ArrayList(arrayList);
        this.f16592s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16585a);
        sb2.append(", position=");
        sb2.append(this.f16586b);
        sb2.append(", buffered position=");
        sb2.append(this.f16587c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16590n);
        sb2.append(", actions=");
        sb2.append(this.f16588e);
        sb2.append(", error code=");
        sb2.append(this.f16589f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16591r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.f16592s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16585a);
        parcel.writeLong(this.f16586b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16590n);
        parcel.writeLong(this.f16587c);
        parcel.writeLong(this.f16588e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16591r);
        parcel.writeLong(this.f16592s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16589f);
    }

    public h0(Parcel parcel) {
        this.f16585a = parcel.readInt();
        this.f16586b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16590n = parcel.readLong();
        this.f16587c = parcel.readLong();
        this.f16588e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8757b;
            createTypedArrayList = a1.f8720e;
        }
        this.f16591r = createTypedArrayList;
        this.f16592s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f16589f = parcel.readInt();
    }
}
