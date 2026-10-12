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
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(9);
    public final int f16307a;
    public final long f16308b;
    public final long f16309c;
    public final float d;
    public final long f16310e;
    public final int f16311f;
    public final CharSequence h;
    public final long f16312n;
    public final AbstractCollection f16313r;
    public final long f16314s;
    public final Bundle v;
    public PlaybackState f16315w;

    public g0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16307a = i10;
        this.f16308b = j3;
        this.f16309c = j10;
        this.d = f7;
        this.f16310e = j11;
        this.f16311f = i11;
        this.h = charSequence;
        this.f16312n = j12;
        this.f16313r = new ArrayList(arrayList);
        this.f16314s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16307a);
        sb2.append(", position=");
        sb2.append(this.f16308b);
        sb2.append(", buffered position=");
        sb2.append(this.f16309c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16312n);
        sb2.append(", actions=");
        sb2.append(this.f16310e);
        sb2.append(", error code=");
        sb2.append(this.f16311f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16313r);
        sb2.append(", active item id=");
        return a1.g.s(sb2, this.f16314s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16307a);
        parcel.writeLong(this.f16308b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16312n);
        parcel.writeLong(this.f16309c);
        parcel.writeLong(this.f16310e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16313r);
        parcel.writeLong(this.f16314s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16311f);
    }

    public g0(Parcel parcel) {
        this.f16307a = parcel.readInt();
        this.f16308b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16312n = parcel.readLong();
        this.f16309c = parcel.readLong();
        this.f16310e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(f0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = i0.f8749b;
            createTypedArrayList = a1.f8712e;
        }
        this.f16313r = createTypedArrayList;
        this.f16314s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f16311f = parcel.readInt();
    }
}
