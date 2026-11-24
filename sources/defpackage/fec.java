package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fec extends w1 {
    public static final Parcelable.Creator<fec> CREATOR = new v1((byte) 4);
    public int c;
    public Parcelable d;
    public final ClassLoader e;

    public fec(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? fec.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.d = parcel.readParcelable(classLoader);
        this.e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return de9.l(sb, this.c, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
