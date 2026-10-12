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
    public final int f16308a;
    public final long f16309b;
    public final long f16310c;
    public final float d;
    public final long f16311e;
    public final int f16312f;
    public final CharSequence h;
    public final long f16313n;
    public final AbstractCollection f16314r;
    public final long f16315s;
    public final Bundle v;
    public PlaybackState f16316w;

    public g0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16308a = i10;
        this.f16309b = j3;
        this.f16310c = j10;
        this.d = f7;
        this.f16311e = j11;
        this.f16312f = i11;
        this.h = charSequence;
        this.f16313n = j12;
        this.f16314r = new ArrayList(arrayList);
        this.f16315s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16308a);
        sb2.append(", position=");
        sb2.append(this.f16309b);
        sb2.append(", buffered position=");
        sb2.append(this.f16310c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16313n);
        sb2.append(", actions=");
        sb2.append(this.f16311e);
        sb2.append(", error code=");
        sb2.append(this.f16312f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16314r);
        sb2.append(", active item id=");
        return a1.g.s(sb2, this.f16315s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16308a);
        parcel.writeLong(this.f16309b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16313n);
        parcel.writeLong(this.f16310c);
        parcel.writeLong(this.f16311e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16314r);
        parcel.writeLong(this.f16315s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16312f);
    }

    public g0(Parcel parcel) {
        this.f16308a = parcel.readInt();
        this.f16309b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16313n = parcel.readLong();
        this.f16310c = parcel.readLong();
        this.f16311e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(f0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = i0.f8749b;
            createTypedArrayList = a1.f8712e;
        }
        this.f16314r = createTypedArrayList;
        this.f16315s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f16312f = parcel.readInt();
    }
}
