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
    public final int f15157a;
    public final long f15158b;
    public final long f15159c;
    public final float d;
    public final long e;
    public final int f15160f;
    public final CharSequence h;
    public final long f15161n;
    public final AbstractCollection f15162r;
    public final long f15163s;
    public final Bundle v;
    public PlaybackState f15164w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f15157a = i10;
        this.f15158b = j3;
        this.f15159c = j10;
        this.d = f7;
        this.e = j11;
        this.f15160f = i11;
        this.h = charSequence;
        this.f15161n = j12;
        this.f15162r = new ArrayList(arrayList);
        this.f15163s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f15157a);
        sb2.append(", position=");
        sb2.append(this.f15158b);
        sb2.append(", buffered position=");
        sb2.append(this.f15159c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f15161n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f15160f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f15162r);
        sb2.append(", active item id=");
        return a4.a.s(sb2, this.f15163s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15157a);
        parcel.writeLong(this.f15158b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f15161n);
        parcel.writeLong(this.f15159c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f15162r);
        parcel.writeLong(this.f15163s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f15160f);
    }

    public h0(Parcel parcel) {
        this.f15157a = parcel.readInt();
        this.f15158b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f15161n = parcel.readLong();
        this.f15159c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8066b;
            createTypedArrayList = a1.e;
        }
        this.f15162r = createTypedArrayList;
        this.f15163s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f15160f = parcel.readInt();
    }
}
