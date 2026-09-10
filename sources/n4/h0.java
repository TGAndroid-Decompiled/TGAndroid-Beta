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
    public final int f13774a;
    public final long f13775b;
    public final long f13776c;
    public final float d;
    public final long e;
    public final int f13777f;
    public final CharSequence h;
    public final long f13778n;
    public final AbstractCollection f13779r;
    public final long f13780s;
    public final Bundle v;
    public PlaybackState f13781w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f13774a = i10;
        this.f13775b = j3;
        this.f13776c = j10;
        this.d = f7;
        this.e = j11;
        this.f13777f = i11;
        this.h = charSequence;
        this.f13778n = j12;
        this.f13779r = new ArrayList(arrayList);
        this.f13780s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f13774a);
        sb2.append(", position=");
        sb2.append(this.f13775b);
        sb2.append(", buffered position=");
        sb2.append(this.f13776c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f13778n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f13777f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f13779r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.f13780s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13774a);
        parcel.writeLong(this.f13775b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f13778n);
        parcel.writeLong(this.f13776c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f13779r);
        parcel.writeLong(this.f13780s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f13777f);
    }

    public h0(Parcel parcel) {
        this.f13774a = parcel.readInt();
        this.f13775b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f13778n = parcel.readLong();
        this.f13776c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f7384b;
            createTypedArrayList = a1.e;
        }
        this.f13779r = createTypedArrayList;
        this.f13780s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f13777f = parcel.readInt();
    }
}
