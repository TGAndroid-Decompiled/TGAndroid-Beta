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
    public final int f16441a;
    public final long f16442b;
    public final long f16443c;
    public final float d;
    public final long f16444e;
    public final int f16445f;
    public final CharSequence h;
    public final long f16446n;
    public final AbstractCollection f16447r;
    public final long f16448s;
    public final Bundle v;
    public PlaybackState f16449w;

    public h0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16441a = i10;
        this.f16442b = j3;
        this.f16443c = j10;
        this.d = f7;
        this.f16444e = j11;
        this.f16445f = i11;
        this.h = charSequence;
        this.f16446n = j12;
        this.f16447r = new ArrayList(arrayList);
        this.f16448s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16441a);
        sb2.append(", position=");
        sb2.append(this.f16442b);
        sb2.append(", buffered position=");
        sb2.append(this.f16443c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16446n);
        sb2.append(", actions=");
        sb2.append(this.f16444e);
        sb2.append(", error code=");
        sb2.append(this.f16445f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16447r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.f16448s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16441a);
        parcel.writeLong(this.f16442b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16446n);
        parcel.writeLong(this.f16443c);
        parcel.writeLong(this.f16444e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16447r);
        parcel.writeLong(this.f16448s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16445f);
    }

    public h0(Parcel parcel) {
        this.f16441a = parcel.readInt();
        this.f16442b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16446n = parcel.readLong();
        this.f16443c = parcel.readLong();
        this.f16444e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(g0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = e9.i0.f8957b;
            createTypedArrayList = a1.f8920e;
        }
        this.f16447r = createTypedArrayList;
        this.f16448s = parcel.readLong();
        this.v = parcel.readBundle(y.class.getClassLoader());
        this.f16445f = parcel.readInt();
    }
}
