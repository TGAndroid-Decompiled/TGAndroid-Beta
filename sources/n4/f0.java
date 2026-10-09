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
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(9);
    public final int f16557a;
    public final long f16558b;
    public final long f16559c;
    public final float d;
    public final long f16560e;
    public final int f16561f;
    public final CharSequence h;
    public final long f16562n;
    public final AbstractCollection f16563r;
    public final long f16564s;
    public final Bundle v;
    public PlaybackState f16565w;

    public f0(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f16557a = i10;
        this.f16558b = j3;
        this.f16559c = j10;
        this.d = f7;
        this.f16560e = j11;
        this.f16561f = i11;
        this.h = charSequence;
        this.f16562n = j12;
        this.f16563r = new ArrayList(arrayList);
        this.f16564s = j13;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f16557a);
        sb2.append(", position=");
        sb2.append(this.f16558b);
        sb2.append(", buffered position=");
        sb2.append(this.f16559c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f16562n);
        sb2.append(", actions=");
        sb2.append(this.f16560e);
        sb2.append(", error code=");
        sb2.append(this.f16561f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f16563r);
        sb2.append(", active item id=");
        return a1.g.s(sb2, this.f16564s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16557a);
        parcel.writeLong(this.f16558b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f16562n);
        parcel.writeLong(this.f16559c);
        parcel.writeLong(this.f16560e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f16563r);
        parcel.writeLong(this.f16564s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f16561f);
    }

    public f0(Parcel parcel) {
        this.f16557a = parcel.readInt();
        this.f16558b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f16562n = parcel.readLong();
        this.f16559c = parcel.readLong();
        this.f16560e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(e0.CREATOR);
        if (createTypedArrayList == null) {
            e9.g0 g0Var = i0.f8752b;
            createTypedArrayList = a1.f8715e;
        }
        this.f16563r = createTypedArrayList;
        this.f16564s = parcel.readLong();
        this.v = parcel.readBundle(x.class.getClassLoader());
        this.f16561f = parcel.readInt();
    }
}
