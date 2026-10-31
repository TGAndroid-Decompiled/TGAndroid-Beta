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
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m8.i(6);
    public final int f13538a;
    public final long f13539b;
    public final long f13540c;
    public final float d;
    public final long e;
    public final int f13541f;
    public final CharSequence h;
    public final long f13542n;
    public final AbstractCollection f13543r;
    public final long f13544s;
    public final Bundle f13545w;
    public PlaybackState f13546x;

    public w(int i10, long j10, long j11, float f7, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f13538a = i10;
        this.f13539b = j10;
        this.f13540c = j11;
        this.d = f7;
        this.e = j12;
        this.f13541f = i11;
        this.h = charSequence;
        this.f13542n = j13;
        this.f13543r = new ArrayList(arrayList);
        this.f13544s = j14;
        this.f13545w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f13538a);
        sb2.append(", position=");
        sb2.append(this.f13539b);
        sb2.append(", buffered position=");
        sb2.append(this.f13540c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f13542n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f13541f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f13543r);
        sb2.append(", active item id=");
        return a1.g.q(sb2, this.f13544s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13538a);
        parcel.writeLong(this.f13539b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f13542n);
        parcel.writeLong(this.f13540c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f13543r);
        parcel.writeLong(this.f13544s);
        parcel.writeBundle(this.f13545w);
        parcel.writeInt(this.f13541f);
    }

    public w(Parcel parcel) {
        this.f13538a = parcel.readInt();
        this.f13539b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f13542n = parcel.readLong();
        this.f13540c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            l0 l0Var = n0.f6390b;
            createTypedArrayList = x1.e;
        }
        this.f13543r = createTypedArrayList;
        this.f13544s = parcel.readLong();
        this.f13545w = parcel.readBundle(q.class.getClassLoader());
        this.f13541f = parcel.readInt();
    }
}
