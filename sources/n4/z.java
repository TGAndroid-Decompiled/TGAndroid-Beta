package n4;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new x(0);
    public final int f18708a;
    public final long f18709b;
    public final long f18710c;
    public final float d;
    public final long e;
    public final int f18711f;
    public final CharSequence h;
    public final long f18712n;
    public final AbstractCollection f18713r;
    public final long f18714s;
    public final Bundle v;
    public PlaybackState f18715w;

    public z(int i10, long j10, long j11, float f7, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f18708a = i10;
        this.f18709b = j10;
        this.f18710c = j11;
        this.d = f7;
        this.e = j12;
        this.f18711f = i11;
        this.h = charSequence;
        this.f18712n = j13;
        this.f18713r = new ArrayList(arrayList);
        this.f18714s = j14;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f18708a);
        sb2.append(", position=");
        sb2.append(this.f18709b);
        sb2.append(", buffered position=");
        sb2.append(this.f18710c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f18712n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f18711f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f18713r);
        sb2.append(", active item id=");
        return a1.g.r(sb2, this.f18714s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18708a);
        parcel.writeLong(this.f18709b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f18712n);
        parcel.writeLong(this.f18710c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f18713r);
        parcel.writeLong(this.f18714s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f18711f);
    }

    public z(Parcel parcel) {
        this.f18708a = parcel.readInt();
        this.f18709b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f18712n = parcel.readLong();
        this.f18710c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(y.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f10286b;
            createTypedArrayList = s1.e;
        }
        this.f18713r = createTypedArrayList;
        this.f18714s = parcel.readLong();
        this.v = parcel.readBundle(s.class.getClassLoader());
        this.f18711f = parcel.readInt();
    }
}
