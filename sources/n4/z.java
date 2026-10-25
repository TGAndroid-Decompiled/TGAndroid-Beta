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
    public final int f18709a;
    public final long f18710b;
    public final long f18711c;
    public final float d;
    public final long e;
    public final int f18712f;
    public final CharSequence h;
    public final long f18713n;
    public final AbstractCollection f18714r;
    public final long f18715s;
    public final Bundle v;
    public PlaybackState f18716w;

    public z(int i10, long j10, long j11, float f7, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f18709a = i10;
        this.f18710b = j10;
        this.f18711c = j11;
        this.d = f7;
        this.e = j12;
        this.f18712f = i11;
        this.h = charSequence;
        this.f18713n = j13;
        this.f18714r = new ArrayList(arrayList);
        this.f18715s = j14;
        this.v = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f18709a);
        sb2.append(", position=");
        sb2.append(this.f18710b);
        sb2.append(", buffered position=");
        sb2.append(this.f18711c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f18713n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f18712f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f18714r);
        sb2.append(", active item id=");
        return a1.g.r(sb2, this.f18715s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18709a);
        parcel.writeLong(this.f18710b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f18713n);
        parcel.writeLong(this.f18711c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.f18714r);
        parcel.writeLong(this.f18715s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f18712f);
    }

    public z(Parcel parcel) {
        this.f18709a = parcel.readInt();
        this.f18710b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f18713n = parcel.readLong();
        this.f18711c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(y.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f10287b;
            createTypedArrayList = s1.e;
        }
        this.f18714r = createTypedArrayList;
        this.f18715s = parcel.readLong();
        this.v = parcel.readBundle(s.class.getClassLoader());
        this.f18712f = parcel.readInt();
    }
}
