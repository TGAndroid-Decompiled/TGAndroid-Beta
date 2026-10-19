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
    public final int f17139a;
    public final long f17140b;
    public final long f17141c;
    public final float d;
    public final long e;
    public final int f17142f;
    public final CharSequence h;
    public final long f17143n;
    public final AbstractCollection f17144r;
    public final long f17145s;
    public final Bundle v;
    public PlaybackState f17146w;

    public y(int i10, long j10, long j11, float f7, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f17139a = i10;
        this.f17140b = j10;
        this.f17141c = j11;
        this.d = f7;
        this.e = j12;
        this.f17142f = i11;
        this.h = charSequence;
        this.f17143n = j13;
        this.f17144r = new ArrayList(arrayList);
        this.f17145s = j14;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f17139a);
        sb2.append(", position=");
        sb2.append(this.f17140b);
        sb2.append(", buffered position=");
        sb2.append(this.f17141c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f17143n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f17142f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f17144r);
        sb2.append(", active item id=");
        return a1.g.r(sb2, this.f17145s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17139a);
        parcel.writeLong(this.f17140b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f17143n);
        parcel.writeLong(this.f17141c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f17144r);
        parcel.writeLong(this.f17145s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f17142f);
    }

    public y(Parcel parcel) {
        this.f17139a = parcel.readInt();
        this.f17140b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f17143n = parcel.readLong();
        this.f17141c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(x.CREATOR);
        if (createTypedArrayList == null) {
            l0 l0Var = n0.f8476b;
            createTypedArrayList = x1.e;
        }
        this.f17144r = createTypedArrayList;
        this.f17145s = parcel.readLong();
        this.v = parcel.readBundle(s.class.getClassLoader());
        this.f17142f = parcel.readInt();
    }
}
