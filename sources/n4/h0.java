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
    public final int f16584a;
    public final long f16585b;
    public final long f16586c;
    public final float d;
    public final long f16587e;
    public final int f16588f;
    public final CharSequence h;
    public final long f16589n;
    public final AbstractCollection f16590r;
    public final long f16591s;
    public final Bundle v;
    public PlaybackState f16592w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16584a = i10;
        this.f16585b = j3;
        this.f16586c = j10;
        this.d = f7;
        this.f16587e = j11;
        this.f16588f = i11;
        this.h = charSequence;
        this.f16589n = j12;
        this.f16590r = new ArrayList(arrayList);
        this.f16591s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16584a);
        sb2.append(", position=");
        sb2.append(this.f16585b);
        sb2.append(", buffered position=");
        sb2.append(this.f16586c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16589n);
        sb2.append(", actions=");
        sb2.append(this.f16587e);
        sb2.append(", error code=");
        sb2.append(this.f16588f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16590r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.f16591s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16584a);
        parcel.writeLong(this.f16585b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16589n);
        parcel.writeLong(this.f16586c);
        parcel.writeLong(this.f16587e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16590r);
        parcel.writeLong(this.f16591s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16588f);
    }

    public h0(Parcel parcel) {
        this.f16584a = parcel.readInt();
        this.f16585b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16589n = parcel.readLong();
        this.f16586c = parcel.readLong();
        this.f16587e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8757b;
            createTypedArrayList = a1.f8720e;
        }
        this.f16590r = createTypedArrayList;
        this.f16591s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f16588f = parcel.readInt();
    }
}
