package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
public final class je0 implements Parcelable {
    public static final Parcelable.Creator<je0> CREATOR = new f41((byte) 4);
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

    public je0(ie0 ie0Var) {
        String str;
        int size = ie0Var.a.size();
        this.a = new int[size * 6];
        if (ie0Var.g) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                xq4 xq4Var = (xq4) ie0Var.a.get(i2);
                int i3 = i + 1;
                this.a[i] = xq4Var.a;
                ArrayList arrayList = this.b;
                dp4 dp4Var = xq4Var.b;
                if (dp4Var != null) {
                    str = dp4Var.e;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.a;
                iArr[i3] = xq4Var.c ? 1 : 0;
                iArr[i + 2] = xq4Var.d;
                iArr[i + 3] = xq4Var.e;
                int i4 = i + 5;
                iArr[i + 4] = xq4Var.f;
                i += 6;
                iArr[i4] = xq4Var.g;
                this.c[i2] = xq4Var.h.ordinal();
                this.d[i2] = xq4Var.i.ordinal();
            }
            this.e = ie0Var.f;
            this.f = ie0Var.h;
            this.h = ie0Var.s;
            this.n = ie0Var.i;
            this.r = ie0Var.j;
            this.s = ie0Var.k;
            this.w = ie0Var.l;
            this.x = ie0Var.m;
            this.y = ie0Var.n;
            this.E = ie0Var.o;
            return;
        }
        dq9.m("Not on back stack");
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

    public je0(Parcel parcel) {
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
