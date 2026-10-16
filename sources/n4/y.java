package n4;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new m8.h(7);
    public final int f15757a;
    public final long f15758b;
    public final long f15759c;
    public final float d;
    public final long e;
    public final int f15760f;
    public final CharSequence h;
    public final long f15761n;
    public final AbstractCollection f15762r;
    public final long f15763s;
    public final Bundle v;
    public PlaybackState f15764w;

    public y(int i10, long j10, long j11, float f7, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f15757a = i10;
        this.f15758b = j10;
        this.f15759c = j11;
        this.d = f7;
        this.e = j12;
        this.f15760f = i11;
        this.h = charSequence;
        this.f15761n = j13;
        this.f15762r = new ArrayList(arrayList);
        this.f15763s = j14;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f15757a);
        sb2.append(", position=");
        sb2.append(this.f15758b);
        sb2.append(", buffered position=");
        sb2.append(this.f15759c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f15761n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f15760f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f15762r);
        sb2.append(", active item id=");
        return a1.g.r(sb2, this.f15763s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15757a);
        parcel.writeLong(this.f15758b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f15761n);
        parcel.writeLong(this.f15759c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f15762r);
        parcel.writeLong(this.f15763s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f15760f);
    }

    public y(Parcel parcel) {
        this.f15757a = parcel.readInt();
        this.f15758b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f15761n = parcel.readLong();
        this.f15759c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(x.CREATOR);
        if (createTypedArrayList == null) {
            l0 l0Var = n0.f8595b;
            createTypedArrayList = x1.e;
        }
        this.f15762r = createTypedArrayList;
        this.f15763s = parcel.readLong();
        this.v = parcel.readBundle(s.class.getClassLoader());
        this.f15760f = parcel.readInt();
    }
}
