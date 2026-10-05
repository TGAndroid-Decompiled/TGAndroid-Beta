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
    public final int f16594a;
    public final long f16595b;
    public final long f16596c;
    public final float d;
    public final long f16597e;
    public final int f16598f;
    public final CharSequence h;
    public final long f16599n;
    public final AbstractCollection f16600r;
    public final long f16601s;
    public final Bundle v;
    public PlaybackState f16602w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16594a = i10;
        this.f16595b = j3;
        this.f16596c = j10;
        this.d = f7;
        this.f16597e = j11;
        this.f16598f = i11;
        this.h = charSequence;
        this.f16599n = j12;
        this.f16600r = new ArrayList(arrayList);
        this.f16601s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16594a);
        sb2.append(", position=");
        sb2.append(this.f16595b);
        sb2.append(", buffered position=");
        sb2.append(this.f16596c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16599n);
        sb2.append(", actions=");
        sb2.append(this.f16597e);
        sb2.append(", error code=");
        sb2.append(this.f16598f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16600r);
        sb2.append(", active item id=");
        return a4.a.s(sb2, this.f16601s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16594a);
        parcel.writeLong(this.f16595b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16599n);
        parcel.writeLong(this.f16596c);
        parcel.writeLong(this.f16597e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16600r);
        parcel.writeLong(this.f16601s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16598f);
    }

    public h0(Parcel parcel) {
        this.f16594a = parcel.readInt();
        this.f16595b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16599n = parcel.readLong();
        this.f16596c = parcel.readLong();
        this.f16597e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8758b;
            createTypedArrayList = a1.f8721e;
        }
        this.f16600r = createTypedArrayList;
        this.f16601s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f16598f = parcel.readInt();
    }
}
