package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
public final class ld0 implements Parcelable {
    public static final Parcelable.Creator<ld0> CREATOR = new g31((byte) 4);
    public final boolean E;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int h;
    public final int n;
    public final CharSequence r;
    public final int s;
    public final CharSequence w;
    public final ArrayList x;
    public final ArrayList y;

    public ld0(kd0 kd0Var) {
        String str;
        int size = kd0Var.a.size();
        this.a = new int[size * 6];
        if (kd0Var.g) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ar4 ar4Var = (ar4) kd0Var.a.get(i2);
                int i3 = i + 1;
                this.a[i] = ar4Var.a;
                ArrayList arrayList = this.b;
                gp4 gp4Var = ar4Var.b;
                if (gp4Var != null) {
                    str = gp4Var.e;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.a;
                iArr[i3] = ar4Var.c ? 1 : 0;
                iArr[i + 2] = ar4Var.d;
                iArr[i + 3] = ar4Var.e;
                int i4 = i + 5;
                iArr[i + 4] = ar4Var.f;
                i += 6;
                iArr[i4] = ar4Var.g;
                this.c[i2] = ar4Var.h.ordinal();
                this.d[i2] = ar4Var.i.ordinal();
            }
            this.e = kd0Var.f;
            this.f = kd0Var.h;
            this.h = kd0Var.s;
            this.n = kd0Var.i;
            this.r = kd0Var.j;
            this.s = kd0Var.k;
            this.w = kd0Var.l;
            this.x = kd0Var.m;
            this.y = kd0Var.n;
            this.E = kd0Var.o;
            return;
        }
        grb.i("Not on back stack");
        throw null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.h);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.r, parcel, 0);
        parcel.writeInt(this.s);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeStringList(this.x);
        parcel.writeStringList(this.y);
        parcel.writeInt(this.E ? 1 : 0);
    }

    public ld0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.h = parcel.readInt();
        this.n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.r = (CharSequence) creator.createFromParcel(parcel);
        this.s = parcel.readInt();
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.x = parcel.createStringArrayList();
        this.y = parcel.createStringArrayList();
        this.E = parcel.readInt() != 0;
    }
}
