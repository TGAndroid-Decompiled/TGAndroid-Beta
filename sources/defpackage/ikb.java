package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class ikb extends c4 {
    public static final Parcelable.Creator<ikb> CREATOR = new s5d((byte) 0);
    public final int a;
    public List b;

    public ikb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.p(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
