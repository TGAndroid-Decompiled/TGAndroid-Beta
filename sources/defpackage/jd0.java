package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
public final class jd0 implements Parcelable {
    public static final Parcelable.Creator<jd0> CREATOR = new x21((byte) 4);
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

    public jd0(id0 id0Var) {
        String str;
        int size = id0Var.a.size();
        this.a = new int[size * 6];
        if (id0Var.g) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                wo4 wo4Var = (wo4) id0Var.a.get(i2);
                int i3 = i + 1;
                this.a[i] = wo4Var.a;
                ArrayList arrayList = this.b;
                bn4 bn4Var = wo4Var.b;
                if (bn4Var != null) {
                    str = bn4Var.e;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.a;
                iArr[i3] = wo4Var.c ? 1 : 0;
                iArr[i + 2] = wo4Var.d;
                iArr[i + 3] = wo4Var.e;
                int i4 = i + 5;
                iArr[i + 4] = wo4Var.f;
                i += 6;
                iArr[i4] = wo4Var.g;
                this.c[i2] = wo4Var.h.ordinal();
                this.d[i2] = wo4Var.i.ordinal();
            }
            this.e = id0Var.f;
            this.f = id0Var.h;
            this.h = id0Var.s;
            this.n = id0Var.i;
            this.r = id0Var.j;
            this.s = id0Var.k;
            this.w = id0Var.l;
            this.x = id0Var.m;
            this.y = id0Var.n;
            this.E = id0Var.o;
            return;
        }
        sc8.j("Not on back stack");
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

    public jd0(Parcel parcel) {
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
