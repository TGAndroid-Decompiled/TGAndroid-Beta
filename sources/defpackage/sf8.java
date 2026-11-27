package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
public final class sf8 implements Parcelable {
    public static final Parcelable.Creator<sf8> CREATOR = new mx6((byte) 9);
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence h;
    public final long n;
    public final List r;
    public final long s;
    public final Bundle w;
    public PlaybackState x;

    public sf8(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.n = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List createTypedArrayList = parcel.createTypedArrayList(rf8.CREATOR);
        if (createTypedArrayList == null) {
            no5 no5Var = po5.b;
            createTypedArrayList = j99.e;
        }
        this.r = createTypedArrayList;
        this.s = parcel.readLong();
        this.w = parcel.readBundle(qx6.class.getClassLoader());
        this.f = parcel.readInt();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.n);
        sb.append(", actions=");
        sb.append(this.e);
        sb.append(", error code=");
        sb.append(this.f);
        sb.append(", error message=");
        sb.append(this.h);
        sb.append(", custom actions=");
        sb.append(this.r);
        sb.append(", active item id=");
        return qu6.p(sb, this.s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.n);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i);
        parcel.writeTypedList(this.r);
        parcel.writeLong(this.s);
        parcel.writeBundle(this.w);
        parcel.writeInt(this.f);
    }

    public sf8(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.h = charSequence;
        this.n = j4;
        this.r = new ArrayList(arrayList);
        this.s = j5;
        this.w = bundle;
    }
}
