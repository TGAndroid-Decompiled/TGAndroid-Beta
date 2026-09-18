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
    public final int f15129a;
    public final long f15130b;
    public final long f15131c;
    public final float d;
    public final long e;
    public final int f15132f;
    public final CharSequence h;
    public final long f15133n;
    public final AbstractCollection f15134r;
    public final long f15135s;
    public final Bundle v;
    public PlaybackState f15136w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f15129a = i10;
        this.f15130b = j3;
        this.f15131c = j10;
        this.d = f7;
        this.e = j11;
        this.f15132f = i11;
        this.h = charSequence;
        this.f15133n = j12;
        this.f15134r = new ArrayList(arrayList);
        this.f15135s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f15129a);
        sb2.append(", position=");
        sb2.append(this.f15130b);
        sb2.append(", buffered position=");
        sb2.append(this.f15131c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f15133n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f15132f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f15134r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.f15135s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15129a);
        parcel.writeLong(this.f15130b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f15133n);
        parcel.writeLong(this.f15131c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f15134r);
        parcel.writeLong(this.f15135s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f15132f);
    }

    public h0(Parcel parcel) {
        this.f15129a = parcel.readInt();
        this.f15130b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f15133n = parcel.readLong();
        this.f15131c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8083b;
            createTypedArrayList = a1.e;
        }
        this.f15134r = createTypedArrayList;
        this.f15135s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f15132f = parcel.readInt();
    }
}
